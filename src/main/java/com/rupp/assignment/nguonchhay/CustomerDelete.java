package com.rupp.assignment.nguonchhay;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rupp.assignment.nguonchhay.model.Customer;
import com.rupp.assignment.nguonchhay.model.MysqlConnection;

public class CustomerDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");		
		 HttpSession session = request.getSession(true);
		 if (null != session.getAttribute("authUser")) {
			 String authUser = session.getAttribute("authUser").toString();
			 if (! authUser.equalsIgnoreCase("")) {
				 request.setAttribute("id", request.getParameter("id"));
				 RequestDispatcher rd = request.getRequestDispatcher("/customer-delete.jsp?id=" + request.getParameter("id"));
		         rd.forward(request, response);
			 }
		 }
		 response.sendRedirect("/login");
	}
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer customer = new Customer();
		MysqlConnection con = new MysqlConnection();
		con.executeQuery(customer.getSQLDelete(Integer.parseInt(request.getParameter("id"))));
		response.sendRedirect("/customer");
    }
	
}