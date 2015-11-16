<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Hashtable"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript"> 

function goBack(){
	location.href='${pageContext.servletContext.contextPath}/getCountWordsPage';
}
</script>
	<form:form method="POST" commandName="countWordsBean"
		action="${pageContext.servletContext.contextPath}/countWords">

<br/><br/><br/>
<center> <b>Result</b> </center>
<br/><br/>
		<table border="2" style="width: 60%" align="center">
			<thead>
				<th>Word</th>
				<th>Count</th>
			</thead>
			<c:forEach var="wordCount" items="${countWordsBean.listOfWords }">
				<tr>
					<td>${wordCount.key}</td>
					<td>${wordCount.value}</td>
				</tr>
			</c:forEach>
		</table>
	</form:form>
	
	<center><input type="button" value="Back" onClick="goBack();"></center>
	
</body>
</html>