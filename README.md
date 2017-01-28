Welcome to Customer Management
==============================

The Customer Management System is written in Java with JDBC + servlet + jsp. The main focus area in the system are:

1 : User must login first before using the system.

2 : List customer page + filter by phone number / email + pagination

3 : Insert new record

4 : Edit record

5 : Delete

Notes: user authentication info : use mockup data with following account (username/pwd):

1 : admin / adminPassword

2 :  user-test / userPassword

How to run in local
-------------------

1 :  Clone project from github repository

	git clone https://github.com/Nguonchhay/CustomerManagement.git

2 : Go to project root directory

3 : Set up MySQL database

	- Create database name: `customer-managment`
	- Import existing database from root directory of project: `customer-managment.sql`

4 : Install dependencies

	mvn install
	
5 : Enable open project in Eclipse

	mvn eclipse:eclipse

6 : Start web server to run project

	mvn jetty:run

7 : Open browser and type this URL `http://localhost:8080/` to see the welcome screen

Cheers
------

Hope you can run this project successfully.