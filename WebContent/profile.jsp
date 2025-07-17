<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>Profile</title></head>
<body>
    <h2>Profile Page:</h2>
    <h2>Id:<s:property value="user.id"/></h2>
   <h2>Name: <s:property value="user.name" /></h2>
    <h2>mail:, <s:property value="user.email"/></h2>

</body>
</html>

