<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
</head>


<body>
	<div align="center">
		<h1>Love Calculator</h1>
		
			<form:form action="process-register" method="get" modelAttribute="reg">
				<p>
				<label id="uname" for="name">Name :</label>
				<form:input path="name"/>
		</p>
		<p>
		<label id="username" for="uname">Username: </label>
		<form:input  path="username" />
		</p>
		<P>
		<label id="password" for="pwd">Password : </label>
		<form:input path="pwd" />
		</p>

		<p>
			<label id="country">Country : </label>
			<form:select path="country">
				<form:option value="null"> </form:option>
				<form:option value="India">India </form:option>
				<form:option value="USA" >USA </form:option>
			</form:select>
		</p>
		
		</p>
		<label path ="hobby" >Hobby : </label> 
		<form:checkbox path ="hobby" value="cricket"/>
		<label id ="cricket"> cricket </label>
		<form:checkbox  path="hobby"
			value="reading" />
		<label id="reading"> reading </label>
		<form:checkbox  path="hobby" value="travel" />
		<label id="travel"> travel </label>
		<form:checkbox  path="hobby"
			value="programming" />
		<label id="programming"> programming </label>
		
		<p>
			<label id="gen" path="gender">Gender:</label>
		<form:radiobutton path="gender" value="male"/>
		<label> Male </label>
		<form:radiobutton path="gender" value="female" />
		<label> Female </label>
		</p>
		<p>
			<input type="Submit" value="Register">
		</p>
		</form:form>
	</div>

	</p>
</body>


</html>