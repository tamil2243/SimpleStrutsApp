<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>Hello Form</title></head>
<body>
    <h2>Enter your name:</h2>
    <s:form action="hello" method="post">
        <s:textfield name="userName" label="User Name" />
	<s:textfield name="age" label="Enter your age"/>
	<s:textfield name="message" label="Enter message"/>
        <s:submit value="Submit" />
    </s:form>
</body>
</html>

