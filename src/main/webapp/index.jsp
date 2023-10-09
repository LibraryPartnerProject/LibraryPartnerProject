<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Management System</title>
</head>
<body>
    <h1>Library Management System</h1>
    <form action="showBooks" method="get">
        <input type="submit" value="Show Books" />
    </form>
    <a href="updateBooks.jsp">Update Books</a>
    <a href="deleteBooks.jsp">Delete Books</a>
    <a href="addBooks.jsp">Add Books</a>
    <form action="showAuthors" method="get">
        <input type="submit" value="Show Authors" />
    </form>
    <a href="updateAuthors.jsp">Update Authors</a>
    <a href="deleteAuthors.jsp">Delete Authors</a>
    <a href="addAuthors.jsp">Add Authors</a>
</body>
</html>