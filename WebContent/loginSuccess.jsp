<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>LogIn Success</title></head>
<body>
	

	<h2>Hello, <s:property value="user.name" />!</h2>


	<s:form action="profile">
    		<s:hidden name="id" value="%{user.id}" />
    		<s:submit value="View Profile" />
	</s:form>


</body>
</html>

~                                                                                                             
~          
