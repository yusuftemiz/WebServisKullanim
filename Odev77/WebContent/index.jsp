<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="padding-left:50px;font-family:monospace;">
			CRUD Operations</br></br>
		<a href="${pageContext.request.contextPath}/create.jsp">
			<div style="color:saffron">Create User</div></a></br></br>
		<a href="${pageContext.request.contextPath}/rest/users">
			<div style="color:saffron">Get User details</div></a></br></br>
		<a href="${pageContext.request.contextPath}/update.jsp">
			<div style="color:saffron">Update User</div></a></br></br>
		<a href="${pageContext.request.contextPath}/delete.jsp">
			<div style="color:saffron">Delete User</div></a></br></br>
	</div>
</body>
</html>