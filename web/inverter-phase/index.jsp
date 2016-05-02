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

  <title>相位逆变器数据接口</title>
</head>
<body>
<div class="page-header">
  <h1 class="text-center">相位逆变器数据接口</h1>
  <h2 align="right"><a href="../index.jsp">返回主页</a></h2>
</div>
<div class="panel panel-default center-block" style="width:800px;padding:30px">
  <h2>1.请求接口：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;/inverter-phase</p>
  <h2>2.响应信息：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;所有的相位逆变器（目前含单相和三相）的数据：</p>
  <p class="lead">
   &nbsp;&nbsp;&nbsp;&nbsp;候选键{相位，厂家，型号}（相位字段可能是冗余的候选，目前不影响）<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;额定输入电压（V）<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;额定输入电流（A）<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;输入电压下限（V）<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;输入电压上限（V）<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;额定容量（VA）<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;额定输出功率（W）<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;额定输出电压（V）注意！此字段不是数字类型，而是字符串，因为有些逆变器的额定输入电压是多选值，形如"220/380"<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;额定输出电流（A）<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;逆变效率（%）<br/>
  </p>
  <h2>3.返回数据格式：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;直接拿数据用<a href="http://tool.oschina.net/codeformat/json">Json格式化工具</a>看</p>
</div>
</body>
</html>
