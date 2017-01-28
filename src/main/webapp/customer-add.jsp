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
		<form action="/customer-add" method="post" class="form-horizontal" role="form">
                <h2>New Customer</h2>
                <div class="form-group">
                    <label for="id" class="col-sm-3 control-label">Customer ID</label>
                    <div class="col-sm-9">
                        <input type="text" id="id" readonly placeholder="Auto increasement" class="form-control">
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">First Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" name="firstname" required placeholder="Enter firstname" class="form-control" autofocus>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="lastName" class="col-sm-3 control-label">Last Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="lastName" name="lastname" required placeholder="Enter lastname" class="form-control">
                    </div>
                </div>
                
               <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" name="gender" value="Female">Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" name="gender" value="Male">Male
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" name="gender" value="Other">Other
                                </label>
                            </div>
                        </div>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-9">
                        <input type="email" id="email" name="email" required placeholder="Enter Email" class="form-control">
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="birthDate" class="col-sm-3 control-label">Date of Birth</label>
                    <div class="col-sm-9">
                        <input type="date" id="birthDate" name="dob" required class="form-control">
                    </div>
                </div>
                
                 <div class="form-group">
                    <label for="address" class="col-sm-3 control-label">Address</label>
                    <div class="col-sm-9">
                       <textarea name="address" id="address" name="address" required rows="5"></textarea>
                    </div>
                </div>
                
                 <div class="form-group">
                    <label for="phone" class="col-sm-3 control-label">Phone</label>
                    <div class="col-sm-9">
                        <input type="text" id="phone" name="phone" required placeholder="Enter phone" class="form-control">
                    </div>
                </div>
                
                <div class="form-group">
                    <div class="col-sm-12 text-center">
                        <button type="submit" class="btn btn-primary">Save</button>
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
