
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body bgcolor="pink ">
    <center>
    <br/> <br/> <br/> <br/> <br/> <br/>
  
    <div style="color:red">
        <h1>Login Correcto. <br>Bienvenido <bean:write name="LoginForm" property="userName"></bean:write><br>
        Password<bean:write name="LoginForm" property="password"></bean:write><br>
        
        </h1>
    </div></center>
    </body>
    
</html>
