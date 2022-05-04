<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.ecom.web.Model.AccueilModel" %>
<%@ page import="com.ecom.business.entities.Category" %>
<%@ page import="com.ecom.business.entities.Article" %>


<%
	AccueilModel accueilModel = (AccueilModel)request.getAttribute("accueilModel");
	Map<Category, List<Article>> ProductsByCategories = accueilModel.getProductsByCategories();
    String projectRoot = request.getContextPath();
	System.out.println(request.getContextPath());
%>

<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="stylesheet" href="<c:url value="/views/style/nav-style.css"/>">
   <link rel="stylesheet" href="<c:url value="/views/style/categories.css"/>">

   <title>Document</title>
</head>
<body>
   <div class="main-container">
      <div class="nav-bar">
         <div class="logo-img-container">
            <img src="<c:url value="/views/img/amazon.png" />" class="logo-img" alt="Logo">
         </div>
         <div class="nav-elements">
            <ul class="elements-list">
               <li class="list-item"><a class="link-element" href="Accueil.html">Accueil</a></li>
               <li class="list-item"><a class="link-element" href="Categories.html">Categories</a></li>
               <li class="list-item"><a class="link-element" href="ContacterNous.html">Contacter Nous</a></li>
            </ul>
         </div>
         <div class="panier-container">
            <a href="#" class="link-element"><span class="normal-text">Panier : *e</span></a> 
         </div>
      </div>

      <div class="main-img-container">
        
      </div>
      <div class="categories-container">
      
      <% for(Category c : ProductsByCategories.keySet()) { %>
         <div class="category-container">
            <div class="category-name">
               <h3 class="header3-text">
                  <%= c.getCategoryName() %>  
               </h3>
            </div>
            <div class="category">
            <%for(Article article : ProductsByCategories.get(c)) { %>
               <div class="product-container">
                  <div class="product-img">
                        <img src="<c:url value="/views/img/phone.jpeg" />" class="product-img-img" alt="">
                  </div>
                  <div class="product-name-container">
                     <span class="product-name"><%= article.getDesignation() %></span>
                  </div>
                  <div class="product-price">
                     <div class="price">
                        <span class="price-value"><%= article.getPrice() %></span>
                        <span class="price-currency">MAD</span>
                     </div>
                  </div>
                  <div class="pass-to-order">
                     <form action="<%=projectRoot + "/client/goToCard.app" %>" method="post">
                     	<input type="text" name="articleId" value= <%= article.getIdArticle() %> hidden>
                        <input type="submit" value="Show more" class="add-to-panier">
                     </form>
                  </div>
               </div> 
               <% } %>
            </div>
         </div>
         <%} %>

         <div class="footer">
               <h3 class="normal-text white-color">
                  &copy; Copyrights reserved for me 
               </h3>
         </div>
         
      </div>
   </div>
</body>
</html>