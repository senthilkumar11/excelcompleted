<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Stock Exchange</title>
    <style>
        body {
            background-color: #29363f;
        }

        .register {
            width: 320px;
            margin-left: auto;
            margin-right: auto;
            margin-top: 250px;
            margin-bottom: auto;
            border: 1px #CCC solid;
            padding: 30px;
            background-color: #29363f;
            color: #FFF;
            text-align: center;
        }

        .field,
        .btn {
            border: 1px #525d65 solid;
            padding: 10px;
        }

        .field {
            background: #29363f;
            margin: 5px 25px;
            width: 216px;
            color: #FFF;
        }

        .login h1,
        h3,
        label,
        .login p,
        .btn,
        .forgot {
            color: #CCC;
        }

        .btn {
            background-color: #29363f;
            font-weight: bold;
            margin: 10px 25px;
            width: 238px;
        }
    </style>
</head>

<body>

    <div class="register">
        <h1>Stock Exchange</h1>
        <h3>User Registration</h3>
        <form:form action="/registerUser" method="POST" modelAttribute="user1">
            
            <label for="username">User Name</label>
            <form:input path="userName" class="field" id="username" type="text" placeholder="user name" required="required"/>
           

            <label for="email">Email</label>
            <form:input path="email" class="field" id="email" type="email" placeholder="Email" />

            <label for="mobile">Mobile Number</label>
            <form:input path="mobileNumber" class="field" id="mobile" type="text" placeholder="Mobile Number"  />

            <label for="password">Password</label>
            <form:input path="password" class="field"  id="password" type="password" placeholder="Password"/>

                        <input class="btn" type="submit" value="Register">
                  Existing User <a href="/registerUser" class="forgot">Login</a> |    
        </form:form>
    </div>
</body>

</html>