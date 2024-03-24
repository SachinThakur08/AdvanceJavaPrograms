
<%@page import="com.satya.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>product List</title>
   <!-- BootStrap cdn link to get the support of  BootStrap-->
  <link rel="stylesheet"
   href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>
   
</head>
<body>
     <table class="table table-bordered table-striped" >
       <thead class="thead-dark" >
            <tr>
               <th>prod dId</th>
               <th>prod Name</th>
               <th>prod price</th>
               <th>prod Brand</th>
               <th>prod MADEIN</th>
               <th>prod Manfact</th>
               <th>prod EXP</th>
               <th>Image</th>
            </tr>
      </thead>
       <tbody>
           <c:forEach var="pro" items="<%=Dao.findAll() %>">
            <tr>
                 <td>${pro.proId }</td>
                 <td>${pro.proName}</td>
                 <td>${pro.proPrice }</td>
                  <td>${pro.proBrand }</td>
                  <td>${pro.proMadeIn }</td>
                   <td>${pro.promfgdate }</td>
                  <td>${pro.proexpdate }</td>
                <td><img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(pro.proImage )}"
                 alt="product image" style="max-width:100px; max-hight:100px;"></td>
	              </tr>
            
             <tr>
             </c:forEach> 
       </tbody>
     
     
     
     
     </table>
</body>
</html>