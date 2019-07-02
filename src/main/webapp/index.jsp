<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="${path }/admin/addBook.do?pubName=${"出版社"}">添加书籍</a>
<a href="${path }/admin/addPublish.do?pubName='第一出版社' &pubPhone='12345678909'&add='地址'">添加出版社</a>

</body>
</html>
