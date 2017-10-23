<%@ page session="true" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.time.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.List" %>
<%@ page import="jp.practice.sales.Item" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/sales/resources/css/common.css" />
	<title>売り上げシステム（明細追加画面）</title>
</head>
<body>
<div class="header">
	××オンラインショップ
	<%  Calendar calendar = Calendar.getInstance();
   		SimpleDateFormat sdf = new SimpleDateFormat();
   		sdf.applyPattern("MM月dd日(E)");
   		System.out.println(sdf.format(calendar.getTime()));
   		List<Item> recordList = (List<Item>) session.getAttribute("recordList");
   		%>

   	<%= sdf.format(calendar.getTime()) %>
</div>




<%-- <form:form modelAttribute="salesForm" action="/sales/system"> --%>



<span style="color:blue;">
<c:out value="${s_msg}" />
</span>
<span style="color:red;">
<c:out value="${e_msg}" />
</span>

<%--売り上げIDを求める --%>
<%
	LocalDateTime from = LocalDateTime.of(1970, 1, 1,  0,  0);
	LocalDateTime to = LocalDateTime.now();
	Duration duration = Duration.between(from,to);
	long uriage_id = duration.toMillis();
%>
売上ID = <%= uriage_id %>
<br><br><br>


売上明細<br>
<form:form modelAttribute="salesForm" action="/sales/system">
<table border = "1">
<tr><th>商品ID</th><th>商品名</th><th>単価</th><th>点数</th><th>小計</th></tr>


<c:forEach items="${recordList}" var="record">

<tr>
<td><c:out value="${record.id}" /></td>
<td><c:out value="${record.name}" /></td>
<td><c:out value="${record.price}" /></td>
<td><c:out value="${record.quantity}" /></td>
<td><c:out value="${record.subtotal}" /></td>
</tr>


</c:forEach>
</table>



<input type="submit" name="end" value="終了" />
</form:form>
</body>
</html>
