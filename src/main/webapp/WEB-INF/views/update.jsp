<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/index.css">
<!-- 引入js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
<title>Insert title here</title>
</head>
<body>
<h3>更新投票</h3>
<form:form modelAttribute="p" method="post" action="${pageContext.request.contextPath}/update">
<form:hidden path="id" name="id"/>
投票项目名称:<form:input path="name" name="name" /> <br>
所属主题名称:<form:select items="${list}" path="tid" itemLabel="tname" itemValue="tid"/><br>
投票项目票数:<form:input path="votes" name="votes"/><br>
<form:button>更新</form:button>

</form:form>


</body>
</html>