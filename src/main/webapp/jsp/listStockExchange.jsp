<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.premium.stc.model.StockExchange"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>COmpanies</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <header class="header">
        <ul class="nav-bar">
            
            <li> <a href="importStockPage.html" >Import Data</a></li>
            <li><a href="/companyList" >Manage Company</a></li>
            <li><a href="/stocklist" class="active">Manage Exchange</a></li>
            <li><a href="IPO.html">Update IPO details</a></li>
            <li style="float: right ;margin-right: 30px"><a href="#" id="logout-link">Logout</a></li>
        </ul>
        
    </header>

    <div class="main">

        <h1 style="text-align: center;line-height: 200px">List of Stock Exchange</h1>

    <div class="table-list">
        <%List stockList=(List)request.getAttribute("list"); %>
           
         
            <table>
          
            <tr>
              <th >Name</th>
              <th >Brief</th>
              <th >Contact Address</th>
              <th >Remarks</th>
              <th >Update</th>
            </tr>
            <%for(int i=0;i<stockList.size();i++)
            	{
            	StockExchange stock=(StockExchange)stockList.get(i);
            	%>
            <tr>
              <th ><%=stock.getName() %></th>
              <td><%=stock.getBrief() %> </td>
              <td><%=stock.getContactAddress() %></td>
              <td><%=stock.getRemarks() %></td>
              <td><input type="submit" value="Update"/>
            </tr>
            <%} %>
          
        </table>
          
        
     
    </div>
    <h1 style="text-align: center;line-height: 200px;"><a href="/insertstock " style=" text-decoration: none">Add Stock Exchange</a></h1>
  </div>
    

    <footer class="footer">
        <p id="ftext">Copyright &copy: StockExchange 2019</p>
    </footer>
</body>

</html>