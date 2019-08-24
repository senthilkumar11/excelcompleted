<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>IPO Details</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <header class="header">
        <ul class="nav-bar">
            
            <li> <a href="importStockPage.html">Import Data</a></li>
            <li><a href="/companylist"  >Manage Company</a></li>
            <li><a href="/stocklist">Manage Exchange</a></li>
            <li><a href="IPO.html"class="active">Update IPO details</a></li>
            <li style="float: right ;margin-right: 30px"><a href="#" id="logout-link">Logout</a></li>
        </ul>
        
    </header>

    <div class="main">

        <h1 style="text-align: center;line-height: 200px">Add IPO Plan</h1>
       <div class="table-list">	
		<form:form action="insertipo" method="POST"
			modelAttribute="ipo">
                            <table>
                            <tr><td>CompanyCode:</td><td><form:input path="companyCode" type="text" name="ccode" placeholder="Company Code" required="required"/></td></tr>
                            <tr><td>Company Name:</td><td><form:input path="companyName" type="text" name="IPOname" placeholder="Company Name" required="required"/></td></tr>
                         
                            <tr><td>Stock exchange Name:</td><td><form:input path="stockExchangeId" type="number" name="IPO_Add" placeholder="Stock Exchange Name" required="required"/></td></tr>

                            <tr><td>Price pershare:</td><td><form:input path="pricePerShare" type="text" name="Price per share" placeholder="Price per share" required="required"/></td></tr>
                            <tr><td>Total no of shares:</td><td><form:input path="totalNumberOfShares" type="number" name="IPO_Shares" placeholder="Total no of shares" required="required"/></td></tr>
                            <tr><td>Open Date</td><td><form:input path="openDateTime" type="text" name="ipo_date" placeholder="yyyy/MM/dd" plrequired="required"/></td></tr>
                            <tr><td>Remarks:</td><td><form:input path="remarks" type="text" name="IPO_Remarks" placeholder="Remarks" /></td></tr>
                        <tr><td colspan="2" style="text-align: center"><input class="button-style" type="submit" value="Submit"/>
                        </td></tr>
                        </table>
                
                </form:form>
       </div>
           <h1 style="text-align: center;line-height: 200px;"><a href="#" style=" text-decoration: none">Get company IPO</a></h1>
       
    </div>

    <footer class="footer">
        <p id="ftext">Copyright &copy: StockExchange 2019</p>
    </footer>
</body>

</html>