package com.rupp.assignment.nguonchhay;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rupp.assignment.nguonchhay.model.Customer;
import com.rupp.assignment.nguonchhay.model.MysqlConnection;

public class CustomerAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setContentType("text/html");		
		 HttpSession session = request.getSession(true);
		 if (null != session.getAttribute("authUser")) {
			 String authUser = session.getAttribute("authUser").toString();
			 if (! authUser.equalsIgnoreCase("")) {
				 response.sendRedirect("/customer-add.jsp");
			 }
		 }
		 response.sendRedirect("/login");
	}
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		Date createdDate = new Date(System.currentTimeMillis());
		
		Customer customer = new Customer();
		customer.setFirstname(firstname);
		customer.setLastname(lastname);
		customer.setGender(gender);
		customer.setEmail(email);
		customer.setDOBFromString(dob);
		customer.setAddress(address);
		customer.setPhone(phone);
		customer.setCreatedDate(createdDate);
		MysqlConnection con = new MysqlConnection();
		con.executeQuery(customer.getSQLInsert());
		response.sendRedirect("/customer");
    }
	
}