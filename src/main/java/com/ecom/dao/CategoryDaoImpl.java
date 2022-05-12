package com.ecom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ecom.business.entities.Category;

public class CategoryDaoImpl implements ICategoryDao{

	@Override
	public List<Category> getCategories() {
		Connection connection = SingletonConnection.getConnection();
		List<Category> categories = new ArrayList<>();
		String query = "SELECT * FROM categories";
		try {
			PreparedStatement prdStmt = connection.prepareStatement(query);
			ResultSet rs = prdStmt.executeQuery();
			
			//mapping
			while(rs.next()) {
				categories.add(new Category(rs.getInt("idcategory"), rs.getString("category_name")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categories;
	}

}
