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
			<h2>DICOM Images</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
				
				<table>
					<tbody>
					   <tr>
						 <th>Patient name</th>
						 <th>Patient birthday</th>
						 <th>Patient sex</th>
						 <th>Study date</th>
						 <th>Study description</th>
						 <th>Study time</th>
						 <th>Manufacture</th>
						 <th>Modality</th>
						 <th>Action</th>
					   </tr>
					   
					   <c:forEach var="tempInstance" items="${instances}">
					   	
					   	<c:url var="view" value="http://localhost:8042/osimis-viewer/app/index.html?study=">
					   	</c:url>
					   	
					   	<tr>
					   	 <td>${tempInstance.patientName}</td>
					   	 <td>${tempInstance.patientBirthDate}</td>
					   	 <td>${tempInstance.patientSex}</td>
					   	 <td>${tempInstance.studyDate}</td>
					   	 <td>${tempInstance.studyDescription}</td>
					   	 <td>${tempInstance.studyTime}</td>
					   	 <td>${tempInstance.manufacturer}</td>
					   	 <td>${tempInstance.modality}</td>
					   	 
					   	 <td> 
					   	 	<a target="_blank" href="${view}${tempInstance.parentStudy}">View</a>
					   	 </td>
					   	</tr>
					   </c:forEach>
					</tbody>				
				</table>
		</div>
	</div>
	
	<p>
		<a href="${pageContext.request.contextPath}/home/welcome">Back to List</a>
	</p>
	
	
</body>
</html>