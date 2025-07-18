<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
        <head><title>Register Form</title></head>
        
        <body>
                <h2>Enter your Details</h2>
                
                <s:form action="register" method="post">
			<s:textfield name="name" label="name"/>
                        <s:textfield name="email" label="email"/>
                        <s:textfield name="password" label="password"/>
                        <s:submit value="Register" />
                        </s:form>
        </body>
</html>

~                 
