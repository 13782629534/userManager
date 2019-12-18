<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="800">
	
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>用户密码</th>								
		</tr>
		<s:iterator value="users" status="i">
		<tr>
			<th><s:property value="#i.count" /></th>
			<th><s:property value="userName" /></th>
			<th><s:property value="userPwd" /></th>																																			
		</tr>
		</s:iterator>
	</table>	
</body>
</html>