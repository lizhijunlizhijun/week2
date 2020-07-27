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
<script type="text/javascript">

	function update() {
		$.post("queryType",{"mid":mid},function(data){
			for ( var i in iterable) {
				$("#mid").append("<option value='"+data[i].tid+"'>"+data[i].tname+"</option>");d
			}
		})
	}

</script>

</head>
<body>
	<form action="updatemeet" method="post">
		<input type="hidden" name="mid" value="${meet.mid }">
		会议编号:<input type="text" name="code" value="${meet.code }"><br>
		会议名称:<input type="text" name="mname" value="${meet.mname }"><br>
		会议日期:<input type="date" name="start_time" value="${meet.start_time }">~<input type="date" name="end_time" value="value="${meet.end_time }""><br>
		会议地址:<select id="mid">
			<option value=''>请选择</option>
		</select>
		
		<input type="button" value="保存" onclick="update()"> 
	</form>
</body>
</html>