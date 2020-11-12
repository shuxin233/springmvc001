<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<a href="user/findAll">测试SpringMVC查询</a>

<form action="user/insert" method="post">
    ID：<input type="text" name="id" /><br/>
    姓名：<input type="text" name="name" /><br/>
    性别：<input type="text" name="sex" /><br/>
    年龄：<input type="text" name="age" /><br/>
    <input type="submit" value="添加"/><br/>
</form>

</body>
</html>
