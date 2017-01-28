package com.rupp.assignment.nguonchhay;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession(true);
		session.setAttribute("authUser", "");
		response.setContentType("text/html");
		response.sendRedirect("/login.jsp");
	}
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (this.isAuth(username, password)) {
			session.setAttribute("authUser", username + "," + password);
			response.sendRedirect("/customer");
		}
		response.sendRedirect("/login.jsp");
	     
	}
	
	/**
	 * @param username
	 * @param password
	 * @return boolean
	 */
	public boolean isAuth(String username, String password) {
		boolean isAuth = false;
		if (new String("admin").equals(username) && new String("adminPassword").equals(password)) {
			isAuth = true;
		}
		if (new String("user-test").equals(username) && new String("userPassword").equals(password)) {
			isAuth = true;
		}
		return isAuth;
	}
}