<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
            <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <%@include file="base.jsp" %>

</head>

<body>



<table class="table table-dark" border=2 cellspacing=0;>
<thead>
    <tr>
        <th scope="col">id</th>
      <th scope="col">name</th>
      <th scope="col">phone</th>
      <th scope="col">email</th>
      <th scope="col">address</th>
      <th scope="col">remark</th>
           <th scope="col">delete</th>
           <th scope="col">edit</th>
     
      
    </tr>
  </thead>
<c:forEach var="item" items="${all}">

  
  <tbody>
    <tr>
    

 	      <td>${item.id}</td>
 					
          <td>${item.name}</td>
      
      <td>${item.phone}</td>
      <td>${item.email }</td>
      <td>${item.address }</td>
            <td>${item.remark }</td>
            <td><a href="user/${item.id}"  onclick="if (confirm('Delete selected item?')){return true;}else{event.stopPropagation(); event.preventDefault();};">
    delete</a></td>
       <td><a href="update1/${item.id}">edit</a></td>
     
    </tr>
  </tbody>

</c:forEach>
</table>






</body>
</html>