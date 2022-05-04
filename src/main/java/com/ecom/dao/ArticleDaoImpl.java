package com.ecom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ecom.business.entities.Article;

public class ArticleDaoImpl implements IArticleDao {

	
	@Override
	public List<Article> getArticlesByCategory(int categoryID) {
		Connection connection = singletonConnection.getConnection();
		List<Article> articles = new ArrayList<>();
		String query = "SELECT * FROM Articles WHERE category_id = ?";
		try {
			PreparedStatement prdStmt = connection.prepareStatement(query);
			prdStmt.setInt(1, categoryID);
			ResultSet rs = prdStmt.executeQuery();
			
			//mapping
			while(rs.next()) {
				articles.add(new Article(
						rs.getInt("idarticle"),
						rs.getString("designation"),
						rs.getDouble("price"),
						rs.getInt("category_id"),
						rs.getString("photo_dir")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return articles;
	}

	@Override
	public Article getArticle(int articleId) {
		Article article = null;
		Connection connection = singletonConnection.getConnection();
		String query = "SELECT * FROM Articles WHERE idarticle = ?";
		try {
			PreparedStatement prdStmt = connection.prepareStatement(query);
			prdStmt.setInt(1, articleId);
			ResultSet rs = prdStmt.executeQuery();
			
			//mapping
			rs.next();
			article = new Article(
						rs.getInt("idarticle"),
						rs.getString("designation"),
						rs.getDouble("price"),
						rs.getInt("category_id"),
						rs.getString("photo_dir")
						);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return article;
	}

}
