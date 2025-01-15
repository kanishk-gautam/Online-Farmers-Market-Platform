<!DOCTYPE html>
<html lang="en">
<head>
    <title>Available Produce</title>
</head>
<body>
    <h1>Produce List</h1>
    <ul>
        <c:forEach items="${produceList}" var="item">
            <li>${item}</li>
        </c:forEach>
    </ul>
</body>
</html>
