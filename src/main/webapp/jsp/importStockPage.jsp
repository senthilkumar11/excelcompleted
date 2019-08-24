<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Import Details</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <header class="header">
        <ul class="nav-bar">
            <li> <a href="importStockPage.html" class="active">Import Data</a></li>
            <li><a href="/companylist">Manage Company</a></li>
            <li><a href="/stocklist">Manage Exchange</a></li>
            <li><a href="IPO.html">Update IPO details</a></li>
            <li style="float: right ;margin-right: 30px"><a href="#" id="logout-link">Logout</a></li>
        </ul>
        
    </header>

    <div class="main">

        <h1 style="text-align: center;line-height: 200px">IMPORT EXCEL</h1>
        <div style="text-align: center" class="form-style">
            <form action="stockDetailsPage.html">
                <label for="excel-file">Select Excel file to be uploaded</label>
                <input type="file" name="excel" id="excel-file"><br>
                <input type="submit" value="Upload">
            </form>
        </div>
    </div>

    <footer class="footer">
        <p id="ftext">Copyright &copy: StockExchange 2019</p>
    </footer>
</body>

</html>