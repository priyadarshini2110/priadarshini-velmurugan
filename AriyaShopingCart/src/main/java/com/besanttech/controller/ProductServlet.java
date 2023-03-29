package com.besanttech.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besanttech.dao.ProductDao;
@WebServlet ("/products")
public class ProductServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
	
		ProductDao pd=new ProductDao();
		req.setAttribute("products", pd.getAllProducts());
		req.getRequestDispatcher("views/products.jsp").forward(req, res);
	

}
}