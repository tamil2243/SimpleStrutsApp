<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>LogIn Success</title></head>
<body>

	<h2>Hello, <s:property value="name" />!</h2>
	<s:set var="u" value="user"/>
	<h2>Hello, <s:property value="#u.name"/></h2>


	<s:form action="profile">
    		<s:hidden name="id" value="%{user.id}" />
    		<s:submit value="View Profile" />
	</s:form>


</body>
</html>

~                                                                                                             
~          
