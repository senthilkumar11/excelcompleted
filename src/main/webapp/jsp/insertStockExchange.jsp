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
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <header class="header">
        <ul class="nav-bar">
            
            <li> <a href="importStockPage.html">Import Data</a></li>
            <li><a href="/companylist" >Manage Company</a></li>
            <li><a href="/stocklist" class="active">Manage Exchange</a></li>
            <li><a href="IPO.html">Update IPO details</a></li>
            <li style="float: right ;margin-right: 30px"><a href="#" id="logout-link">Logout</a></li>
        </ul>
        
    </header>

    <div class="main">

        <h1 style="text-align: center;line-height: 200px">Create New Stock Exchange</h1>
        	<div class="table-list">
        <form:form  action="insertstock" method="POST" modelAttribute="stockex">
                            <table>
                            <tr><td>Stock Name:</td><td><form:input path="name" type="text" name="sname" placeholder="StockName"/></td></tr>
                          
                            <tr><td>Contract Address:</td><td><form:input path="contactAddress" type="text" name="conadd" placeholder="Stock Exchange Name"/></td></tr>
                            <tr><td>Brief:</td><td><form:input path="brief" type="text" name="sBrief" placeholder="Brief"/></td></tr>
                            <tr><td>Remarks:</td><td><form:input path="remarks" type="text" name="sremarks" placeholder="Remarks"/></td></tr>
                        <tr><td colspan="2" style="text-align: center" ><input class="button-style" type="submit" value="Submit"/>
                        </td></tr>
                        </table>
                
              </form:form>
              
       </div>
    </div>

    <footer class="footer">
        <p id="ftext">Copyright &copy: StockExchange 2019</p>
    </footer>
</body>

</html>
