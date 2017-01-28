package com.rupp.assignment.nguonchhay.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlConnection {
    
    private String jdbc = "jdbc:mysql://localhost:3306/customer-managment";
    private String username = "root";
    private String password = "12354";
    private String className ="com.mysql.jdbc.Driver";
    
    
    public String getJDBC() {
    	return this.jdbc;
    }
    
    public String getUsername() {
    	return this.username;
    }
    
    public String getPassword() {
    	return this.password;
    }
    
    public String getClassName() {
    	return this.className;
    }
    
    public void executeQuery(String sql) {
    	Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
    	try {
        	Class.forName(getClassName());
            con = DriverManager.getConnection(getJDBC(), getUsername(), getPassword());
            statement = con.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet execute(String sql) {
    	Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
    	try {
        	Class.forName(className);
            con = DriverManager.getConnection(jdbc, username, password);
            statement = con.createStatement();
            statement.executeUpdate(sql);
            resultSet = statement.executeQuery(sql);
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return resultSet;
    }
}
