<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="favicon.ico">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
	<link rel="stylesheet" href="css/main.css">
    <title>My SWE Basic Java Web App 1</title>
</head>
<body>
    <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
        <a class="navbar-brand" href="./index.html">CS425-SWE ::: JPA Demo JavaWebApp</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="NewAccount.html">New Account</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ListAccounts.html">List Accounts</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Disabled</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="https://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                    <div class="dropdown-menu" aria-labelledby="dropdown01">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
    <div class="container">
        <%
            String strAccountNo = (String) request.getSession().getAttribute("currAccountNo");
            String strAccountName = (String) request.getSession().getAttribute("currAccountName");
        %>
        <div>
            <h3>New account has been created, with the following data:</h3>
            <hr/>
            <p>&nbsp;</p>
            <div style="border-left: aqua 0.5em solid; padding-left: 2em;">
                <p>Account Number: <%= strAccountNo %></p>
                <p>Account Name: <%= strAccountName %></p>
            </div>
            <p>&nbsp;</p>
            <p><a href="/MySWEBasicJavaWebApp1/NewAccount.html">Add another account</a>
        </div>
    </div>
    <footer class="footer">
        <div class="container">
            <span class="text-muted">O. Kalu ::: CS425-SWE</span><span style="float:right;" class="text-muted">&copy June 2018</span>
        </div>
    </footer>
</body>
</html>