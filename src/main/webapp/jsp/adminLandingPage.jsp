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
            <li> <a href="importStockPage.html" >Import Data</a></li>
            <li><a href="/companylist">Manage Company</a></li>
            <li><a href="/stocklist">Manage Exchange</a></li>
            <li><a href="IPO.html">Update IPO details</a></li>
            <li style="float: right ;margin-right: 30px"><a href="#" id="logout-link">Logout</a></li>
        </ul>
        
    </header>

    <div class="main">
    
        <h1 style="text-align: center;line-height: 200px">MARKET ACTION</h1>


        <div class="india-stc"  style="overflow-x:auto;">
            <table>
                <tr >
                    <th style="text-align: center" colspan="4">INDIAN INDICES</th>
                </tr>
                <tr>
                    <th style="color: black">Index</th>
                    <th>Price</th>
                    <th>Change</th>
                    <th>%Chg</th>
                </tr>
                <tr>
                    <td style="color: black">NIFTY 50</td>
                    <td>10980.00</td>
                    <td>-138.00	</td>
                    <td>-1.24</td>
                </tr>
                <tr>
                    <td style="color: black">SENSEX</td>
                    <td>37018.32</td>
                    <td>-462.80</td>
                    <td>-1.23</td>

                </tr>
                <tr>
                    <td style="color: black">NIFTY BANK</td>
                    <td>28367.30</td>
                    <td>-508.70</td>
                    <td>-1.76</td>
                </tr>
                <tr>
                    <td style="color: black">NIFTY IT</td>
                    <td>15332.10</td>
                    <td>-288.10</td>
                    <td>-1.84</td>
                </tr>
                <tr>
                    <td style="color: black">S&P BSE Smallcap</td>
                    <td>12551.94</td>
                    <td>-140.24</td>
                    <td>-1.10</td>
                </tr>
            </table>
        </div>


        <div class="global-stc"  style="overflow-x:auto;">
            <table>
                <tr >
                    <th style="text-align: center" colspan="4">GLOBAL INDICES</th>
                </tr>
                <tr>
                    <th style="color: black">Index</th>
                    <th>Price</th>
                    <th>Change</th>
                    <th>%Chg</th>
                </tr>
                <tr>
                    <td style="color: black">NIFTY 50</td>
                    <td>10980.00</td>
                    <td>+138.00	</td>
                    <td>+1.24</td>
                </tr>
                <tr>
                    <td style="color: black">SENSEX</td>
                    <td>37018.32</td>
                    <td>+462.80</td>
                    <td>+1.23</td>

                </tr>
                <tr>
                    <td style="color: black">NIFTY BANK</td>
                    <td style="color:RED">28367.30</td>
                    <td style="color:RED">-508.70</td>
                    <td style="color:RED">-1.76</td>
                </tr>
                <tr>
                    <td style="color: black">NIFTY IT</td>
                    <td style="color:RED">15332.10</td>
                    <td style="color:RED">-288.10</td>
                    <td style="color:RED">-1.84</td>
                </tr>
                <tr>
                    <td style="color: black">S&P BSE Smallcap</td>
                    <td>12551.94</td>
                    <td>+140.24</td>
                    <td>+1.10</td>
                </tr>
            </table>
            </table>
        </div>


    </div>
    <footer class="footer">
        <p id="ftext">Copyright &copy: StockExchange 2019</p>
    </footer>
</body>

</html>-