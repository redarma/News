<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
<title>Registrarse</title>
<link rel="stylesheet" type="text/css" href="styles/view.css" media="all"></link>
<script type="text/javascript" src="view.js"></script>

</head>
<body id="main_body" >
	
	<img id="top" src="images/top.png" alt=""></img>
	<div id="form_container">
	
		<h1><a>Registrarse</a></h1>
		<form id="form_863316" class="appnitro"  method="post" action="IngresarCuenta">
					<div class="form_description">
			<h2>Registrarse</h2>
			<p>Para poder realizar comentarios</p>
		</div>						
			<ul >
			
					<li id="li_1" >
		<label class="description" for="element_1">Usuario </label>
		<div>
			<input id="element_1" name="usuario" class="element text medium" type="text" maxlength="255" value=""/> 
		</div><p class="guidelines" id="guide_1"><small>Nombre con el cual se logeara</small></p> 
		</li>		<li id="li_2" >
		<label class="description" for="element_2">Nombre y Apellido </label>
		<span>
			<input id="element_2_1" name= "nombre" class="element text" maxlength="255" size="8" value=""/>
			<label>First</label>
		</span>
		<span>
			<input id="element_2_2" name= "apellido" class="element text" maxlength="255" size="14" value=""/>
			<label>Last</label>
		</span><p class="guidelines" id="guide_2"><small>Nombre real de su persona</small></p> 
		</li>		<li id="li_3" >
		<label class="description" for="element_3">DNI
 </label>
		<div>
			<input id="element_3" name="dni" class="element text medium" type="text" maxlength="255" value=""/> 
		</div><p class="guidelines" id="guide_3"><small>Documento de identidad</small></p> 
		</li>		<li id="li_4" >
		<label class="description" for="element_4">Correo </label>
		<div>
			<input id="element_4" name="correo" class="element text medium" type="text" maxlength="255" value=""/> 
		</div><p class="guidelines" id="guide_4"><small>Cuenta de correo la cual quiere que reciba las noticias</small></p> 
		</li>		<li id="li_5" >
		<label class="description" for="element_5">Contraseña </label>
		<div>
			<input id="element_5" name="password" class="element text medium" type="text" maxlength="255" value=""/> 
		</div><p class="guidelines" id="guide_5"><small>Clave para poder logearse</small></p> 
		</li>
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="863316" />
			    
				<input id="saveForm" class="button_text" type="submit" name="submit" value="Submit" />
		</li>
			</ul>
		</form>	
		<div id="footer">
			
		</div>
	</div>
	<img id="bottom" src="images/bottom.png" alt=""></img>
	</body>
</html>
