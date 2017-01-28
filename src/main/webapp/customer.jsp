<html>
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Nguonchhay: Servlet + JSP + JDBC Assignment</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/dataTables.bootstrap.min.css">
	<style type="text/css">
		a {
			cursor: pointer;
		}
	</style>
</head>
<body>
	<div class="container" style="margin-top: 20px;">
		<div class="col-md-12">
			<div class="col-xs-10">
				<h2>Customer List </h2>
			</div>
			<div class="col-xs-2 text-right">
				<a href="/login">Log out</a>
			</div>
			
			<table id="customers" class="table table-striped table-bordered" cellspacing="0" width="100%">
		        <thead>
		            <tr>
		            	<th>Id</th>
		                <th>First name</th>
		                <th>Last name</th>
		                <th>Gender</th>
		                <th>Email</th>
		                <th>Date of birth</th>
		                <th>Address</th>
		                <th>Phone</th>
		                <th>Become customer since</th>
		                <th style="min-width: 50px;">
		                	<a href="/customer-add.jsp">(+) New</a>
		                </th>
		            </tr>
		        </thead>
		        <tbody>
		        	<%= request.getAttribute("strCustomers") %>
		         </tbody>
		      </table>
	
		</div>
	</div>
      
     <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
     <script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
     <script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
     <script type="text/javascript">
	      $(document).ready(function() {
    	  		$('#customers').DataTable();
    	  });
     </script>
</body>
</html>
