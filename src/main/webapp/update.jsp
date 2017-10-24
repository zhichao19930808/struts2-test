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
<s:form action="update" method="POST">
    <input type="hidden" name="fruit.id" value="<s:property value="fruit.id"/> ">
    <s:textfield label="水果名称" name="fruit.name" value="%{fruit.name}"/>
    <s:textfield label="水果种类" name="fruit.kind" value="%{fruit.kind}"/>
    <s:textfield label="生产日期" name="fruit.time" value="%{fruit.time}"/>
    <s:submit value="提交"/>
</s:form>
<s:debug/>
</body>
</html>
