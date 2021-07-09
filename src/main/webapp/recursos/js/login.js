$(document).ready(function () {});

$("#btn_iniciar").on("click", function (e) {
  e.preventDefault();
  let param = { user: $("#user").val(), pass: $("#pass").val(), opc: 1 };
  console.log(param);
  $.post({
    data: param,
    url: "CuentaControlador",
    type: "POST",
    success: function () {
		limpiar();
    },
    error: function (jqXHR, estado, error) {
      console.log(estado);
      console.log(error);
    },
    complete: function (jqXHR, estado) {
      console.log(estado);
    },
  });
});


const limpiar = () => {
  $("#user").val("");
  $("#pass").val("");
};
