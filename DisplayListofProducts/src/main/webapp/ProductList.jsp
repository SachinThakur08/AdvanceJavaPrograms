<%@ page import="java.util.Base64" %>
<%@page import="com.satya.ListofProductApplication.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.satya.ListofProductApplication.ProductDAO"%>
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
               <th>Product Id</th>
               <th>Product Name</th>
               <th>Product price</th>
               <th>Product Brand</th>
               <th>Product MADEIN</th>
               <th>Product Manufacture Date</th>
               <th>Product EXP</th>
               <th>Product Image</th>
            </tr>
      </thead>
       <tbody>

<c:set var="productList" value="<%= ProductDAO.findAll() %>"/>
           <c:forEach var="pro" items="${productList}">
           
           
            <tr>
                 <td>${pro.getProId()}</td>
                 <td>${pro.getProName()}</td>
                 <td>${pro.getProPrice()}</td>
                  <td>${pro.getProBrand()}</td>
                  <td>${pro.getProMadeIn()}</td>
                   <td>${pro.getProMFGDt()}</td>
                  <td>${pro.getProEXPDt()}</td>
                <td><img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(pro.getProImage())}"
                 alt="product image" style="max-width:100px; max-hight:100px;"></td>
	              </tr>
            
             <tr>
             </c:forEach>  
       </tbody>
     
     
     
     
     </table>
</body>
</html>