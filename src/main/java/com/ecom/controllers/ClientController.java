package com.ecom.controllers;

import java.io.IOException;

import com.ecom.business.entities.Article;
import com.ecom.dao.ArticleDaoImpl;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ecom.web.Model.AccueilModel;

public class ClientController extends Controller {
	public Object index(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		Cookie cookie = new Cookie("name", "hamzarbati");
		response.addCookie(cookie);
		AccueilModel accueilModel = new AccueilModel();
		request.setAttribute("accueilModel", accueilModel);
		return "/views/clientViews/Accueil.jsp";
	}
	
	public Object goToCard(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		ArticleDaoImpl dao = new ArticleDaoImpl();
		Article article = dao.getArticle(Integer.parseInt(request.getParameter("articleId")));
		System.out.print(article.getCategoryId() + " | " + article.getDesignation() + " | " + article.getPrice());
		request.setAttribute("article", article);
		System.out.println(Integer.parseInt(request.getParameter("articleId")) + "VVVVV");
		return "/views/clientViews/Commande.jsp";
	}
}
