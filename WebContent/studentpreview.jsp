
<br>
<h1 align="center">
**See Below Student Preview And Click Enter To Submit In Database.**</h1>
<br>
<h1 align="center"><%=request.getAttribute("msg") == null ? "":request.getAttribute("msg")%></h1>
<br>
<h2 align="left">
>YOUR NAME  :<%=session.getAttribute("youname") %><br>
<br>>FATHER NAME  : <%= session.getAttribute("fathername")%><br>
<br>>MOTHER NAME  :<%= session.getAttribute("mothername")%><br>
<br>>AADHER NUMBER :<%= session.getAttribute("aadhar")%><br>
<br>>PHONE NUMBER :<%= session.getAttribute("phoneno")%><br>
<br>>EMAIL NUMBER :<%= session.getAttribute("email")%><br>
<br>>DATE OF BIRTH  :<%= session.getAttribute("dateofbirth")%><br>
<br>>STATE :<%= session.getAttribute("state")%><br>
<br>>CITY :<%= session.getAttribute("city")%><br>
<br>>DIST :<%= session.getAttribute("dist")%><br>
<br>>PREVIOUS COLLEGE NAME :<%= session.getAttribute("preclgname")%><br>
<br>>MEDIUM OF INSTRUCTION :<%= session.getAttribute("medium")%><br>
<br>>PARCENTAGE  :<%= session.getAttribute("percentage")%><br>
<br>>PARENT MOBILE NUMBER :<%= session.getAttribute("parentmobile")%><br>
<br>>ADDRESS  :<%= session.getAttribute("address")%><br>
</h2>


<h3 align="center">
<form action="studentDB">
<br>
<input type="submit" value="Save To Database"/><br>
</form></h3>