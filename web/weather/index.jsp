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
  <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;1月至12月的辐照度、温度、湿度、风速</p>
  <h2>3.返回数据格式：</h2>
  <link rel='stylesheet' type='text/css' href='http://tools.oschina.net/js/syntaxhighlighter_3.0.83/styles/shCoreDefault.css'/><div id="highlighter_741847" class="syntaxhighlighter  js"><table border="0" cellpadding="0" cellspacing="0"><tbody><tr><td class="gutter"><div class="line number1 index0 alt2">1</div><div class="line number2 index1 alt1">2</div><div class="line number3 index2 alt2">3</div><div class="line number4 index3 alt1">4</div><div class="line number5 index4 alt2">5</div><div class="line number6 index5 alt1">6</div><div class="line number7 index6 alt2">7</div><div class="line number8 index7 alt1">8</div><div class="line number9 index8 alt2">9</div><div class="line number10 index9 alt1">10</div><div class="line number11 index10 alt2">11</div></td><td class="code"><div class="container"><div class="line number1 index0 alt2"><code class="js plain">{</code></div><div class="line number2 index1 alt1"><code class="js spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="js string">"code"</code><code class="js plain">:&nbsp;0,&nbsp;</code></div><div class="line number3 index2 alt2"><code class="js spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="js string">"data"</code><code class="js plain">:&nbsp;{</code></div><div class="line number4 index3 alt1"><code class="js spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="js string">"temperature"</code><code class="js plain">:&nbsp;[1.1,&nbsp;2.2,&nbsp;3.3,&nbsp;4.4,&nbsp;5.5,&nbsp;6.6,&nbsp;7.7,&nbsp;8.8,&nbsp;9.9,&nbsp;10.1,&nbsp;11.1,&nbsp;12.1],&nbsp;</code></div><div class="line number5 index4 alt2"><code class="js spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="js string">"irradiance"</code><code class="js plain">:&nbsp;[1.1,&nbsp;2.2,&nbsp;3.3,&nbsp;4.4,&nbsp;5.5,&nbsp;6.6,&nbsp;7.7,&nbsp;8.8,&nbsp;9.9,&nbsp;10.1,&nbsp;11.1,&nbsp;12.1],&nbsp;</code></div><div class="line number6 index5 alt1"><code class="js spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="js string">"humidity"</code><code class="js plain">:[1.1,&nbsp;2.2,&nbsp;3.3,&nbsp;4.4,&nbsp;5.5,&nbsp;6.6,&nbsp;7.7,&nbsp;8.8,&nbsp;9.9,&nbsp;10.1,&nbsp;11.1,&nbsp;12.1],&nbsp;</code></div><div class="line number7 index6 alt2"><code class="js spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="js string">"wind"</code><code class="js plain">:&nbsp;[1.1,&nbsp;2.2,&nbsp;3.3,&nbsp;4.4,&nbsp;5.5,&nbsp;6.6,&nbsp;7.7,&nbsp;8.8,&nbsp;9.9,&nbsp;10.1,&nbsp;11.1,&nbsp;12.1],&nbsp;</code></div><div class="line number8 index7 alt1"><code class="js spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="js plain">},&nbsp;</code></div><div class="line number9 index8 alt2"><code class="js spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="js string">"lon"</code><code class="js plain">:&nbsp;</code><code class="js string">"1.5"</code><code class="js plain">,&nbsp;</code></div><div class="line number10 index9 alt1"><code class="js spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="js string">"lat"</code><code class="js plain">:&nbsp;</code><code class="js string">"12.5"</code></div><div class="line number11 index10 alt2"><code class="js plain">}</code></div></div></td></tr></tbody></table></div>
</div>
</body>
</html>
