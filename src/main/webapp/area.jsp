<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Area</title>
  <link rel="stylesheet" href="./recursos/css/bootstrap.min.css" />
  <link rel="stylesheet" href="./recursos/css/area.css" />
</head>

<body>
  <div class="container">
    <section class="row">
      <div class="
            col-12
            d-flex
            flex-column
            justify-content-center
            align-items-center
          ">
        <header class="text-white h2">Area</header>
        <!-- MODAL Y BUTTON -->
        <button type="button" class="
                  btn btn-primaty
                  p-1
                  d-flex
                  color
                  justify-content-center
                  align-items-center
                " data-bs-toggle="modal" data-bs-target="#miModal">
          <img class="w-100 h-100" src="./recursos/assets/svg/añadir.svg" alt="" />
        </button>

        <!-- Modal -->
        <div class="modal fade" id="miModal" tabindex="-1" aria-labelledby="modalTitle" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="modalTitle">
                  Registrar
                </h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
              </div>
              <div class="modal-body">
                <form method="POST">
                  <div class="mb-3">
                    <label for="nombre" class="col-form-label">Nombre del Area</label>
                    <input type="text" class="form-control" id="nombre"/>
                  </div>
                </form>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">
                  Cerrar
                </button>
                <button type="button" class="btn btn-primary" data-bs-dismiss="modal" id="guardar">
                  Guardar
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
  </div>
  <div class="col-12 overflow-auto" id="container"></div>
  </section>


  <script src="./recursos/js/jquery.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  <script src="./recursos/js/area.js"></script>
</body>

</html>
