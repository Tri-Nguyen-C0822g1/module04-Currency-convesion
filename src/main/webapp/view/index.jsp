<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Conversion</title>
</head>
<body>
<center>
    <h2>
        <a href="/conversion">List All Users</a>
    </h2>
</center>
<div align="center">
    <form method="post" action="/conversions">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Currency Conversion</h2>
            </caption>
            <tr>
                <th>USD</th>
                <td>
                    <input type="text" name="usd" id="usd" value="${usd}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>VND</th>
                <td>
                    <p id="vnd">${result}</p>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="conv" value="Convert"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>