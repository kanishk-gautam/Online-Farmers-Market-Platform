<!DOCTYPE html>
<html lang="en">
<head>
    <title>Farmer Registration</title>
</head>
<body>
    <h1>Register as a Farmer</h1>
    <form method="post" action="FarmerServlet">
        <label>Name: <input type="text" name="name" required></label><br>
        <label>Produce: <input type="text" name="produce" required></label><br>
        <label>Price per Kg: <input type="number" name="price" step="0.01" required></label><br>
        <button type="submit">Register</button>
    </form>
</body>
</html>
