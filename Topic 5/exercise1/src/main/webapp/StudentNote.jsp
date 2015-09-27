<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Note</title>
<script type="text/javascript">
function validar(){
	var registrationNumber = document.getElementById("registrationNumber").value;
	
	if (isNaN(registrationNumber) || registrationNumber < 0 || registrationNumber == null || registrationNumber =="") {
		alert("The input should be the registration number");
		return false;
	}
	return true;
}
</script>
</head>
<body>

<%@page isErrorPage="false" errorPage="Error.jsp" %>
   
<form action="StudentNoteServlet" onsubmit="return validar()">
Search by  registration number: <input type="text" name="registrationNumber" id="registrationNumber"><br/>
<input type="submit" value="Search" />
</form>
<a href="index.jsp"><button>return</button></a>

</body>
</html>