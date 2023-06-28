<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>homepage</title>

</head>
<body>
<h1 align = "center">Love Calculator </h1>
<hr>
<form:form action ="process-homepage" method ="get" modelAttribute ="uinform" >
<div align ="center">
<p>
<label id = " Name" for="name">Your Name  :  </label>
<form:input type = "text" path ="username" id ="name" />
</p>

<p>
<label for="cname"> Crush Name :  </label>
<form:input type="text"  path ="crushname" id= "cname"/>
<p>

<input type  ="submit" value ="calculate"/> 
</div>
</form:form>
</body>
</html>