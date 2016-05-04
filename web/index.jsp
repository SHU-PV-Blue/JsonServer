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

  <title>光伏并网发电系统优化设计数据接口</title>
</head>
<body>
<div class="page-header">
  <h1 class="text-center">光伏并网发电系统优化设计数据接口</h1>
</div>
<div class="panel panel-default center-block text-center" style="width:800px;padding:30px">
  <h2><a href="weather/index.jsp">气象数据接口</a></h2>
  <h2><a href="pv-module/index.jsp">光伏组件数据接口</a></h2>
  <h2><a href="inverter-tandem/index.jsp">组串式逆变器数据接口</a></h2>
  <h2><a href="inverter-centralized/index.jsp">集中式逆变器数据接口</a></h2>
  <h2><a href="inverter-phase/index.jsp">相位逆变器数据接口</a></h2>
  <h2><a href="cable/index.jsp">电缆数据接口</a></h2>
  <h2><a href="dc-distribution/index.jsp">直流配电柜数据接口</a></h2>
  <h2><a href="dc-combiner/index.jsp">直流汇流箱数据接口</a></h2>
</div>
<div class="panel panel-default center-block text-center" style="width:800px;padding:10px">
  <h2>通用状态码说明：</h2>
  <div class="panel panel-default center-block text-center" style="width: 400px">
    <table class="table table-bordered table-striped">
      <thead>
      <tr>
        <th width="100px">状态码</th>
        <th>意义</th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <td>0</td><td>一切正常</td>
      </tr>
      <tr>
        <td>1</td><td>未知错误</td>
      </tr>
      <tr>
        <td>2</td><td>参数缺失</td>
      </tr>
      <tr>
        <td>3</td><td>参数值格式不合法或为空</td>
      </tr>
      <tr>
        <td>4</td><td>参数值超出范围</td>
      </tr>
      <tr>
        <td>5</td><td>存在冗余的参数项</td>
      </tr>
      <tr>
        <td>6</td><td>找不到相关数据或相关数据缺损</td>
      </tr>
      <tr>
        <td>7</td><td>访问过频</td>
      </tr>
      <tr>
        <td>8</td><td>无权访问</td>
      </tr>
      <tr>
        <td>9</td><td>未定义</td>
      </tr>
      </tbody>
    </table>
  </div>

</div>
</body>
</html>
