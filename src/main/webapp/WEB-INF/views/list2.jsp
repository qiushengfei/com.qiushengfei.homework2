<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
<h3>第2题:你们公司里用的Web层框架是什么?</h3> 
<table class="table">
	<tr>
		<th>选项</th>
		<th>小计</th>
		<th>笔记</th>
		<th>比例</th>
	</tr>
		<c:forEach items="${list}" var="a">
		<tr>
			<td>${a.name}</td>
			<td>${a.votes}</td>
			<td>
			<div class="progress" style="width: 400px">
			 <div class="progress-bar" role="progressbar" style="width:${a.bfb}" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
  </div>
${a.bfb}
			</td>
			
			
		 </td>
		 <td><input type="button" class="btn btn-primary" value="更新" onclick="update(${a.id})"></td>
		</tr>
		</c:forEach>
		<tr>
			<th>本体有效填写人数</th>
			<td>${i}</td>
			<td></td>
			<td></td>
		
		</tr>
		
</table>
<input type="button" class="btn btn-primary" value="上一题" onclick="xxx()" />
</body>
<script type="text/javascript">
function update(id){
	location="${pageContext.request.contextPath}/toupdate?id="+id;
}
function xxx(){
	location="${pageContext.request.contextPath}/list";
}
</script>
</html>