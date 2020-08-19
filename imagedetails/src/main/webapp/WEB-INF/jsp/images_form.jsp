<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Image Form</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/saveImage" var="saveURL" />
  <br><br><h3>Image Form</h3><br>
  <form:form modelAttribute="imagesForm" method="post" action="${saveURL }" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>Image Name</label><span class="required" style="color:red;">*</span>
    <form:input path="imageNames" cssClass="form-control" id="imageNames" required="required"/>
   </div>
   <div class="form-group">
    <label>Image Trax</label><span class="required" style="color:red;">*</span>
    <form:input path="imageTrax" cssClass="form-control" id="imageTrax" required="required"/>
   </div>
     <div class="form-group">
    <label>Image Description</label><span class="required" style="color:red;">*</span>
    <form:textarea path="imageDescription" cssClass="form-control" id="imageTrax" required="required"/>
   </div>
     <div class="form-group">
    <label>Relative Image</label><span class="required" style="color:red;">*</span>
    <form:textarea path="relativeImage" cssClass="form-control" id="imageTrax" required="required"/>
   </div>
   <button type="submit" class="btn btn-primary">Save</button>
  </form:form>
 </div>
</body>
</html>