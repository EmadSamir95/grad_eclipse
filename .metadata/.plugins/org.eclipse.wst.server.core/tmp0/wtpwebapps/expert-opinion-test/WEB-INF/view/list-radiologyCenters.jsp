<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List RadiologyCenter</title>
<link type="text/Css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

 <div id="wrapper">
 	<div id="header">
 				<h2>RRM - RadiologyCenter Relationship Manager</h2>
 	</div>
 </div>
	
	<div id="container">
		<div id="content"></div>
			 <input type="button" value="add"
			  onclick="window.location.href='showFormForAdd'; return false"
			  class="add-button">
		  
		  
			  <table>
			  	<tr>
					 <th>Name</th>
					 <th>Password</th>
					 <th>Mail</th>
					 <th>Action</th>
		  		<tr>
		  		
		  		<c:forEach var="tempRadiologyCenter" items="${radiologyCenters}">
		  		
		  			
		  			<c:url var="updateLink" value="/radiologyCenter/showFormForUpdate">
		  				<c:param name="radiologyCenterId" value="${tempRadiologyCenter.id}" />
		  			</c:url>
		  					  			
		  			<c:url var="deleteLink" value="/radiologyCenter/delete">
		  				<c:param name="radiologyCenterId" value="${tempRadiologyCenter.id}" />
		  			</c:url>
		  			
		  			<tr>
						 <td>${tempRadiologyCenter.name}</td>
						 <td>${tempRadiologyCenter.password}</td>
						 <td>${tempRadiologyCenter.mail}</td>	  			
			  			
			  			<td>
			  			<a href="${updateLink}">Update</a>
			  			|
			  			<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
		  				</td>
		  			</tr>
		  		</c:forEach>
			  </table>
	</div>
</body>
</html>