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

<table>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>kind</td>
        <td>time</td>
    </tr>
    <s:iterator id="f" value="fruits">
        <tr>
            <td><s:property value="#f.id"/> </td>
            <td><s:property value="#f.name"/> </td>
            <td><s:property value="#f.kind"/> </td>
            <td><s:property value="#f.time"/> </td>
        </tr>
    </s:iterator>
</table>

<s:debug></s:debug>
</body>
</html>
