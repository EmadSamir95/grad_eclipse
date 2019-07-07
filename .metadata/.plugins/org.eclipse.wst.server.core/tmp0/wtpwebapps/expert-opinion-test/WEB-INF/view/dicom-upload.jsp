<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>File Upload</title>
	</head>
	<body>
		
		<h2>Spring REST Demo</h2>
		
		
		<div>
			<form:form action="fileUpload" method="post" >
			    <input type="file" name="file" id="fileToUpload" >
			    <input type="submit" name="import_file" value="Import File" id="" />
			</form:form>
		</div> 
		
		<p>
			<a href="${pageContext.request.contextPath}/home/welcome">Back to List</a>
		</p>
	</body>
</html>















