<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<title>registration form</title>
<%@include file="./contactnavbar.jsp" %>
<%@include file="./base.jsp" %>

</head>

<h2 ALIGN="CENTER">Registration form</h2>

 <form action="${pageContext.request.contextPath}/contact1"  method="post">
<table border="0" align="center">
<tbody>


<tr>
<td><label for="id">id: </label></td>
<td><input id="id" maxlength="50" name="id" type="text" value="${singledata.id}" /></td>
</tr>

<tr>
<td><label for="name">Name: </label></td>
<td><input id="name" maxlength="50" name="name" type="text"  value="${singledata.name}" /></td>
</tr>

<tr>
<td><label for="phone">phone: </label></td>
<td><input id="phone" maxlength="50" name="phone" type="text" value="${singledata.phone}" /></td>
</tr>

<tr>
<td><label for="email">Email:</label></td>
<td><input id="email" maxlength="50" name="email" type="text" value="${singledata.email}" /></td>
</tr>


<td><label for="address">Address: </label></td>
<td><input id="address" maxlength="50" name="address" type="text" value="${singledata.address}" /></td>
</tr>

<tr>
<td><label for="remark">Remark:</label></td>
<td><input id="remark" maxlength="50" name="remark" type="text" value="${singledata.remark}" /></td>
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
<td align="right"><input name="Submit" type="Submit" value="Add" /></td>
</tr>

</tbody>
</table>
</form>
</html>