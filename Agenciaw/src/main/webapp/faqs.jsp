<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- CSS only -->
  
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <title>Contato</title>
</head>
<body>
  <div>

      <header class="p-3 text-white" style="background-color: rgb(15, 144, 177);">
          <div class="container">
            <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
              <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"></use></svg>
              </a>
      
              <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                <li><a href="index.jsp" class="nav-link px-2 text-white">Home</a></li>
            <li><a href="viagens.jsp" class="nav-link px-2 text-white">Destinos</a></li>
            <li><a href="promo.jsp" class="nav-link px-2 text-white">Promo��es</a></li>
            <li><a href="faqs.jsp" class="nav-link px-2 text-white">FAQs</a></li>
            <li><a href="contato.jsp" class="nav-link px-2 text-white">Contato</a></li>
              </ul>
      
              <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
                <input type="search" class="form-control form-control-dark text-white " placeholder="Pesquisa..." aria-label="Search" style="background-color: rgb(6, 65, 80);">
              </form>
      
              <div class="text-end">
                <button type="button" class="btn btn-outline-light me-2">Login</button>
                <button type="button" class="btn btn-warning">Cadastre-se</button>
              </div>
            </div>
          </div>
        </header>
  </div>
    
    <section class="container mt-5">
     
      <div class="accordion" id="accordionExample">
        <div class="accordion-item">
          <h2 class="accordion-header" id="headingOne">
            <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
              Segurança pós pandemia
            </button>
          </h2>
          <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
            <div class="accordion-body">
              <P>Se, antes da pandemia, os cuidados com a saúde já demandavam importância, agora, então, são a prioridade número um do mundo inteiro. Então, caso precise se deslocar em breve, é importante se precaver de todas as formas possíveis, principalmente no que se refere à higienização das mãos, utilização de máscaras de proteção e o respeito ao distanciamento social.</P>
            </div>
          </div>
        </div>
        <div class="accordion-item">
          <h2 class="accordion-header" id="headingTwo">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
              Taxas de remarcação
            </button>
          </h2>
          <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
            <div class="accordion-body">
              <p>Nesse momento delicado pelo qual o turismo está passando, o setor de aviação civil está incentivando a remarcação de voos em lugar do cancelamento com reembolso. Graças a isso, as companhias aéreas passaram a adotar novas regras para alterações, e muitas estão isentando o passageiro do pagamento de multa em caso de necessidade de mudança de data, por exemplo. Como essas medidas são de responsabilidade das próprias companhias, cada uma delas possui regras únicas.</p>
            </div>
          </div>
        </div>
        <div class="accordion-item">
          <h2 class="accordion-header" id="headingThree">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
              Destinos abertos
            </button>
          </h2>
          <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree" data-bs-parent="#accordionExample">
            <div class="accordion-body">
              <p>Balneário Camboriú (SC), Campos do Jordão (SP), Dubai (Emirados Árabes), Gramado (RS), Machu Picchu (Peru), Las Vegas (EUA) e Orlando (EUA) são alguns dos destinos que já estão prontos para receber visitantes. Mas fique ligado: diversos lugares ao redor do mundo seguem com restrições, então certifique-se de confirmar todas as exigências e de consultar um agente de viagens antes de definir qual sua próxima viagem.</p>
            </div>
          </div>
        </div>
        <div class="accordion-item">
          <h2 class="accordion-header" id="headingFour">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
              Menores desacompanhados
            </button>
          </h2>
          <div id="collapseFour" class="accordion-collapse collapse" aria-labelledby="headingFour" data-bs-parent="#accordionExample">
            <div class="accordion-body">
              <p>Pessoas com idades entre 5 e 15 anos só podem viajar sozinhas dispondo de uma autorização da Vara da Infância e da Juventude; já aquelas entre 16 e 18 anos incompletos podem embarcar desde que portem documentos legais com foto.</p>
            </div>
          </div>
        </div>
        <div class="accordion-item">
          <h2 class="accordion-header" id="headingFive">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
              Pets em viagens
            </button>
          </h2>
          <div id="collapseFive" class="accordion-collapse collapse" aria-labelledby="headingFive" data-bs-parent="#accordionExample">
            <div class="accordion-body">
              <p>Quer ter a companhia do seu  amigão na próxima aventura? Então você tem que levar em consideração todas as regras que precisam ser seguidas e conversar direitinho com o veterinário para garantir uma viagem segura e confortável para o seu pet. Em viagens de carro, é fundamental zelar por assentos adequados, por meio dos quais eles ficam presos pela coleira em uma elevação fixada no cinto de segurança.</p>
            </div>
          </div>
        
        </div>
      </div>





    </section>


    </div> 

  <div>
      <div class="container">
          <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
            <div class="col-md-4 d-flex align-items-center">
              <a href="/" class="mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1">
                <svg class="bi" width="30" height="24"><use xlink:href="#bootstrap"></use></svg>
              </a>
              <span class="mb-3 mb-md-0 text-muted">© 2022 L G B Trip</span>
            </div>
        
            <ul class="nav col-md-4 justify-content-end list-unstyled d-flex">
              <li class="ms-3"><a class="text-muted" href="#"><svg class="bi" width="24" height="24"><use xlink:href="#twitter"></use></svg></a></li>
              <li class="ms-3"><a class="text-muted" href="#"><svg class="bi" width="24" height="24"><use xlink:href="#instagram"></use></svg></a></li>
              <li class="ms-3"><a class="text-muted" href="#"><svg class="bi" width="24" height="24"><use xlink:href="#facebook"></use></svg></a></li>
            </ul>
          </footer>
        </div>
  </div>

  <!-- JavaScript Bundle with Popper -->
  <script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>