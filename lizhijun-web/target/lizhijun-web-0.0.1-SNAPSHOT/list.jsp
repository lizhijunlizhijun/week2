<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<td>序号</td>
			<td>会议编号</td>
			<td>会议名称</td>
			<td>开始日期</td>
			<td>结束日期</td>
			<td>会议类型</td>
			<td>创建时间</td>
		</tr>
		
		<c:forEach items="${page.list }" var ="m">
			<tr>
				<td>${m.mid }</td>
				<td>${m.code }</td>
				<td>${m.mname }</td>
				<td>${m.start_time }</td>
				<td>${m.end_time }</td>
				<td>${m. tname}</td>
				<td>${m.create_time }</td>
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="10">
				<a href="?pageNum=${page.firstPage }">首页</a>
				<a href="?pageNum=${page.prePage }">上一页</a>
				<a href="?pageNum=${page.nextPage }">下一页</a>
				<a href="?pageNum=${page.lastPage }">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>