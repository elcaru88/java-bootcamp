<%@page import="model.StudentCourse"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course List</title>
</head>
<body>
<%@page isErrorPage="false" errorPage="Error.jsp"%>
<!-- List students and teachers for a given course.
 The output format should be:
	Course: <course-name>
	Teacher: <last-name>, <first-name>
	Students:
  	<last-name>, <first-name> 
  	(ordered by alphabetically by last name) -->
 
 	<% List<StudentCourse> course = (List<StudentCourse>) session.getAttribute("getCourse"); %>
 	Course: <%=course.get(0).getCourseName() %> <br/>
 	Teacher: <%=course.get(0).getTeacherLastName() %> , <%=course.get(0).getTeacherFirstName() %>
 	
	<table>
		<tr>
			<th>Student Last Name</th>
			<th>Student First Name</th>
		</tr>

	 <%	for (StudentCourse student : course) {	%>
		<tr>
			<td><%=student.getStudentlastName()%></td>
			<td><%=student.getStudentfirstName()%></td>
		</tr>
		<%	}	%>
	</table>
	<a href="index.jsp"><button>return</button></a>
</body>
</html>