<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Glory
  Date: 2017/10/24
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<s:form action="findAll.action" method="POST">
    <input type="hidden" name="id" value="">
    <s:textfield label="水果名称" name="name"/>
    <s:textfield label="水果种类" name="kind"/>
    <s:textfield label="生产日期" name="time"/>
    <s:submit value="提交"/>
</s:form>
</body>
</html>