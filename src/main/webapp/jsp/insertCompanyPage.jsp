<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Companies</title>
<link rel="stylesheet" href="css/style.css"> 

</head>

<body>
	<header class="header">
		<ul class="nav-bar">

			<li><a href="importStockPage.html">Import Data</a></li>
			<li><a href="/companylist" class="active">Manage
					Company</a></li>
			<li><a href="/stocklist">Manage Exchange</a></li>
			<li><a href="IPO.html">Update IPO details</a></li>
			<li style="float: right; margin-right: 30px"><a href="#"
				id="logout-link">Logout</a></li>
		</ul>

	</header>

	<div class="main">

		<h1 style="text-align: center; line-height: 200px">Create New
			Company</h1>
		<div class="table-list">	
		<form:form action="insert" method="POST"
			modelAttribute="company">
			<table>
				<tr>
					<td>CompanyName:</td>
					<td><form:input type="text" path="companyName"
							placeholder="CompanyName"  />
							<form:errors path="companyName"/></td>
				</tr>
				<tr>
					<td>Ceo & Board of member name:</td>
					<td><form:input type="text" path="ceo" placeholder="CeoName"
							required="required" />
					<br></td>
				</tr>
				<tr>
					<td>sector id:</td>
					<td><form:input type="number" path="sectorId" name="sid"
							placeholder="sector id" required="required" /></td>
				</tr>
				<tr>
					<td>TurnOver:</td>
					<td><form:input type="decimal" path="turnOver" name="turnover"
							placeholder="Turnover" required="required" /></td>
				</tr>
				<tr>
					<td>Brief:</td>
					<td><form:input type="text" path="briefWriteUp" name="Brief" placeholder="Brief" /></td>
				</tr>
				<tr>
					<td>Stock Price ID:</td>
					<td><form:input type="number" path="stockPriceId" name="scode"
							placeholder="stock Price Id" required="required" /></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center"><input class="button-style"
							type="submit" value="Submit" /></td>
				</tr>
			</table>

		</form:form>
		</div>
	</div>

	<footer class="footer">
		<p id="ftext">Copyright &copy: StockExchange 2019</p>
	</footer>
</body>

</html>