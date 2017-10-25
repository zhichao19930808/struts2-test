<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Glory
  Date: 2017/10/23
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h3>条件查询：</h3>
<s:form action="findByCondition" method="POST" theme="simple">
水果名称:<s:textfield  name="fruit.name"/>
水果种类:<s:textfield  name="fruit.kind"/>
生产日期:<s:textfield name="fruit.time"/>
<s:submit value="查询"/>
</s:form>
<table>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>kind</td>
        <td>time</td>
    </tr>
    <s:iterator value="fruits" var="f">
        <tr>
            <td><s:property value="#f.id"/> </td>
            <td><s:property value="#f.name"/> </td>
            <td><s:property value="#f.kind"/> </td>
            <td><s:property value="#f.time"/> </td>
            <td><s:a href="findById.action?id=%{#f.id}">编辑</s:a> </td>
            <!--<td><a href="deleteById.action?id=<s:property value ="#f.id"/>">删除</a> </td>-->
            <td><s:a href="deleteById.action?id=%{#f.id}">删除</s:a></td>
        </tr>
    </s:iterator>
    <tr>
        <td><s:a href="add.jsp">添加</s:a></td>
    </tr>
</table>

<s:debug/>
</body>
</html>
