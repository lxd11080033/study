<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/index_work.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript">




</script>



</head>
<body>

<table>
<form action="">
<tr>
<td>查询条件</td>
<td>时间<input type="date" name="min" value="${min }">--<input type="date" name="max" value="${max }"></td>
</tr>
<tr>
<td>采购名</td>
<td><input name="name" value="${name }"></td>

<td>采购行业</td>
<td><c:if test=""></c:if>
	<input type="checkbox" value="1" name="cid" <c:if test=" "></c:if> >永磁
	<input type="checkbox" value="2" name="cid">绿茶
	<input type="checkbox" value="3" name="cid">调味
</td>
<td><input type="submit" value="BC"></td>
</tr>

</form>
<c:forEach items="${list }" var="l">
<tr>
<td>${l.hang }</td>
<td>${l.chan }</td>
<td>${l.di }</td>
<td><fmt:formatDate  value="${l.time }" pattern="yyyy-MM-dd"/></td>
<td>${l.name }</td>
</tr>

</c:forEach>




</table>



</body>
</html>