<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>List Patients</title>
	<link type="text/Css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>PRM - Patient Relationship Manager</h2>
		</div>
	</div>
	
	
	
	<div id="container">
		<div id="content">
			<input type="button" value="add Patient"
			onclick="window.location.href='showFormForAdd'; return false"
			class = "add-button">
		
		<table>
			<tbody>
				<tr> 
					 <th>first Name</th>
					 <th>Last Name</th>
					 <th>Age</th>
					 <th>Password</th>
					 <th>Mail</th>
					 <th>Action</th>
				</tr>
					<c:forEach var="tempPatient" items="${patients}">
					
				  	<!-- construct an "update" link with customer id -->
						<c:url var="updateLink" value="/patient/showFormForUpdate">
							 <c:param name="patientId" value="${tempPatient.id}"/>
						</c:url>
						
				  	<!-- construct an "delete" link with customer id -->
						<c:url var="deleteLink" value="/patient/delete">
							<c:param name="patientId" value="${tempPatient.id }" />
						</c:url>
						
					<tr>
					 <td>${tempPatient.firstName}</td>
					 <td>${tempPatient.lastName}</td>
					 <td>${tempPatient.age}</td>
					 <td>${tempPatient.password}</td>
					 <td>${tempPatient.mail}</td>					 					 
					 <td> 
					  <a href="${updateLink}">Update</a>
					  	|
						<a href="${deleteLink}"
						   onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
					 </td>
					</tr>	
											
					
					</c:forEach>
				</tbody>
			</table>
		</div>	
	</div>
</body>
</html>