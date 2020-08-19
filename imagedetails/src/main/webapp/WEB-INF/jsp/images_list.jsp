<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Image Details</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <br><br><h3>Image Details</h3><br>
  <table class="table table-striped" style="width:100%">
   <thead class="thead-dark">
    <th scope="row">Image Name</th>
    <th scope="row">Image Trax</th>
    <th scope="row">Image Description</th>
    <th scope="row">Relative Image</th>
    <th scope="row">Update</th>
    <th scope="row">Delete</th>
   </thead>
   <tbody style="overflow-wrap:anywhere;">
    <c:forEach items="${imagesList}" var="imagesList" >
     <tr>
      <td>${imagesList.imageNames }</td>
      <td>${imagesList.imageTrax }</td>
      <td>${imagesList.imageDescription }</td>
      <td>${imagesList.relativeImage }</td>
      
       <td>
       <spring:url value="/updateImage/${imagesList.id}" var="updateURL" />
       <a class="btn btn-primary" href="${updateURL }" role="button" ><i class="material-icons">mode_edit</i></a>
      </td>
      <td>
       <spring:url value="/deleteImage/${imagesList.id }" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL }" role="button" ><i class="material-icons">delete</i></a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <spring:url value="/addImage" var="addURL" />
  <a class="btn btn-primary" href="${addURL }" role="button" >Add New Image</a>
 </div>
</body>
</html>