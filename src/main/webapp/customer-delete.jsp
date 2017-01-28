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
	</style>
</head>
<body>
	<div class="container">
		<div class="col-md-12">
			<form action="/customer-delete" method="post" class="form-horizontal" role="form">
				<input type="hidden" name="id" value="<%=request.getAttribute("id")%>">
				 <h2>Delete Customer</h2>
				Are you sure that you want to delete this customer?
				 <button type="submit" class="btn btn-primary">Yes</button>
				 <a href="/customer" class="btn btn-default">No</a>
			</form>
		</div>
	</div>
      
     <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
     <script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
     <script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
</body>
</html>
