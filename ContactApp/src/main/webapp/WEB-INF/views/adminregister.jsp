<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<title>registration form</title>
<%@include file="./navbar.jsp" %>
<%@include file="./base.jsp" %>

</head>

<h2 ALIGN="CENTER">Admin Registration form</h2>

<form action="show/@{all.phone}" method="post">
<table border="0" align="center">
<tbody>

<tr>
<td><label for="name">Name: </label></td>
<td><input id="name" maxlength="50" name="name" type="text" /></td>
</tr>

<tr>
<td><label for="phone">phone: </label></td>
<td><input id="phone" maxlength="50" name="phone" type="text"  /></td>
</tr>

<tr>
<td><label for="email">Email:</label></td>
<td><input id="email" maxlength="50" name="email" type="text" /></td>
</tr>


<td><label for="address">Address: </label></td>
<td><input id="address" maxlength="50" name="address" type="text" /></td>
</tr>

<tr>
<td><label for="username">User_Name:</label></td>
<td><input id="username" maxlength="50" name="username" type="text" /></td>
</tr>


<tr>
<td><label for="password">Password:</label></td>
<td><input id="password" maxlength="50" name="password"
type="password" /></td>
</tr>
 <div class="form-group">
    <div class="form-check">
    <td>  <input class="form-check-input is-invalid" type="checkbox" value="" id="invalidCheck3" required>
     <td> <label class="form-check-label" for="invalidCheck3">
       Agree to terms and conditions</td>
      </label>
      <div class="invalid-feedback">
        You must agree before submitting.
      </div>
    </div>
  </div>
<!-- <tr>
 <td> <input id="checkbox" type="checkbox" /></td>
 
 <td> <label for="checkbox"> I agree to these <a href="#">Terms and Conditions</a>.</label></td>
</tr> -->

<tr>
 <td align="right">  
 <input name="Submit" type="Submit" value="Add"  />  </td> 
 
</tr>

</tbody>
</table>
</form>
</html>