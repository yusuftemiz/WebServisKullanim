<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js" type="text/javascript"></script>
<%@ page contentType="text/html; charset=UTF-8" %>
<head>
<title>Delete User</title>
<script>
$(document).ready(function () {
 $("#deleteForm").on("submit", function(){
	$.ajax({
	    url: 'rest/users',
	    type: 'DELETE',
	    dataType: "json",
	    data:$("#deleteForm").serialize(),
	    success: function(data) {
	    	console.log(data);
	    	$(data).find('User').each(function(){
                $(this).find("id").each(function(){
                    var id = $(this).text();
                    console.log(id);
                    alert("Deleted the user with id "+id);
                });
            });
	    }
	});
   return true;
 })
});
</script>
</head>
<body>
	<div style="padding-left:50px;font-family:monospace;">
		<h2>Delete User</h2>
		<form id="deleteForm">
			<div style="width: 100px; text-align:left;">
				<div style="padding:15px;">
					User ID: <input name="id" />
				</div>
				<div style="padding:20px;text-align:center">
					<input type="submit" value="Submit" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>