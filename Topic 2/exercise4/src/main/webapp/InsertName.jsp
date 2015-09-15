<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert name</title>
<script type="text/javascript">
function validate(){
	
	var nam = document.getElementById("name").value;
	
	if(nam.length < 1 ) {
		alert("the name can not be empty");
		
		return false;
	}
	
	return true;
}

</script>
</head>
<body>
<%@page isErrorPage="false" errorPage="Error.jsp" %>

<form action="SimpleServlet" onsubmit="return validate()">

name: <input type="text" name="name" id="name"/><br/>

<input type="submit" value="submit" />

</form>


</body>
</html>