
<br>
<h1 align="center">
See Below Teacher Preview And Click Enter To Submit In Database.</h1>
<br>
<h2 align="center"><%=request.getAttribute("msg") == null ? "":request.getAttribute("msg")%></h2>
<br>
<h2 align="left">
>Your Name  :<%=session.getAttribute("youname") %><br>
<br>>Father Name  : <%= session.getAttribute("fathername")%><br>
<br>>Mother Name  :<%= session.getAttribute("mothername")%><br>
<br>>Aadhar Number :<%= session.getAttribute("aadhar")%><br>
<br>>Phone Number :<%= session.getAttribute("phoneno")%><br>
<br>>Email Number :<%= session.getAttribute("email")%><br>
<br>>Date Of Birth  :<%= session.getAttribute("dateofbirth")%><br>
<br>>state :<%= session.getAttribute("state")%><br>
<br>>city  :<%= session.getAttribute("city")%><br>
<br>>dist :<%= session.getAttribute("dist")%><br>

</h2>

<h3 align="center">
<form action="teacherDB">
<br>
<input type="submit" value="Save To Database"/><br>
</form></h3>