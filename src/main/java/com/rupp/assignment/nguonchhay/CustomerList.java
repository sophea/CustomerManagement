package com.rupp.assignment.nguonchhay;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import com.rupp.assignment.nguonchhay.model.Customer;
import com.rupp.assignment.nguonchhay.model.MysqlConnection;

public class CustomerList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		 response.setContentType("text/html");		
		 HttpSession session = request.getSession(true);
		 if (null != session.getAttribute("authUser")) {
			 String authUser = session.getAttribute("authUser").toString();
			 if (! authUser.equalsIgnoreCase("")) {
				 request.setAttribute("strCustomers", getStrCustomers());
				 RequestDispatcher rd = request.getRequestDispatcher("/customer.jsp");
		         rd.forward(request, response);
			 }
		 }
		 response.sendRedirect("/login");
		
	}
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request, response);
    }
	
	public String getStrCustomers() {	
		Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        MysqlConnection mysqlObj = new MysqlConnection();
        String jdbc = mysqlObj.getJDBC();
        String username = mysqlObj.getUsername();
        String password = mysqlObj.getPassword();
        String className = mysqlObj.getClassName();
        StringBuilder strCustomers = new StringBuilder();
 
        try {
        	Class.forName(className);
            con = DriverManager.getConnection(jdbc, username, password);
            statement = con.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM " + Customer.TABLE_NAME + ";");

            while (resultSet.next()) {
            	Customer customer = new Customer();
                customer.setId(resultSet.getInt("cus_id"));
                customer.setFirstname(resultSet.getString("cus_first_name"));
                customer.setLastname(resultSet.getString("cus_last_name"));
                customer.setGender(resultSet.getString("cus_gender"));
                customer.setEmail(resultSet.getString("cus_email_address"));
                customer.setDOBFromString(resultSet.getString("cus_DOB"));
                customer.setAddress(resultSet.getString("cus_address"));
                customer.setPhone(resultSet.getString("cus_phoneNumber"));
                customer.setCreatedDateFromString(resultSet.getString("date_created"));
                
                strCustomers.append(customer.toStringHTMLRow());
            }
            
            resultSet.close();
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return strCustomers.toString();
	}
}