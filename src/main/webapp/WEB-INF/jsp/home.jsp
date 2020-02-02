<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SDAcademy Hello!</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
<h1>Spring JSP SDAcademy</h1>
<h2 class="hello-title">Sample Hello! ${name}</h2>
<script src="/js/main.js"></script>
<hr>
<div> ${projects}
        <table border="1">
    <c:forEach items="${projects}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.startDate}</td>
            <td>${item.team}</td>
        </tr>
    </c:forEach>
    </table>
</div>
<hr>
<div>
    ${project.name}
</div>
<hr>

</body>
</html>