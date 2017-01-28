package com.rupp.assignment.nguonchhay;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rupp.assignment.nguonchhay.model.Customer;
import com.rupp.assignment.nguonchhay.model.MysqlConnection;

public class CustomerEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");		
		 HttpSession session = request.getSession(true);
		 if (null != session.getAttribute("authUser")) {
			 String authUser = session.getAttribute("authUser").toString();
			 if (! authUser.equalsIgnoreCase("")) {
				 int id = Integer.parseInt(request.getParameter("id"));
				 Customer customer = getCustomerById(id);
				 request.setAttribute("customer", customer);
				 RequestDispatcher rd = request.getRequestDispatcher("/customer-edit.jsp");
		         rd.forward(request, response);
			 }
		 }
		 response.sendRedirect("/login");
	}
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		Date updatedDate = new Date(System.currentTimeMillis());
		
		Customer customer = new Customer();
		customer.setId(id);
		customer.setFirstname(firstname);
		customer.setLastname(lastname);
		customer.setGender(gender);
		customer.setEmail(email);
		customer.setDOBFromString(dob);
		customer.setAddress(address);
		customer.setPhone(phone);
		customer.setUdpatedDate(updatedDate);
		MysqlConnection con = new MysqlConnection();
		con.executeQuery(customer.getSQLUpdate());
		response.sendRedirect("/customer");
    }
	
	public Customer getCustomerById(int id) {
		Customer customer = new Customer();
		Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        MysqlConnection mysqlObj = new MysqlConnection();
        String jdbc = mysqlObj.getJDBC();
        String username = mysqlObj.getUsername();
        String password = mysqlObj.getPassword();
        String className = mysqlObj.getClassName();
 
        try {
        	Class.forName(className);
            con = DriverManager.getConnection(jdbc, username, password);
            statement = con.createStatement();
            resultSet = statement.executeQuery(customer.getSQLSelectById(id));
			while (resultSet.next()) {
                customer.setId(resultSet.getInt("cus_id"));
                customer.setFirstname(resultSet.getString("cus_first_name"));
                customer.setLastname(resultSet.getString("cus_last_name"));
                customer.setGender(resultSet.getString("cus_gender"));
                customer.setEmail(resultSet.getString("cus_email_address"));
                customer.setDOBFromString(resultSet.getString("cus_DOB"));
                customer.setAddress(resultSet.getString("cus_address"));
                customer.setPhone(resultSet.getString("cus_phoneNumber"));
                break;
            }
			
			resultSet.close();
            statement.close();
            con.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
		return customer;
	}
}