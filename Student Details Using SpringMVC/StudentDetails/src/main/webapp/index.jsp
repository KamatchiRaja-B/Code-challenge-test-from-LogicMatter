<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home page</title>
	</head>
	<body>
		<a href="empList" class="button">Start the application</a>
	</body>
</html>

<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
	background-color: #f0f0f0;
}

.button {
	display: inline-block;
	padding: 10px 20px;
	font-size: 16px;
	color: white;
	background-color: #007BFF;
	text-decoration: none;
	border-radius: 5px;
	border: none;
	cursor: pointer;
	transition: background-color 0.3s;
}

.button:hover {
	background-color: #0056b3;
}
</style>