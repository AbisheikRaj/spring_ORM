package com.example.springORM.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springORM.DAO.ProductDAO;
import com.example.springORM.Model.Product;


public class ProductService {
	
	@Autowired
	private ProductDAO dao;
	
	
	
	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}



	public List<Product> getProduct() {
		return dao.getAllProduct();
	}
}
