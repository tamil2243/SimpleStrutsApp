<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>Welcome Form</title></head>
<body>
    <h2>Welcome:</h2>
    <s:form action="loginForm" method="post">
        <s:submit value="login" />
    </s:form>
    <s:form action="registerForm" method="post">
	    <s:submit value="Register"/>
	    </s:form>
</body>
</html>

