package com.example.springORM.DAO;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springORM.Model.Product;


public class ProductDAO {
	
	@Autowired
	private SessionFactory sessionfactory;
	
	
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}



	public List<Product> getAllProduct() {
		
		Session session = sessionfactory.openSession();
		
		List<Product> products = session.createQuery("from Product").list();
		return products;
	}
}
