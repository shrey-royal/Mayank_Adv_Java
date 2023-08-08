<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-Commerce</title>
<!-- Font Awesome -->
		<link
		  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
		  rel="stylesheet"
		/>
		<!-- Google Fonts -->
		<link
		  href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
		  rel="stylesheet"
		/>
		<!-- MDB -->
		<link
		  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.1/mdb.min.css"
		  rel="stylesheet"
		/>
</head>
<body>
	<div class="align-items-center justify-content-center" style="padding:15vw 60vh">
		<!-- Pills navs -->
		<ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
		  <li class="nav-item" role="presentation">
		    <a
		      class="nav-link active"
		      id="tab-login"
		      data-mdb-toggle="pill"
		      href="#pills-login"
		      role="tab"
		      aria-controls="pills-login"
		      aria-selected="true"
		      >Login</a
		    >
		  </li>
		  <li class="nav-item" role="presentation">
		    <a
		      class="nav-link"
		      id="tab-register"
		      data-mdb-toggle="pill"
		      href="#pills-register"
		      role="tab"
		      aria-controls="pills-register"
		      aria-selected="false"
		      >Register</a
		    >
		  </li>
		</ul>
		<!-- Pills navs -->
		
		<!-- Pills content -->
		<div class="tab-content">
		  <div class="tab-pane fade show active" id="pills-login" role="tabpanel" aria-labelledby="tab-login">
		    <form action="#" method="post">
		      <div class="text-center mb-3">
		        <p>Sign in with:</p>
		        <button type="button" class="btn btn-secondary btn-floating mx-1">
		          <i class="fab fa-facebook-f"></i>
		        </button>
		
		        <button type="button" class="btn btn-secondary btn-floating mx-1">
		          <i class="fab fa-google"></i>
		        </button>
		
		        <button type="button" class="btn btn-secondary btn-floating mx-1">
		          <i class="fab fa-twitter"></i>
		        </button>
		
		        <button type="button" class="btn btn-secondary btn-floating mx-1">
		          <i class="fab fa-github"></i>
		        </button>
		      </div>
		
		      <p class="text-center">or:</p>
		
		      <!-- Email input -->
		      <div class="form-outline mb-4">
		        <input type="email" id="email" class="form-control" name="email"/>
		        <label class="form-label" for="email">Email</label>
		      </div>
		
		      <!-- Password input -->
		      <div class="form-outline mb-4">
		        <input type="password" id="password" name="password" class="form-control" />
		        <label class="form-label" for="password">Password</label>
		      </div>
		
		      <!-- 2 column grid layout -->
		      <div class="row mb-4">
		        <div class="col-md-6 d-flex justify-content-center">
		          <!-- Checkbox -->
		          <div class="form-check mb-3 mb-md-0">
		            <input class="form-check-input" type="checkbox" value="" id="loginCheck" />
		            <label class="form-check-label" for="loginCheck"> Remember me </label>
		          </div>
		        </div>
		
		        <div class="col-md-6 d-flex justify-content-center">
		          <!-- Simple link -->
		          <a href="#!">Forgot password?</a>
		        </div>
		      </div>
		
		      <!-- Submit button -->
		      <input type="submit" class="btn btn-primary btn-block mb-4" value="Sign in"/>
		
		      <!-- Register buttons -->
		      <div class="text-center">
		        <p>Not a member? <a href="#!">Register</a></p>
		      </div>
		    </form>
		  </div>
		  <div class="tab-pane fade" id="pills-register" role="tabpanel" aria-labelledby="tab-register">
		    <form action="AddCustomer" method="post">
		      <div class="text-center mb-3">
		        <p>Sign up with:</p>
		        <button type="button" class="btn btn-secondary btn-floating mx-1">
		          <i class="fab fa-facebook-f"></i>
		        </button>
		
		        <button type="button" class="btn btn-secondary btn-floating mx-1">
		          <i class="fab fa-google"></i>
		        </button>
		
		        <button type="button" class="btn btn-secondary btn-floating mx-1">
		          <i class="fab fa-twitter"></i>
		        </button>
		
		        <button type="button" class="btn btn-secondary btn-floating mx-1">
		          <i class="fab fa-github"></i>
		        </button>
		      </div>
		
		      <p class="text-center">or:</p>
		
		      <!-- Name input -->
		      <div class="form-outline mb-4">
		        <input type="text" id="name" name="name" class="form-control" />
		        <label class="form-label" for="name">Name</label>
		      </div>
		
		      <!-- Email input -->
		      <div class="form-outline mb-4">
		        <input type="email" id="email" name="email" class="form-control" />
		        <label class="form-label" for="email">Email</label>
		      </div>
		
		      <!-- Password input -->
		      <div class="form-outline mb-4">
		        <input type="password" id="password" name="password" class="form-control" />
		        <label class="form-label" for="password">Password</label>
		      </div>
		
		      <!-- Repeat Password input -->
		      <div class="form-outline mb-4">
		        <input type="password" id="registerRepeatPassword" class="form-control" />
		        <label class="form-label" for="registerRepeatPassword">Repeat password</label>
		      </div>
		      
		      <!-- Mobile input -->
		      <div class="form-outline mb-4">
		        <input type="tel" id="mobile" name="mobile" class="form-control" />
		        <label class="form-label" for="mobile">Mobile</label>
		      </div>
		      
		      <!-- Gender radio -->
		      Gender:
		      <div class="btn-group form-outline mb-4">
				  <input type="radio" class="btn-check" name="gender" id="male" value="male" autocomplete="off" />
				  <label class="btn btn-secondary" for="male">Male</label>
				
				  <input type="radio" class="btn-check" name="gender" id="female" value="female" autocomplete="off" />
				  <label class="btn btn-secondary" for="female">Female</label>
				
				  <input type="radio" class="btn-check" name="gender" id="other" value="other" autocomplete="off" />
				  <label class="btn btn-secondary" for="other">Other</label>
				</div>
				
						      
		      <!-- Address input -->
		      <div class="form-outline mb-4">
		        <textarea class="form-control" id="address" name="address" rows="4"></textarea>
  				<label class="form-label" for="address">Address</label>
		      </div>
		      
		      <!-- Pincode input -->
		      <div class="form-outline mb-4">
		        <input type="number" id="pincode" name="pincode" class="form-control" />
		        <label class="form-label" for="pincode">Pincode</label>
		      </div>
		
		      <!-- Checkbox -->
		      <div class="form-check d-flex justify-content-center mb-4">
		        <input
		          class="form-check-input me-2"
		          type="checkbox"
		          value=""
		          id="registerCheck"
		          required="required"
		          aria-describedby="registerCheckHelpText"
		        />
		        <label class="form-check-label" for="registerCheck">
		          I have read and agree to the terms
		        </label>
		      </div>
		
		      <!-- Submit button -->
		      <input type="submit" class="btn btn-primary btn-block mb-3" Value="Sign Up"/>
		    </form>
		  </div>
		</div>
		<!-- Pills content -->
	</div>
	
	<!-- MDB -->
	<script
	  type="text/javascript"
	  src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.1/mdb.min.js"
	></script>
</body>
</html>