<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>add-Student Details</title>
	</head>
	<body>
		<div class="form-container">
        <h2>Student Marks Form</h2>
        <form action="addDetails" method="post">
            <div class="form-group">
                <label for="sno">S.No:</label>
                <input type="number" id="sno" name="sno" required>
            </div>

            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>
            </div>

            <div class="form-group">
                <label for="english">English:</label>
                <input type="number" id="english" name="english" min="0" max="100" required>
            </div>

            <div class="form-group">
                <label for="maths">Maths:</label>
                <input type="number" id="maths" name="maths" min="0" max="100" required>
            </div>

            <div class="form-group">
                <label for="science">Science:</label>
                <input type="number" id="science" name="science" min="0" max="100" required>
            </div>

            <div class="form-group">
                <label for="social">Social:</label>
                <input type="number" id="social" name="social" min="0" max="100" required>
            </div>

            <button type="submit" class="submit-button">Submit</button>
        </form>
    </div>
	</body>
</html>
<style>
	body {
		font-family: Arial, sans-serif;
		background-color: #f0f0f0;
		display: flex;
		justify-content: center;
		align-items: center;
		height: 100vh;
		margin: 0;
	}
	.form-container {
		background-color: white;
		padding: 20px 30px;
		border-radius: 10px;
		box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
		width: 400px;
	}
	.form-container h2 {
		text-align: center;
		color: #007BFF;
		margin-bottom: 20px;
	}
	.form-group {
		margin-bottom: 15px;
	}
	.form-group label {
		display: block;
		font-weight: bold;
		margin-bottom: 5px;
		color: #333;
	}
	.form-group input {
		width: 100%;
		padding: 10px;
		border: 1px solid #ccc;
		border-radius: 5px;
		font-size: 14px;
	}
	.form-group input:focus {
		border-color: #007BFF;
		outline: none;
	}
	.submit-button {
		background-color: #28a745;
		color: white;
		border: none;
		padding: 12px;
		width: 100%;
		border-radius: 5px;
		font-size: 16px;
		cursor: pointer;
	}
	.submit-button:hover {
		background-color: #218838;
	}
</style>