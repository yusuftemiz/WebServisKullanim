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
		<h2>Create User</h2>
		<form action="rest/users/add" method="POST">
			<div style="width: 100px; text-align:left;">
				<div style="padding:15px;">
					User ID: <input name="id" />
				</div>
				<div style="padding:10px;">
					Name: <input name="name" />
				</div>
				<div style="padding:10px;">
					Email: <input name="email" />
				</div>
				<div style="padding:10px;">
					Country: <input name="country" />
				</div>
				<div style="padding:20px;text-align:center">
					<input type="submit" value="Submit" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>