<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Registro Usuario </title>
</head>
 
<body>
<h2>Registrarse</h2>
<s:actionerror />
<s:form action="register.action" method="post">
    <s:textfield name="username" label="Usuario" size="20" />
    <s:textfield name="nombre" label="Nombre" size="20" />
    <s:textfield name="apellido" label="Apellido"  size="20" />
    <s:textfield name="dni" label="DNI" size="20" />
    <s:textfield name="correo" label="Correo" size="20" />
    <s:password name="password" label="Contraseña" size="20" />
    <s:submit method="execute" value="Registrarse" align="center" />
</s:form>
</body>
</html>