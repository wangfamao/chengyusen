<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>
</head>
<body>		
		<center>		
		<table id="myTable" border="1">
			<tr>
				<th><input type="checkbox" id="all" onchange="checkAll();"/></th>
				<th>编号</th>
				<th>账号</th>
				<th>密码</th>
				<th>操作&nbsp;<a href="javascript:void(0);" onclick="deleteMore(${sp});">批量删除</a></th>
			</tr>		
			<c:forEach items="${list }" var="user">
					
					<tr onmouseover="mouseOver(this);" onmouseout="mouseOut(this);">
						<td><input type="checkbox" name="student" value="${user.id }"/></td>
						<td>${user.id }</td>
						<td>${user.username }</td>
						<td>${user.password }</td>						
						<td>
							<a href="StudentServlet?opType=queryById&id=${user.id }&currentPage=${sp}">修改</a>
							|
							<a href="deleteById/${user.id} ">删除</a>
						</td>
					</tr>
			</c:forEach>
		</table>
		<!--  
		总记录数：${totals }&nbsp;&nbsp;
		总页数：${pageCounts }&nbsp;&nbsp;
		当前页：${sp }&nbsp;&nbsp;
		<a href="StudentServlet?opType=queryByPage&currentPage=1">首页</a>&nbsp;&nbsp;
		<a href="StudentServlet?opType=queryByPage&currentPage=${sp-1 }">上页</a>&nbsp;&nbsp;
		<a href="StudentServlet?opType=queryByPage&currentPage=${sp+1 }">下页</a>&nbsp;&nbsp;
		<a href="StudentServlet?opType=queryByPage&currentPage=${pageCounts }">末页</a>&nbsp;&nbsp;
		-->
	</center>
</body>
</html>