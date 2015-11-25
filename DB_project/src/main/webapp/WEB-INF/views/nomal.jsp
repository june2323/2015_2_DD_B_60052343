<%@ page language= "java" contentType ="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import ="java.util.*,com.delab.mju.*" %>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
	<link href="<c:url value="/css/mobile_index.css"/>" rel="stylesheet">
	<script src="<c:url value="/js/jquery-1.8.2.min.js" /> "></script>
	 <meta name="viewPort" content="initial-scale=1.0; maximum-scale=1.0; minimum-scale=1.0; user-scale=no;" />
</head>
<body>
	<div class="vCenter">
	<h2>${dept_name} 부서의 ${name} ${position_name}님 안녕하세요</h2>
		<div class="center">
			<a href="login.jsp" class="btn btn-mini">프로젝트 검색</a><br/>
			<a href="login.jsp" class="btn btn-mini">직원 검색</a><br/>
			<a href="login.jsp" class="btn btn-mini">동료 평가</a><br/>
			<a href="login.jsp" class="btn btn-mini">내정보 수정</a><br/>
		</div>
 	 </div>
</body>
</html>