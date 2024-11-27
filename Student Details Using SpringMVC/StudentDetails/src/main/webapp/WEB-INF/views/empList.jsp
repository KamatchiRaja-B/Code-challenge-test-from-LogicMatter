<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Student details</title>
	</head>
	<body>
		<div class="container">
	        <a href="addDetails" class="add-button">Add Details</a>
	        <table>
	            <thead>
	                <tr>
	                    <th>S No</th>
	                    <th>Name</th>
	                    <th>English</th>
	                    <th>Maths</th>
	                    <th>Science</th>
	                    <th>Social</th>
	                    <th>Actions</th>
	                </tr>
	            </thead>
	            <tbody>
	            	<c:forEach var="s" items="${allStudents}">
					    <tr>
					        <td>${s.sNo }</td>
					        <td>${s.name }</td>
					        <td>${s.english }</td>
					        <td>${s.maths }</td>
					        <td>${s.science }</td>
					        <td>${s.social }</td>
					        <td>
					            <a href="editDetails?sno=${s.sNo}" class="btn edit-btn">Edit</a>
					            <a href="deleteDetail?sno=${s.sNo}" class="btn delete-btn">Delete</a>
					        </td>
					    </tr>
					</c:forEach>
					<c:if test="${empty allStudents}">
					    <p>No students found.</p>
					</c:if>
	            </tbody>
	        </table>
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
	flex-direction: column;
}

.container {
	width: 80%;
}

.add-button {
	display: inline-block;
	padding: 10px 20px;
	font-size: 14px;
	color: white;
	background-color: #28a745;
	text-decoration: none;
	border-radius: 5px;
	cursor: pointer;
	float: right;
	margin-bottom: 10px;
}

.add-button:hover {
	background-color: #218838;
}

table {
	width: 100%;
	border-collapse: collapse;
	background-color: white;
}

th, td {
	border: 1px solid #ccc;
	padding: 12px;
	text-align: center;
}

th {
	background-color: #007BFF;
	color: white;
}

.btn {
	padding: 6px 12px;
	font-size: 12px;
	color: white;
	text-decoration: none;
	border-radius: 4px;
	margin: 2px;
	display: inline-block;
}

.edit-btn {
	background-color: #17a2b8;
}

.edit-btn:hover {
	background-color: #138496;
}

.delete-btn {
	background-color: #dc3545;
}

.delete-btn:hover {
	background-color: #c82333;
}
</style>