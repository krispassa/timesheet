<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee detail</title>
</head>
<body>

<h1> Welcome ${afterlogin.fname }</h1>


<table>
  <tr>
    <th>Employee ID</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Address</th>
    <th>Start</th>
    <th>End</th>
    <th>Total Hours</th>
    <th>Total Amount</th>
  </tr>
  <tr>
    <td>${afterlogin.eID}</td>
    <td>${afterlogin.fname }</td>
    <td>${afterlogin.lname }</td>
    <td>${afterlogin.address }</td>
    <td>${afterlogin.startTime }</td>
    <td>${afterlogin.endTime }</td>
    <td>${afterlogin.totalhrs }</td>
    <td>${afterlogin.totalSalary }</td>
  </tr>
  
</table>
</body>
</html>