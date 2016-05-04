<%--
  Created by IntelliJ IDEA.
  User: Jason Song(wolfogre.com)
  Date: 2016/4/29
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

  <title>直流配电柜数据接口</title>
</head>
<body>
<div class="page-header">
  <h1 class="text-center">直流配电柜数据接口</h1>
  <h2 align="right"><a href="../index.jsp">返回主页</a></h2>
</div>

<div class="panel panel-default center-block" style="width:800px;padding:30px">
  <h2>1.请求接口：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;/dc-distribution</p>
  <h2>2.响应信息：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;所有的直流配电柜数据：</p>
  <p class="lead">
    &nbsp;&nbsp;&nbsp;&nbsp;id（目前无意义），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;候选键{公司，型号}<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;接入直流路数（个）（字符串型，情况很复杂，存在多个值的已用斜线分开）<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;输入直流功率上限（W）(存在空值)<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;输入输出总电流上限（A）（字符串型，存在多值，已用斜线分开）(存在空值)<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;接入开路电压上限（V）<br/>
  </p>
  <h2>3.返回数据格式：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;直接拿数据用<a href="http://tool.oschina.net/codeformat/json">Json格式化工具</a>看</p>
</div>
</body>
</html>
