<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Course</title>
<script type="text/javascript">
function validar(){
	var courseName = document.getElementById("courseName").value;
	
	if (!isNaN(courseName) || courseName == null || courseName =="") {
		alert("The input should be a valid course name");
		return false;
	}
	return true;
}
</script>
</head>
<body>

<%@page isErrorPage="false" errorPage="Error.jsp" %>
   
<form action="CourseListServlet" onsubmit="return validar()">
Search by course name: <input type="text" name="courseName" id="courseName"><br/>
<input type="submit" value="Search" />
</form>
<a href="index.jsp"><button>return</button></a>
  	
</body>
</html>