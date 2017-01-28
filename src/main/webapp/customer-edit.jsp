<%@ page import="com.rupp.assignment.nguonchhay.model.Customer" %>

<%
	Customer customer = (Customer) request.getAttribute("customer");
%>

<html>
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Nguonchhay: Servlet + JSP + JDBC Assignment</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/dataTables.bootstrap.min.css">

	<style type="text/css">
		body {
    		background-color: #eee;
		}
		
		*[role="form"] {
		    max-width: 900px;
		    padding: 15px;
		    margin: 0 auto;
		    margin-top: 50px;
		    background-color: #fff;
		    border-radius: 0.3em;
		}
		
		*[role="form"] h2 {
		    margin-left: 5em;
		    margin-bottom: 1em;		 
		}
		
		*[role="form"] textarea {
		    width: 100%; 
		}
	</style>
</head>
<body>
	<div class="container">
		<div class="col-md-12">
		<form action="/customer-edit" method="post" class="form-horizontal" role="form">
			<input type="hidden" name="id" value="<%=customer.getId()%>">
                <h2>Edit Customer <em><%=customer.getFirstname()%> <%=customer.getLastname()%></em></h2>
                <div class="form-group">
                    <label for="id" class="col-sm-3 control-label">Customer ID</label>
                    <div class="col-sm-9">
                        <input type="text" id="id" readonly placeholder="<%=customer.getId()%>" class="form-control">
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">First Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" name="firstname" required value="<%=customer.getFirstname()%>" class="form-control" autofocus>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="lastName" class="col-sm-3 control-label">Last Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="lastName" name="lastname" required value="<%=customer.getLastname()%>" class="form-control">
                    </div>
                </div>
                
               <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" name="gender" <% if (new String("Female").equals(customer.getGender())) { %> checked <% } %> value="Female">Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" name="gender" <% if (new String("Male").equals(customer.getGender())) { %> checked <% } %> value="Male">Male
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" name="gender" <% if (new String("Other").equals(customer.getGender())) { %> checked <% } %> value="Other">Other
                                </label>
                            </div>
                        </div>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-9">
                        <input type="email" id="email" name="email" required value="<%=customer.getEmail()%>" class="form-control">
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="birthDate" class="col-sm-3 control-label">Date of Birth</label>
                    <div class="col-sm-9">
                        <input type="date" id="birthDate" name="dob" value="<%=customer.getFormatDOB()%>" required class="form-control">
                    </div>
                </div>
                
                 <div class="form-group">
                    <label for="address" class="col-sm-3 control-label">Address</label>
                    <div class="col-sm-9">
                       <textarea name="address" id="address" name="address" required rows="5"><%=customer.getAddress()%></textarea>
                    </div>
                </div>
                
                 <div class="form-group">
                    <label for="phone" class="col-sm-3 control-label">Phone</label>
                    <div class="col-sm-9">
                        <input type="text" id="phone" name="phone" required value="<%=customer.getPhone()%>" class="form-control">
                    </div>
                </div>
                
                <div class="form-group">
                    <div class="col-sm-12 text-center">
                        <button type="submit" class="btn btn-primary">Update</button>
                        <a href="/customer" class="btn btn-default">Back to list</a>
                    </div>
                </div>
            </form>
	
		</div>
	</div>
      
     <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
     <script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
     <script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
</body>
</html>
