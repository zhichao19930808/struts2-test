<%--
  Created by IntelliJ IDEA.
  User: Glory
  Date: 2017/10/23
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
取值标签：可以取出任何一个控制器的值
<s:property/> <br>
ognl表达式 基本运算符 <br>
<s:property value="5+5"/> <br>
<s:property value="5-5"/><br>
<s:property value="5*5"/><br>
<s:property value="5/5"/><br>
<s:property value="5%5"/><br>
ognl表达式 比较运算符 <br>
<s:property value="5>5"/> <br>
<s:property value="5>=5"/> <br>
<s:property value="5<5"/> <br>
<s:property value="5!=5"/> <br>
<s:property value="5==5"/> <br>
ognl表达式 逻辑运算符 <br>
<s:property value="!(5!=5)"/> <br>
<s:property value="!((5!=5)&&(6!=6))"/> <br>
<s:property value="!((5!=5)||(5!=6))"/> <br>
ognl表达式 三元运算符 <br>
<s:property value="5>6?9:0"/> <br>
ognl表达式 非空运算 <br>
<s:property value="sss ==null"/> <br>
<%--<s:property value="empty sss"/> <br>--%>
</body>
</html>
