package com.rupp.assignment.nguonchhay.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Customer {
	
	public final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	public final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
	public static final String TABLE_NAME = "td_customer";
	
	private int id;
	private String firstname;
	private String lastname;
	private String gender;
	private String email;
	private String phone;
	private String address;
	private Date dob;
	private Date createdDate;
	private Date updatedDate;
	
	public Customer() {}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getDOB() {
		return dob;
	}
	
	public String getFormatDOB() {
		if (dob != null) {
			return dateFormat.format(dob);
		}
		return "";
	}
	
	public void setDOB(Date dob) {
		this.dob = dob;
	}
	
	public void setDOBFromString(String dob) {
		try {
	        this.dob = dateFormat.parse(dob);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public String getFormatCreatedDate() {
		if (createdDate != null) {
			return dateTimeFormat.format(createdDate);
		}
		return "";
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public void setCreatedDateFromString(String createdDate) {
		try {
	        this.createdDate = dateTimeFormat.parse(createdDate);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	}
	
	public Date getUpdatedDate() {
		return updatedDate;
	}
	
	public String getFormatUpdatedDate() {
		if (updatedDate != null) {
			return dateTimeFormat.format(updatedDate);
		}
		return "";
	}
	
	public void setUdpatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public void setUdpatedDateFromString(String updatedDate) {
		try {
	        this.updatedDate = dateTimeFormat.parse(updatedDate);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	}
	
	public String toStringHTMLRow() {
		StringBuilder strCustomers = new StringBuilder();
			strCustomers.append("<tr>");
			strCustomers.append("<td>" + getId() + "</td>");
			strCustomers.append("<td>" + getFirstname() + "</td>");
			strCustomers.append("<td>" + getLastname() + "</td>");
			strCustomers.append("<td>" + getGender() + "</td>");
			strCustomers.append("<td>" + getEmail() + "</td>");
			strCustomers.append("<td>" + getFormatDOB() + "</td>");
			strCustomers.append("<td>" + getAddress() + "</td>");
			strCustomers.append("<td>" + getPhone() + "</td>");
			strCustomers.append("<td>" + getFormatCreatedDate() + "</td>");
			strCustomers.append("<td><a href='/customer-edit?id=" + getId() + "'><span class='glyphicon glyphicon-edit'></span> Edit</a> <br> <a href='/customer-delete?id=" + getId() + "'> <span class='glyphicon glyphicon-remove-circle'></span> Delete</a></td>");
		strCustomers.append("</tr>");
		return strCustomers.toString();
	}
	
	public String getSQLSelectById(int id) {
		StringBuilder packedSql = new StringBuilder();
		packedSql.append("SELECT * FROM " + Customer.TABLE_NAME + " WHERE cus_id=" + id + ";");
		return packedSql.toString();
	}
	
	public String getSQLInsert() {
		StringBuilder packedSql = new StringBuilder();
		packedSql.append("INSERT INTO " + Customer.TABLE_NAME + "(cus_first_name,cus_last_name,cus_gender,cus_email_address,cus_DOB,cus_address,cus_phoneNumber,date_created) VALUES(");
		packedSql.append("'").append(getFirstname()).append("','");
		packedSql.append(getLastname()).append("','");
		packedSql.append(getGender()).append("','");
		packedSql.append(getEmail()).append("','");
		packedSql.append(getFormatDOB()).append("','");
		packedSql.append(getAddress()).append("','");
		packedSql.append(getPhone()).append("','");
		packedSql.append(getFormatCreatedDate()).append("'");
		packedSql.append(")");
		
		return packedSql.toString();
	}
	
	public String getSQLUpdate() {
		StringBuilder packedSql = new StringBuilder();
		packedSql.append("UPDATE " + Customer.TABLE_NAME + " SET cus_first_name='" + getFirstname()).append("',");
		packedSql.append("cus_last_name='" + getLastname()).append("',");
		packedSql.append("cus_gender='" + getGender()).append("',");
		packedSql.append("cus_email_address='" + getEmail()).append("',");
		packedSql.append("cus_DOB='" + getFormatDOB()).append("',");
		packedSql.append("cus_address='" + getAddress()).append("',");
		packedSql.append("cus_phoneNumber='" + getPhone()).append("',");
		packedSql.append("date_updated='" + getFormatUpdatedDate()).append("'");
		packedSql.append(" WHERE cus_id=" + getId() + ";");
		
		return packedSql.toString();
	}
	
	public String getSQLDelete(int id) {
		StringBuilder packedSql = new StringBuilder();
		packedSql.append("DELETE FROM " + Customer.TABLE_NAME + " WHERE cus_id=" + id + ";");
		return packedSql.toString();
	}
}
