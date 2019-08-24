<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Stock Market</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <header class="header">
        <ul class="nav-bar">
            <li> <a href="listIPO.html" >IPOs</a></li>
            <li><a href="comparisonPage.html" class="active">Compare Company</a></li>
            <li><a href="#">Compare Sectors</a></li>
            <li><a href="#">Other</a></li>
            <li style="float: right ;margin-right: 30px"><a href="#" id="logout-link">Logout</a></li>
        </ul>
        
    </header>

    <div class="main">
            <h1 style="text-align: center;line-height: 200px">Compare</h1>
            <div class="table-list">
                <form action="#">
            <table >
                    <tr>
                            <th colspan="2">Sector</th>
                            <td colspan="2"><input type="text" name="sector" value="Enter Sector"></td>
                        </tr>
                    <tr>
                        <th colspan="2">Stock Exchange</th>
                        <td colspan="2"><input type="text" name="StockExchange" value="Enter Stock Exchange"></td>
                    </tr>
                    <tr>
                            <th colspan="2">Company Name</th>
                            <td colspan="2"><input type="text" name="company" value="Enter Company"></td>
                        </tr>
                    <tr>
                        <th colspan="2">No of records imported</th>
                        <td colspan="2"><input type="text" name="records" value="Enter no of records"></td>
                    </tr>
                    <tr>
                        <th>From Date</th>
                        <td><input type="date" name="fromDate"></td>
                        <th>To Date</th>
                        <td><input type="date" name="toDate"></td>
                    </tr>
                    <tr>   <td  colspan="4" style="text-align: center"><input class="button-style" type="button" value="Generate Map"></td></tr>
            </table>
        </form>
         
        </div>
    </div>
    <footer class="footer">
        <p id="ftext">Copyright &copy: StockExchange 2019</p>
    </footer>
</body>

</html>