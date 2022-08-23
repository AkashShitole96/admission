<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body background="C:\pbl\WebContent\public\clg.jpg" style="background-size:100%">


<form action="homeservlet">


<h1 align="center">SKN SINHGAD INSTITUTE OF TECHNOLOGY AND SCIENCE-[SKNSITS] LONAVALA</h1>
<br>
<h2 align="center">
<%=request.getAttribute("msg") == null ? "":request.getAttribute("msg")%>
</h2>

<h3 align="center">

ENTER USER NAME :<input type="text" name="uname"><br><br>
ENTER PASSWORD  :<input type="text" name="pass"><br><br>
  Type : student , teacher<br><br>
ENTER TYPE      :<input type="text" name="type"><br><br>
<input type="submit" value="Login">

</h3>
</form>

</body>
</html>