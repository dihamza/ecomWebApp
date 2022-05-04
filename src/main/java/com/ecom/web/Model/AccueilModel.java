package com.ecom.web.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ecom.business.entities.Article;
import com.ecom.business.entities.Category;
import com.ecom.dao.ArticleDaoImpl;
import com.ecom.dao.CategoryDaoImpl;
import com.ecom.dao.IArticleDao;

public class AccueilModel {
	private Map<Category, List<Article>> ProductsByCategories = productsByCategories();
	
	private Map<Category, List<Article>> productsByCategories() {
		Map<Category, List<Article>> ProductsByCategories = new HashMap<>();
		CategoryDaoImpl categoryDao = new CategoryDaoImpl();
		List<Category> categories = categoryDao.getCategories();
		IArticleDao ArticleDao = new ArticleDaoImpl();
		
		for(Category c : categories) {
			ProductsByCategories.put(c, ArticleDao.getArticlesByCategory(c.getIdCategory()));
		}
		return ProductsByCategories;
	}

	public void setProductsByCategories(Map<Category, List<Article>> productsByCategories) {
		ProductsByCategories = productsByCategories;
	}

	public Map<Category, List<Article>> getProductsByCategories() {
		return ProductsByCategories;
	}
	
	
	
}
