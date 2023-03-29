package com.besanttech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.besanttech.dao.UserDao;
import com.besanttech.entities.User;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();
		User user=new User();
		user.setUsername(req.getParameter("username"));  
	    user.setPassword(req.getParameter("userpass"));  
	    UserDao userdao=new UserDao();
	    if(userdao.validateLogin(user)==null)
	    {
	    	out.println("Incorrect username or password");
	    	req.getRequestDispatcher("views/login.jsp").include(req, res);
	    }
	    else {
	    	out.println("login successfull");
	    	HttpSession ses=req.getSession();
	    	ses.setAttribute("username", user.getUsername());
	    	req.getRequestDispatcher("views/home.jsp").forward(req, res);

	    }

	}
}
