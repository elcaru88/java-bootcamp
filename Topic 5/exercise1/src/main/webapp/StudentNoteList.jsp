<%@page import="model.StudentCourse"%>
<%@page import="model.StudentCourseList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Note List</title>
</head>
<body>


	<!-- List final course notes for a given student 
(the input should be the registration number). 
They should be ordered by highest notes and course name) 

student (firstName ,lastName ,courseName ,finalNote);

-->


	<%@page isErrorPage="false" errorPage="Error.jsp"%>
	<table>

		<tr>
			<th>Student Last Name</th>
			<th>Student First Name</th>
			<th>Course Name</th>
			<th>Final Note</th>
		</tr>

		<%
			List<StudentCourse> studentNote = (List<StudentCourse>) session.getAttribute("studentNote");
			for (StudentCourse student : studentNote) {
		%>
		<tr>
			<td><%=student.getStudentlastName()%></td>
			<td><%=student.getStudentfirstName()%></td>
			<td><%=student.getCourseName()%></td>
			<td><%=student.getFinalNote()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<a href="index.jsp"><button>return</button></a>


</body>
</html>