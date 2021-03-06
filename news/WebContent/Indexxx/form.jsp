<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
<title>Crear Noticia</title>
<link rel="stylesheet" type="text/css" href="styles/ingresarNoticia/view.css" media="all"></link>
<script type="text/javascript" src="scripts/ingresarNoticia/view.js"></script>
<script type="text/javascript" src="scripts/ingresarNoticia/calendar.js"></script>
</head>
<body id="main_body" >
	
	<img id="top" src="images/ingresarNoticia/top.png" alt=""></img>
	<div id="form_container">
	
		<h1><a>Crear Noticia</a></h1>
		<form id="form_861503" class="appnitro" enctype="multipart/form-data" method="post" action="IngresarNoticia">
					<div class="form_description">
			<h2>Crear Noticia</h2>
			<p></p>
		</div>						
			<ul >
			
		<li>
		<label class="description" for="noticia">noticia </label>
		<div>
			<input id="noticia" name="noticia" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>
		<li>
		<label class="description" for="descripcion">descripcion </label>
		<div>
			<textarea id="descripcion" name="descripcion" class="element textarea small"></textarea> 
		</div> 
		</li>		
		<li id="li_3" >
		<label class="description" for="contenido">contenido </label>
		<div>
			<textarea id="element_3" name="contenido" class="element textarea large"></textarea> 
		</div> 
		</li>		<li id="li_4" >
		<label class="description" for="contenido">fecha</label>
		<span>
			<input id="element_4_1" name="element_4_1" class="element text" size="2" maxlength="2" value="" type="text"></input>
			<label for="element_4_1">DD</label>
		</span>
		<span>
			<input id="element_4_2" name="element_4_2" class="element text" size="2" maxlength="2" value="" type="text"></input>
			<label for="element_4_2">MM</label>
		</span>
		<span>
	 		<input id="year" name="year" class="element text" size="4" maxlength="4" value="" type="text"></input>
			<label for="element_4_3">YYYY</label>
		</span>
		<span id="calendar_4">
			<img id="cal_img_4" class="datepicker" src="images/ingresarNoticia/calendar.gif" alt="Pick a date."></img>	
		</span>
		<script type="text/javascript">
			Calendar.setup({
			inputField	 : "year",
			baseField    : "element_4",
			displayArea  : "calendar_4",
			button		 : "cal_img_4",
			ifFormat	 : "%B %e, %Y",
			onSelect	 : selectEuropeDate
			});
		</script>
		 
		</li>		<li id="li_8" >
		<label class="description" for="element_8">estado </label>
		<span>
			<input id="element_8_1" name="element_8" class="element radio" type="radio" value="1" />
<label class="choice" for="element_8_1">activo</label>
<input id="element_8_2" name="element_8" class="element radio" type="radio" value="2" />
<label class="choice" for="element_8_2">inactivo</label>
		</span>
		</li>
		<li id="li_9" >
		<label class="description" for="element_9">categoria </label>
		<div>
			<input id="element_9" name="element_9" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>
	
	<li id="li_5" >
		<label class="description" for="element_5">resumen </label>
		<div>
			<textarea id="element_5" name="element_5" class="element textarea medium"></textarea> 
		</div> 
		</li>		<li id="li_6" >
		<label class="description" for="element_6">imagen </label>
		<div>
			<input id="element_6" name="element_6" class="element file" type="file"/> 
		</div>  
		</li>		<li id="li_7" >
		<label class="description" for="element_7">usuario </label>
		<div>
			<input id="element_7" name="element_7" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>
					<li class="buttons">
			    <input type="hidden" name="form_id" value="861503" />
			    
				<input id="saveForm" class="button_text" type="submit" name="submit" value="Submit" />
		</li>
			</ul>
		</form>	
		<div id="footer">
			Generated by <a href="http://www.phpform.org">pForm</a>
		</div>
	</div>
	<img id="bottom" src="images/ingresarNoticia/bottom.png" alt=""></img>
	</body>
</html>