<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<script type="text/javascript">
	function validar() {
		 var name = document.getElementsByName("name")[0].value; 
		  
		  if (name=="") {
			   alert("Insert your name");
			   return false;
		     }
		     return true;
		}
<!--

//-->
</script>
</head>
<body>
	<h3>Hello User</h3>
	<h5>Insert your name and get your random Number</h5>
	<form action="ServletCallNumber" method="get" onsubmit="return validar()">
		User Name<input type="text" id="name" name="name">
		<button type="submit">Ok</button>
	</form>

</body>
</html>