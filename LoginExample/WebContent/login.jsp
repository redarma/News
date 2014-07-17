
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/login.css" media="screen"
	type="text/css" />

<style type="text/css">
body {
	background-image: url('gradiant.png');
	margin-right: 200px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina de Login</title>
</head>
<body>
	<div>
		<div class="arrow-up"></div>
		<div class="formholder">
			<div class="randompad">

				<center>
					<div style="color: red">
						<html:errors />
					</div>
					<html:form action="/Login">
						<table align="center">
							<tr>
								<td>Usuario<html:text name="LoginForm" property="userName"
										style="padding: 7px 5px;width: 96%;display: block;font-size: 18px;
border-radius: 5px;border: none;-webkit-transition: 0.3s linear;-moz-transition: 0.3s linear;-o-transition: 0.3s linear;transition: 0.3s linear;	" />
									</td>
							</tr>
							<tr>
								<td>Contraseña<html:password name="LoginForm"
										property="password" /> <br></td>
							</tr>
							<tr>
								<td align="right"><html:submit value="Login" /></td>
							</tr>
						</table>
				</center>
				</html:form>
			</div>
		</div>
	</div>
</body>
</html>
