<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.premium.stc.model.Company"    pageEncoding="UTF-8"%>
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
            
            <li> <a href="importStockPage.jsp" >Import Data</a></li>
            <li><a href="/companylist" class="active">Manage Company</a></li>
            <li><a href="/stocklist">Manage Exchange</a></li>
            <li><a href="IPO.jsp">Update IPO details</a></li>
            <li style="float: right ;margin-right: 30px"><a href="#" id="logout-link">Logout</a></li>
        </ul>
        
    </header>

    <div class="main">

        <h1 style="text-align: center;line-height: 200px">List of Companies</h1>

    <div class="table-list" >
     <% List companyList=(List)request.getAttribute("list");
%>
     
      <table>
   
      <tr>
        <th >Company id</th>
        <th >Company Name</th>
        <th >CEO,BOD</th>
        <th >Breif</th>
        <th >Update</th>
      </tr>
  <%for(int i=0;i<companyList.size();i++){
	Company com=(Company)companyList.get(i);
	%>
      <tr>
        <th><%=com.getId() %></th>
        <td><%=com.getCompanyName() %></td>
        <td><%=com.getCeo() %></td>
        <td><%=com.getBriefWriteUp() %></td>
        <td><input type="submit" value="Update"/></td>
      </tr>
     
   <%} %>
  </table>
    </div>
    <h1 style="text-align: center;line-height: 200px;"><a href="/insertcompany" style=" text-decoration: none">Add company</a></h1>
  </div>
    

    <footer class="footer">
        <p id="ftext">Copyright &copy: StockExchange 2019</p>
    </footer>
</body>

</html>