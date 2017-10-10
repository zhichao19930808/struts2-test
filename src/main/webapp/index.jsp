<%--
  Created by IntelliJ IDEA.
  User: Glory
  Date: 2017/10/10
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="<%=request.getContextPath()%>/saveUser.action?user.name=1&user.address=2&user.password=3" method="post">
      <input type="text" name="name">
      <input type="text" name="address">
      <input type="password" name="password">
      <input type="submit">
  </form>
  </body>
</html>
