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
		    max-width: 500px;
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
		<form action="login" method="post" class="form-horizontal" role="form">
                <h2>Login</h2>
                
                <div class="form-group">
                    <label for="username" class="col-sm-3 control-label">Username</label>
                    <div class="col-sm-9">
                        <input type="text" id="username" name="username" required placeholder="Enter username" class="form-control" autofocus>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password</label>
                    <div class="col-sm-9">
                        <input type="password" id="password" name="password" required placeholder="Enter password" class="form-control">
                    </div>
                </div>
                
                <div class="form-group">
                    <div class="col-sm-12 text-center">
                        <button type="submit" class="btn btn-primary">Login</button>
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
