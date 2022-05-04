package com.ecom.dao;

import java.util.List;
import java.util.Map;

import com.ecom.business.entities.Category;

interface ICategoryDao {
	public List<Category> getCategories();
}
