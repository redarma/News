
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    
    <style type="text/css">
body
{
background-image:url('gradiant.png');


margin-right:200px;
}
</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de Login</title>
    </head>
    <body>
     <center>
        <div style="color:red">
            <html:errors />
        </div>
        <html:form action="/Login" ><br/><br/><br/><br/><br/><br/><br/>
       <table  bgcolor="pink" align="center" >
      
            <tr ><td >Usuario  &nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;<html:text name="LoginForm" property="userName" /> <br></td></tr>
            <tr ><td >Contraseña      &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;<html:password name="LoginForm" property="password" /> <br></td></tr>
            
            <tr><td align="right"><html:submit value="Login" /></td></tr>
            </table></center>
        </html:form>
    </body>
</html>
