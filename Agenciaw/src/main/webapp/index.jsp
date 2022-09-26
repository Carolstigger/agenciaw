<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- CSS only -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <title>Site Viagens</title>
</head>

<body>
  <div>

    <header class="p-3 text-white" style="background-color: rgb(15, 144, 177);">
      <div class="container">
        <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
          <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
            <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap">
              <use xlink:href="#bootstrap"></use>
            </svg>
          </a>

          <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
            <li><a href="index.jsp" class="nav-link px-2 text-white">Home</a></li>
            <li><a href="viagens.jsp" class="nav-link px-2 text-white">Destinos</a></li>
            <li><a href="promo.jsp" class="nav-link px-2 text-white">Promo��es</a></li>
            <li><a href="faqs.jsp" class="nav-link px-2 text-white">FAQs</a></li>
            <li><a href="contato.jsp" class="nav-link px-2 text-white">Contato</a></li>
          </ul>

          <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
            <input type="search" class="form-control form-control-dark text-white " placeholder="Pesquisa..."
              aria-label="Search" style="background-color: rgb(6, 65, 80);">
          </form>

          <div class="text-end">
            <button type="button" class="btn btn-outline-light me-2">Login</button>
            <button type="button" class="btn btn-warning">Cadastre-se</button>
          </div>
        </div>
      </div>
    </header>
  </div>
  <section class="container">
    <div class="row">
      <div class="col-md-7 mt-5">
        <div class="container">
          <h1> <strong>Viaje com pessoas que caibam no seu estilo!</strong></h1>
          <p>A <strong>L G B Trip</strong> é uma agência de viagens especializada em destinos para pessoas LGBTQIA+,
            organizamos trajetos e passeios que permeiam as melhores festas e locais que contemplem as suas
            necessidades, cruzeiros e viagens em grupo com pessoas que combinam com o seu estilo de vida, respeito,
            liberdade e diversidade fazem parte do nosso lema.</p>
          <button type="button-lg" class="btn btn-secondary p-2" style="background-color: rgb(6, 65, 80);">Contato</button>
        </div>
      </div>
      <div class="col-md-5 mt-5">
        <img class="img-fluid"
          src="imagens/conceito-do-verão-que-viaja-com-mala-de-viagem-velha-e-bandeira-de-lgbt-89018667.jpg">
      </div>


    </div>
  </section>


  <div>
    <div class="container">
      <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <div class="col-md-4 d-flex align-items-center">
          <a href="/" class="mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1">
            <svg class="bi" width="30" height="24">
              <use xlink:href="#bootstrap"></use>
            </svg>
          </a>
          <span class="mb-3 mb-md-0 text-muted">© 2022 L G B Trip</span>
        </div>

        <ul class="nav col-md-4 justify-content-end list-unstyled d-flex">
          <li class="ms-3"><a class="text-muted" href="#"><svg class="bi" width="24" height="24">
                <use xlink:href="#twitter"></use>
              </svg></a></li>
          <li class="ms-3"><a class="text-muted" href="#"><svg class="bi" width="24" height="24">
                <use xlink:href="#instagram"></use>
              </svg></a></li>
          <li class="ms-3"><a class="text-muted" href="#"><svg class="bi" width="24" height="24">
                <use xlink:href="#facebook"></use>
              </svg></a></li>
        </ul>
      </footer>
    </div>
  </div>

  <!-- JavaScript Bundle with Popper -->
  <script src="js/bootstrap.bundle.min.js"></script>
</body>

</html>