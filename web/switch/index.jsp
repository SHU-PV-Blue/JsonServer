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

  <title>开关柜数据接口</title>
</head>
<body>
<div class="page-header">
  <h1 class="text-center">开关柜数据接口</h1>
  <h2 align="right"><a href="../index.jsp">返回主页</a></h2>
</div>
<div class="panel panel-default center-block" style="width:800px;padding:30px">
  <h2>1.请求接口：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;/switch?type=[高压|低压]</p>
  <h2>2.响应信息：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;所有的高压光伏组件或低压开关柜数据：</p>
  <p class="lead">
    &nbsp;&nbsp;&nbsp;&nbsp;id（目前无意义），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;类型：高压或低压，<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;候选键{品牌（可为空），型号}，<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;母线额定电流（A）（存在多值，字符串型，可为空），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;额定电压（V）（可为空），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;额定频率（Hz），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;防护等级（可为空），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;用途（可为空），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;结构形式，<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;价格下限（￥），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;价格上限（￥），</p>
  <h2>3.返回数据格式：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;直接拿数据用<a href="http://tool.oschina.net/codeformat/json">Json格式化工具</a>看</p>
</div>
</body>
</html>
