<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head><title>Login Form</title></head>

	<body>
		<h2>Enter your Details</h2>

		<s:form action="login" method="post">
			<s:textfield name="email" label="email"/>
			<s:textfield name="password" label="password"/>
			<s:submit value="Login" />
			</s:form>
	</body>
</html>
