<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Save Patient</title>
			  
		<style>
			.error {color:red}
		</style>
		
		<link type="text/css"
			  rel="stylesheet"
			  href="${pageContext.request.contextPath}/resources/css/style.css">
				  
		<link type="text/css"
			  rel="stylesheet"
			  href="${pageContext.request.contextPath}/resources/css/add-patient-style.css">	  		
	
	</head>
	<body>
	
	
		<div id="wrapper">
			<div id="header">
				<h2>Login</h2>
			</div>
		</div>
		
		<div id="container">
			<form:form action ="processPatientLogin" modelAttribute="log" method="POST">
				
				<table>
					  <tbody>
						   <tr>
							  	<td> <label>Email</label></td>
							  	<td> <form:input path="mail"/></td>
							  	<td><form:errors path="mail" cssClass="error"/></td>
					   	   </tr>
						   
						   <tr>
							  	<td><label>Password</label> </td>
							  	<td><form:password path="password" /></td>
							  	<td><form:errors path="password" cssClass="error"/></td>	
						   </tr>
						   
						   <tr>
								<td><label></label></td>
								<td><input type="submit" value="Login" class="save" /></td>
						   </tr>
						
					  </tbody>
					 
				 </table>
	
	        </form:form>
		
		</div>
		<div style="clear; both;"></div>
			
			<p>
				<a href="${pageContext.request.contextPath}/home/welcome">Back to List</a>
			</p>
	</body>
</html>