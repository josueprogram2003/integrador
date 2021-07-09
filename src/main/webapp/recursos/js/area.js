$(document).ready(function () {
	listar();
});

function listar (){
	$.get("AreaControlador",{"opc":2},function (data) {
		//let info = JSON.parse(data);
		console.log(data);	
		JSON.parse(data);
		
	});	
}

$("#guardar").on("click", function (e) {
  e.preventDefault();
  alert("Agregar");
 	$.get("AreaControlador", { "area": $("#nombre").val() , "opc": 1 }, function (data) {
		alert(data);
  });
});



