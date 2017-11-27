<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>  
<head>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <title>Welcome page</title>
    <link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
    <style>
        body{
            font-size:16px!important;
        }
    </style>
</head>  
<body >
    <<br>
    <div class="panel panel-default col-lg-4 col-lg-offset-4">
        <div class="panel-heading">
            userinfo
        </div>
        <div class="panel-body">
            ${userinfo}
        </div>
    </div>
    <br>
    <div class="panel panel-default col-lg-4 col-lg-offset-4">

        <div class="panel-body">
            This is a welcome page from app1.
        </div>
    </div>
    <br>
    <div class="col-lg-4 col-lg-offset-4">
        <c:url var="logoutUrl" value="/logout" />
        <a class="btn btn-default" type="button" href="${logoutUrl}">log out</a>
    </div>


</body>  
</html>  