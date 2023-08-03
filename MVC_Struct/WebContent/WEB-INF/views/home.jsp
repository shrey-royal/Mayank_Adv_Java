<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>

<jsp:include page="../../header.jsp"></jsp:include>
	
	<main>
    <h2>Featured Products</h2>
    <div class="hstack gap-4 d-flex justify-content-center">
        <!-- Loop through featured products and display them -->
        
        <div class="card m-2" style="width: 18rem;">
          <img src="${pageContext.request.contextPath}/resources/img/product1.jpg" class="card-img-top" alt="Product 1">
          <div class="card-body">
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <div class="container text-center">	
                <div class="row align-items-start">
                    <div class="col font-weight-bold">$19.99</div>
                        <button type="button" class="btn btn-outline-primary">Add to Cart</button>
                </div>
            </div>
          </div>
    	</div>
    	
    	<div class="card m-2" style="width: 18rem;">
          <img src="${pageContext.request.contextPath}/resources/img/product1.jpg" class="card-img-top" alt="Product 1">
          <div class="card-body">
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <div class="container text-center">	
                <div class="row align-items-start">
                    <div class="col font-weight-bold">$19.99</div>
                        <button type="button" class="btn btn-outline-primary">Add to Cart</button>
                </div>
            </div>
          </div>
    	</div>
    	
    	<div class="card m-2" style="width: 18rem;">
          <img src="${pageContext.request.contextPath}/resources/img/product1.jpg" class="card-img-top" alt="Product 1">
          <div class="card-body">
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <div class="container text-center">	
                <div class="row align-items-start">
                    <div class="col font-weight-bold">$19.99</div>
                        <button type="button" class="btn btn-outline-primary">Add to Cart</button>
                </div>
            </div>
          </div>
    	</div>
    	
    	<div class="card m-2" style="width: 18rem;">
          <img src="${pageContext.request.contextPath}/resources/img/product1.jpg" class="card-img-top" alt="Product 1">
          <div class="card-body">
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <div class="container text-center">	
                <div class="row align-items-start">
                    <div class="col font-weight-bold">$19.99</div>
                        <button type="button" class="btn btn-outline-primary">Add to Cart</button>
                </div>
            </div>
          </div>
    	</div>
    	
    	
    	</div>
	</main>
    
    <jsp:include page="../../footer.jsp"></jsp:include>
    
</body>
</html>