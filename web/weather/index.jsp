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

  <title>气象数据接口</title>
</head>
<body>
<div class="page-header">
  <h1 class="text-center">气象数据接口</h1>
  <h2 align="right"><a href="../index.jsp">返回主页</a></h2>
</div>
<div class="panel panel-default center-block" style="width:800px;padding:30px">
  <h2>1.请求接口：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;/weather?lat=[纬度]&lon=[经度]</p>
  <h2>2.响应信息：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;1月至12月的辐照度(kWh/m^2/day)、温度(°C)、湿度(%)、风速(m/s)、H0(kWh/m^2/day)、Hd(kWh/m^2/day)、Kt(kWh/m^2/day)、ω_s(degrees)</p>
  <h2>3.返回数据格式：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;H->辐照度；temperature->温度；humidity->湿度；wind->风速；H0->H0、Hd->Hd、Kt->Kt、Ws->ω_s</p>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;直接拿数据用<a href="http://tool.oschina.net/codeformat/json">Json格式化工具</a>看</p>
</div>
</body>
</html>
