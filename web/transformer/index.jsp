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

  <title>变压器数据接口</title>
</head>
<body>
<div class="page-header">
  <h1 class="text-center">变压器数据接口</h1>
  <h2 align="right"><a href="../index.jsp">返回主页</a></h2>
</div>
<div class="panel panel-default center-block" style="width:800px;padding:30px">
  <h2>1.请求接口：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;/switch?type=[10KV变压器|35KV变压器(0.4-35KV)|35KV变压器(10-35KV)]</p>
  <h2>2.响应信息：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;所有的选定类型的变压器数据，对于 10KV变压器 或 35KV变压器(0.4-37KV)：</p>
  <p class="lead">
    &nbsp;&nbsp;&nbsp;&nbsp;id（目前无意义），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;类型：选定的类型，<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;候选键{产品名，分类（可为空），额定容量（VA）}，<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;额定电压（字符串类型），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;高压分接范围（字符串类型，可为空），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;联结组标号（字符串类型），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;空载损耗（W）（字符串类型），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;负载损耗（W）（字符串类型），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;空载电流（%），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;短路阻抗（%），<br/>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;对于 35KV变压器(10-35KV)，只有一条记录：</p>
  <p class="lead">
    &nbsp;&nbsp;&nbsp;&nbsp;类型：35KV变压器(10-35KV)<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;候选键{产品名，额定容量（VA）}，<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;额定频率（Hz），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;额定电流（A），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;空载额定变比（字符串类型），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;半穿越阻抗电压（%），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;调压方式（字符串类型），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;额定电压（字符串类型），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;调压范围（字符串类型），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;联接组标号（字符串类型），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;中性点接地方式（字符串类型），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;极性（字符串类型），<br/>
  <h2>3.返回数据格式：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;直接拿数据用<a href="http://tool.oschina.net/codeformat/json">Json格式化工具</a>看</p>
</div>
</body>
</html>
