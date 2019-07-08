<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
			<meta charset="ISO-8859-1">
			<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Save Patient</title>		
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/app.css"/>
 
</head>
<body>


	    <nav  class="navbar navbar-expand-md navbar-dark bg-dark mb-2">

            <a href="welcome" class="navbar-brand">
            
            	<img src="${pageContext.request.contextPath}/resources/images/exp.png" width="40" height="40" alt="Expert Opinion">

                <h5 class="text-light mx-1 d-inline-block"><strong>Expert Opinion</strong></h5>

            </a>

            <button class="navbar-toggler" data-toggle="collapse" data-target="#mainNavbar">

                <span class="navbar-toggler-icon"></span>

            </button>

        <div class="collapse navbar-collapse" id="mainNavbar" >

            <ul class="navbar-nav ml-auto">

                <li class="nav-item">

                    <a href="welcome" class="nav-link text-light">Home</a>

                </li>

                <li class="nav-item">

                    <a href="#about" class="nav-link text-light">About Us</a>

                </li>

                <li class="nav-item">

                    <a href="#footer" class="nav-link text-light">Contact Us</a>

                </li>

            </ul>

        </div>

    </nav> 
	
	<div class="container offset-0 col-12 offset-sm-1 col-sm-10 offset-lg-2 col-lg-8 border my-2">
	
		<h4 class="offset-sm-1 col-sm-10 offset-md-2 col-md-8 d-flex justify-content-center border my-2"> Save Radiology Center</h4>
		
		<form:form action="saveRadiologyCenter" modelAttribute="radiologyCenter" method="POST">
			
			 <form:hidden path="id"/>
		 <p class="text-primary">We provide an important service for medical facilities across the globe due to shortage of subspecialized physicians. For example,
		  there is a severe shortage of musculoskeletal radiologists, physicians trained to interpret MRIs of the bones and joints.	</p>
		 <p class="d-flex justify-content-left mt-lg-4 mt-md-2 text-secondary mb-4">Fill out the form. Asterisk (*) means required.</p>
		
			 <table class="offset-md-1 col-md-10">
				  <tbody>
					   <tr>
						  	<td> <label>Name*</label> </td>
						  	<td> <form:input path="name" class="form-control" /> </td>
						  	<td> <form:errors path="name" cssClass="error text-danger ml-2"/> </td>
				   	   </tr>
					   
					   <tr>
					  		<td> <label>Address*</label> </td>
					  		<td> <form:input path="address" class="form-control mt-2"/></td>
					  		<td> <form:errors path="address" cssClass="error text-danger ml-2"/> </td>
					   </tr>
					  
					  <tr>
					  		<td> <label>Organization*</label> </td>
					  		<td> <form:input path="organization" class="form-control mt-2"/></td>
					  		<td> <form:errors path="organization" cssClass="error text-danger ml-2"/> </td>
					   </tr>
					  
					   <tr>
					  		<td> <label>Phone*</label> </td>
					  		<td> <form:input path="phoneNumber" class="form-control mt-2"/></td>
					  		<td> <form:errors path="phoneNumber" cssClass="error text-danger ml-2"/> </td>
					   </tr>
					   
					   <tr>
					  		<td> <label>Email*</label> </td>
					  		<td> <form:input path="mail" placeholder="example@example.com" class="form-control mt-2"/></td>
					  		<td> <form:errors path="mail" cssClass="error text-danger ml-2"/> </td>
					   </tr>
					  
					   <tr>
						  	<td><label>Password*</label> </td>
						  	<td><form:password path="password" class="form-control mt-2" /></td>
						  	<td><form:errors path="password" cssClass="error text-danger ml-2"/></td>	
					   </tr>
					   
					   <tr>
						  	<td><label>Confirm password*</label> </td>
						  	<td><form:password path="confirmPassword" class="form-control mt-2" /></td>
						  	<td><form:errors path="confirmPassword" cssClass="error text-danger ml-2"/></td>	
					   </tr>
					   
					   <tr>
						  	<td> <label>Comment</label> </td>
						  	<td> <form:textarea  path="comment" rows="5" column="100" class="form-control mt-2"/> </td>
					   </tr>

		
						<tr>
							<td><label></label></td>
							<td><button type="submit" class="btn btn-secondary mt-3 mb-2">submit</button><td>
						</tr>
			
				  </tbody>	 
			 </table>
			 
		</form:form>
		

		
			<p>
				<a class="btn btn-outline-primary" href="${pageContext.request.contextPath}/home/welcome">Back to Home</a>
			</p>
		
	</div>
	
					  <section class="bg-dark py-3">

        <div class="container text-white text-center">

            <p class="lead">Join our mail service to be up to date with new offers!</p>

            <div class="row justify-content center">

                <div class="col-12 col-sm-10 col-md-6 col-lg-4 offset-sm-1 offset-md-3 offset-lg-4">

                    <div class="input-group">

                        <input type="text" name="" id="" class="form-control" placeholder="youremail@example.com">

                        <div class="input-group-append">

                            <button class="btn btn-primary">Join Now!</button>

                        </div>

                    </div>

                </div>

            </div>
            
        </div>

    </section>
		
		
		  <section id="footer" class="bg-secondary d-flex justify-content-center">

        <ul class="nav text-center flex-column flex-sm-row">

            <li class="nav-item">

                <a href="#" class="nav-link text-light">FAQ</a>

            </li>

            <li class="nav-item ">

                    <a href="#" class="nav-link text-light">Contact Us</a>
    
            </li>

            <li class="nav-item">

                    <a href="#" class="nav-link text-light" data-toggle="modal" data-target="#bookingModal">Register</a>
    
            </li>

        </ul>
        
    </section>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>			
</body>
</html>