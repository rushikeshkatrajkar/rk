<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<%@page isELIgnored="false" %>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
      <style type="text/css">
      .error{
      color: red;
      }
    
      
      </style>
   </head>
   
   <body>
      <h2>user Information</h2>
      <form:form method = "POST" action = "userreg" modelAttribute="user1">
         <table>
            <tr>
              <td><input type="text" name="name" placeholder="Enter name" value="${name}" ></td>
              <td><form:errors path="name" cssClass="error"></form:errors></td>
            </tr>
             <tr>
              <td><input type="text" name="phone" placeholder="Enter phone" value="${phone}"></td>
              <td><form:errors path="phone" cssClass="error"></form:errors></td>
            </tr>
            <tr>
              <td><input type="text" name="email" placeholder="Enter email" value="${email}"></td>
              <td><form:errors path="email" cssClass="error"></form:errors></td>
            </tr>
           
            <tr>
            <tr>
              <td><input type="text" name="address" placeholder="Enter address" value="${address}"></td>
              <td><form:errors path="address" cssClass="error"></form:errors></td>
            </tr>
            <tr><tr>
              <td><input type="text" name="username" placeholder="Enter username" value="${username}"></td>
              ${username1}
              <td><form:errors path="username" cssClass="error" ></form:errors></td>
              
            </tr>
             <tr>
              <td><input type="text" name="password" placeholder="Enter password" value="${password}"></td>
              <td><form:errors path="password" cssClass="error"></form:errors></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>





