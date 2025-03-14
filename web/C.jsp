<%-- 
    Document   : C
    Created on : Mar 14, 2025, 4:14:56 PM
    Author     : MADUSANKA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <button onclick="test()">Send Request</button>
        <script>
            function test() {
                var r = new XMLHttpRequest();

                r.onreadystatechange = function () {
                    if (r.readyState == 4 && r.status == 200) {
                        alert(r.responseText)
                    }
                };

                r.open('GET', 'D.jsp', true);
                r.send()
            }
        </script>
    </body>
</html>
