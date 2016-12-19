<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Bus seat booking</title>
</head>
<body>
<h1 align="center">Bus Reservation System</h1>
<form action="<c:url value='/seats' />" method="post">
  <table width="649" align="center">
    <tr align="center" bgcolor="#656798" >
      <td width="48"><strong>Sl.No.</strong></td>
      <td width="142"><strong>Bus To</strong></td>
      <td width="127"><strong>Available</strong></td>
      <td width="190"><strong>Book</strong></td>
    </tr>
    <%
	int i=0;
	while(i<=10){
	%>
    <tr bgcolor="#00CCFF" align="center">
      <td><%=i++%></td>
      <td>Karunamoyee</td>
      <td>12</td>
      <td><input type="submit" value="Book"></td>
    </tr>
    <%
	} //end while
	%>
  </table>
</form>
</body>
</html>