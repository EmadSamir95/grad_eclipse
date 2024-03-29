<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>List Doctors</title>
	<link type="text/Css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" /> 
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>DRM - Doctor Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
	
		<!--  add a search box -->
            <form:form action="search" method="POST">
                Search Doctor: <input type="text" name="theSearchName" />
                
                <input type="submit" value="Search" class="add-button" />
            </form:form>	
	
				<table>
					<tbody>
					   <tr>
						 <th>first Name</th>
						 <th>Last Name</th>
						 <th>Age</th>					 
						 <th>specialist</th>
						 <th>Password</th>
						 <th>Mail</th>
						 <th>Action</th>
					   </tr>
					   
					   <c:forEach var="tempDoctor" items="${doctors}">
					   	
					   	<c:url var="updateLink" value="/doctor/showFormForUpdate">
					   		<c:param name="doctorId" value="${tempDoctor.id}"/>
					   	</c:url>
					   	
					   	
					   	<c:url var="deleteLink" value="/doctor/delete">
					   		<c:param name="doctorId" value="${tempDoctor.id}"/>
					   	</c:url>
					   	
					   	<tr>
					   	 <td>${tempDoctor.firstName}</td>
					   	 <td>${tempDoctor.lastName}</td>
					   	 <td>${tempDoctor.age}</td>
					   	 <td>${tempDoctor.specialist}</td>
					   	 <td>${tempDoctor.password}</td>
					   	 <td>${tempDoctor.mail}</td>
					   	 
					<security:authorize access="hasAnyRole('ADMIN')">
					   	 <td> 
					   	 	<a href="${updateLink}"> Update</a>
							|
					   	 	<a href="${deleteLink}"
						  	   onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
					   	 </td>
					</security:authorize>
					   	 
					   	</tr>
					   </c:forEach>
					</tbody>				
				</table>
		</div>
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout" 
			   method="POST">
	
		<input type="submit" value="Logout" class="add-button" />
	</form:form>

	</div>
</body>
</html>