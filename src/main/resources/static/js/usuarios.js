// Call the dataTables jQuery plugin
$(document).ready(function() {

   cargarUsuarios ();

  $('#usuarios').DataTable();
});

async function cargarUsuarios () {

  const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },

  });
  const usuarios = await request.json();
  let listadohtml = ' ' ;
  for (let usuario of usuarios)

  let usuariohtml = ' <tr><td>' +usuario.id+' </td><td>' +usuario.nombre+' ' +usuario.apellido+' </td><td>' +usuario.e-mail+' </td><td>' +usuario.telefono+' </td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>' ;
 >
  listadohtml + = listadohtml;



document.querySelector('#usuarios tbody').outerHTML = listadohtml;

}