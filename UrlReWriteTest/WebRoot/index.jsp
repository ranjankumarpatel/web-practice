<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML>
<html>
  <head>
    
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    
    <a href="<c:url value="/some/index.jsp"/>">/some/index.jsp</a>
    <a href="<c:url value="/test1"/>">/test1</a>
    <a href="<c:url value="/test2/1"/>">/test2/1</a>
    <a href="<c:url value="/test3/ranjan/patel"/>">/test3/ranjan/patel</a>
    <a href="<c:url value="http://localhost"/>">localhost</a>
    <a href="<c:url value="/test/test.jsp;jsessionid=A928EEE8F3FF30CD0EDC0EC68DB48BD6?project=1"/>">/test1</a>
    <a href="<c:url value="/test4/ranjan/patel"/>">/test4/ranjan/patel</a>
  </body>
</html>
