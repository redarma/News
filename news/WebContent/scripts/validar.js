$(function(){
       $('#formInscripcion').validate({
           rules: {
           'nombre': 'required',
           'apellido': 'required',
           'numero_identidad': { required: true, number: true },
           'email': { required: true, email: true },
           'tipo_identidad': 'required',
           'deportes[]': { required: true, minlength: 1 }
           },
       messages: {
           'nombre': 'Debe ingresar el nombre',
           'apellido': 'Debe ingresar el apellido',
           'numero_identidad': { required: 'Debe ingresar el número de documento de identidad', number: 'Debe ingresar un número' },
           'email': { required: 'Debe ingresar un correo electrónico', email: 'Debe ingresar el correo electrónico con el formato correcto. Por ejemplo: u@localhost.com' },
           'tipo_identidad': 'Debe ingresar el número de documento',
           'deportes[]': 'Debe seleccionar mínimo un deporte'
       },
       debug: true,
       /*errorElement: 'div',*/
       //errorContainer: $('#errores'),
       submitHandler: function(form){
           alert('El formulario ha sido validado correctamente!');
       }
    });
});