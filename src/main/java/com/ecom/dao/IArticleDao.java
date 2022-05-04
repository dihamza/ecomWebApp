package com.ecom.dao;

import java.util.List;

import com.ecom.business.entities.Article;

public interface IArticleDao {
	public List<Article> getArticlesByCategory(int categoryId);
	public Article getArticle(int productId);	
}
