<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration-processed</title>
</head>
<body>
<h1> Love Calculator</h1>
<p>
Name : ${reg.name}
</p>
<p>
Username : - ${reg.username}
</p>
<p>
Password :- ${reg.pwd}
</p>
<p>
Country :- ${reg.country}
</p>
<p>

Hobby :- 
<c:forEach var = "temp" items ="${reg.hobby}">
${temp} 
</c:forEach>
</p>
<p>
Gender :- ${reg.gender}
</p>
</body>
</html>