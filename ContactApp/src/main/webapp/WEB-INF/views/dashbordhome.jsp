<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%-- <%@include file="./navbar.jsp" %>
 --%><%@include file="./base.jsp" %>
 <link rel="stylesheet" href="assets/css/styles.css" />
<style type="text/css">
:root {
  --normal-font: 400;
  --bold-font: 600;
  --bolder-font: 900;
  --primary-color: #0652dd;
  --secondary-color: #ea2027;
  --line-height: 1.7rem;
  --transition: 0.4s ease-in;
}

/* Smooth scroll effect */
html {
  scroll-behavior: smooth;
}

/* Resets */
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  transition: var(--transition);
}

 body {
  font-family: "Roboto", sans-serf;
}

ul li {
  list-style-type: none;
}
.fist {
  color: var(--secondary-color);
}

.jab {
  color: var(--primary-color);
}

.tv {
  color: var(--secondary-color);
}
nav {
  background: #fff;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem 1.5rem;
  box-shadow: 2px 3px 2px #f1f1f1;
}
position: sticky;
  top: 0;
  left: 0;
  z-index: 1;
  
  .hamburger {
  display: none;
}
.logo {
  font-size: 2rem;
  font-weight: 500;
}

ul {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.nav-item {
  margin-left: 2rem;
}

.nav-link {
  font-weight: var(--bold-font);
}
</style>
    <!-- Simple lightbox CSS -->
    <link rel="stylesheet" href="assets/css/simple-lightbox.min.css" />

    <!-- Favicons -->
    <link
      rel="apple-touch-icon"
      sizes="180x180"
      href="assets/icons/apple-touch-icon.png"
    />
    <link
      rel="icon"
      type="image/png"
      sizes="32x32"
      href="assets/icons/favicon-32x32.png"
    />
    <link
      rel="icon"
      type="image/png"
      sizes="16x16"
      href="assets/icons/favicon-16x16.png"
    />

    <title>JabTV Landing Page</title>
  </head>
  <body>
    <!-- Navbar -->
    <nav>
      <a href="#" class="logo">
        <h1>
          <span class="jab">ACKS</span><span class="tv">_PVT LTD</span
          ><span class="fist">&#x1F44A;</span>
        </h1>
      </a>
      <ul>
        <li class="nav-item">
          <a href="http://localhost:8082/SpringMvc/regi" class="nav-link" id="nav-link">register</a>
        </li>
        <li class="nav-item">
          <a href="http://localhost:8082/SpringMvc/loginuser" class="nav-link" id="nav-link">login</a>
        </li>
        <li class="nav-item">
          <a href="#stakeholders" class="nav-link" id="nav-link"
            >stakeholders</a
          >
        </li>
        <li class="nav-item">
          <a href="#sub" class="nav-link" id="nav-link">about</a>
        </li>
</ul>
</nav>
<div class="hamburger" id="hamburger">
    <span class="bar"></span>
    <span class="bar"></span>
    <span class="bar"></span>
</div>
    
    <!-- Web page script -->
    <script src="assets/js/app.js"></script>

    <!-- Ion icons CDN -->
   
  </body>
</html>