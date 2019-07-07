<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
		  
	<script src="${pageContext.request.contextPath}/../resources/javascript/script.js"></script>
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Expert Opinion</h2>
		</div>
	</div>
	<div id="container">
		
		<div style="margin:10px">
	        <a href="patientLogin" class="add-button">Login</a>
	    </div>
		
		<div class="dropdown">
		<button onclick="myFunction()" class="dropbtn">Register</button>
			<div id="myDropdown" class="dropdown-content">
				<a href="patientFormForAdd" class="add-button">As Patient</a>
				<a href="doctorFormForAdd" class="add-button">As Doctor</a>
				<a href="radiologyCenterFormForAdd" class="add-button">As Radiology Center</a>
			</div>
		  
		</div>

	</div>
</body>
<script>
function myFunction() {
	  document.getElementById("myDropdown").classList.toggle("show");
	}

	// Close the dropdown if the user clicks outside of it
	window.onclick = function(event) {
	  if (!event.target.matches('.dropbtn')) {
	    var dropdowns = document.getElementsByClassName("dropdown-content");
	    var i;
	    for (i = 0; i < dropdowns.length; i++) {
	      var openDropdown = dropdowns[i];
	      if (openDropdown.classList.contains('show')) {
	        openDropdown.classList.remove('show');
	      }
	    }
	  }
	}

</script>
</html>
