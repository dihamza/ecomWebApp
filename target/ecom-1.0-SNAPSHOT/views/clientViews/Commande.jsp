<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.ecom.business.entities.Article" %>
<%
	Article article = (Article)request.getAttribute("article");
	System.out.print(article.getCategoryId() + " | " + article.getDesignation() + " | " + article.getPrice());
%>
    
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="stylesheet" href="../views/style/nav-style.css">
   <link rel="stylesheet" href="../views/style/order.css">
   <title>Document</title>
</head>
<body>
   <div class="main-container">
      <div class="nav-bar">
         <div class="logo-img-container">
            <img src="../views/img/amazon.png" class="logo-img" alt="">
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

      <div class="order-container">
        <div class="product-image">
            <img src="../views/img/phone.jpeg" alt="">
            <!-- <div class="other-images">

            </div> -->
        </div>
        <div class="description-container">
           <h3 class="header3">
              <%= article.getDesignation() %>
           </h3>
           <div class="price">
              <span class="value"><%= article.getPrice() %></span>
              <span class="currency">MAD</span>
           </div>
            <div class="quantity-form">
               <form action="">
               	  <input type="text" name="articleId" value=<%= article.getIdArticle() %> hidden>
                  <input type="number" value="1" class="quantity-number">
                  <input type="submit" value="Ajouter au panier" class="add-to-panier">
               </form>
            </div>
            <div class="description-text">
               <p class="description">
                  Lorem ipsum dolor sit amet consectetur, adipisicing elit. Quas corrupti iste ipsum provident sit minima dicta beatae fugit qui accusantium aliquid modi laboriosam libero quos, nemo minus, cupiditate laborum maxime.
               </p>
               <ul class="caracteristics">
                  <li>Naddi</li>
                  <li>Naddi</li>
                  <li>Naddi</li>
               </ul>
            </div>
        </div>
      </div>

      <div class="footer">
         <h3 class="normal-text white-color">
            &copy; Copyrights reserved for me 
         </h3>
      </div>
         
      </div>
</body>
</html>