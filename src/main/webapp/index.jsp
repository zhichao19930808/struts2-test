<%--
  Created by IntelliJ IDEA.
  User: Glory
  Date: 2017/10/10
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="<%=request.getContextPath()%>/saveUser.action?user.name=1&user.address=2&user.password=3" method="post">
      <input type="text" name="name" >
      <input type="text" name="address">
      <input type="password" name="password">
      <input type="submit">
  </form>
-------------------------------------------------------------------------------------------------------------------------
  <h4>ognl标签</h4>
  <s:form action="findAll" method="POST">
      <%--文本标签--%>
      <s:textfield name="name" label="姓名"/>
      <%--密码标签--%>
      <s:password name="password" label="密码"/>
      <%--提交标签--%>
      <s:submit value="提交"/>
  </s:form>
  -----------------------------------------------------------------------------------------------------------------------
  <h4>文件上传</h4>
  <form action="<%=request.getContextPath()%>/upFile.action" method="post" enctype="multipart/form-data">
      <input type="file" name="uploadfile">
      <input type="submit" value="上传">
  </form>
  </body>
</html>
