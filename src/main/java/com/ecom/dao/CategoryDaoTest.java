package com.ecom.dao;

import java.util.List;
import java.util.Map;

import com.ecom.business.entities.Article;
import com.ecom.business.entities.Category;

public class CategoryDaoTest {
	public static void main(String[] args) {
		ICategoryDao dao = new CategoryDaoImpl();
		List<Category> categories = dao.getCategories();
		
		for(Category c : categories) {
			System.out.print(c.getIdCategory() + " | " + c.getCategoryName());
			System.out.println();
		}
		
	}
}
