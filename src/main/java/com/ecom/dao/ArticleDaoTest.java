package com.ecom.dao;

import com.ecom.business.entities.Article;

public class ArticleDaoTest {
	public static void main(String[] args) {
		IArticleDao dao = new ArticleDaoImpl();
//		List<Article> l = dao.getArticlesByCategory(1);
//		
//		for(Article a:l) {
//			System.out.print(a.getCategoryId() + " | " + a.getDesignation() + " | " + a.getPrice());
//			System.out.println();
//		}
		Article a = dao.getArticle(1);
		System.out.print(a.getCategoryId() + " | " + a.getDesignation() + " | " + a.getPrice());

		
	}
}
