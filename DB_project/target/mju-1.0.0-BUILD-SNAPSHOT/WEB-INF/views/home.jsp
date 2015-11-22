<%@ page language= "java" contentType ="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>

<title>결과창</title>
</head>
<body>
 
<table>
     <tr>
         <td width="50px" align="center">id</td>
         <td align="center">email</td>
         <td align="center">phone</td>
     </tr>
    
     <c:forEach  items="${result}" var="member">
         <tr>
             <td>${member._name}</td>
             <td>${member._email}</td>
             <td>${member._phone}</td>    
         </tr>
     </c:forEach>
 </table>
 </body>
</html>