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

  <title>光伏组件数据接口</title>
</head>
<body>
<div class="page-header">
  <h1 class="text-center">光伏组件数据接口</h1>
  <h2 align="right"><a href="../index.jsp">返回主页</a></h2>
</div>
<div class="panel panel-default center-block" style="width:800px;padding:30px">
  <h2>1.请求接口：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;/pv-module</p>
  <h2>2.响应信息：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;所有的光伏组件数据：</p>
  <p class="lead">
    &nbsp;&nbsp;&nbsp;&nbsp;id（目前无意义），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;候选键{公司，类型，系列，型号，峰值功率（Wp）}，<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;开路电压（V），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;最大功率点电压（V），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;最大功率点电流（A），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;短路电流（A），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;转换效率（%），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;开路电压温度系数（%/℃），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;最大功率温度系数（%/℃），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;短路电流温度系数（%/℃），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;长度（mm），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;宽度（mm），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;重量（kg），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;工作温度下限（℃），<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;工作温度上限（℃）</p>
  <h2>3.返回数据格式：</h2>
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;直接拿数据用<a href="http://tool.oschina.net/codeformat/json">Json格式化工具</a>看</p>

</div>
</body>
</html>
