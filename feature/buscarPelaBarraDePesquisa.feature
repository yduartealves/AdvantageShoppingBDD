#language: pt
#enconding: utf-8
Funcionalidade: Pesquisa pela barra

  Contexto: 
    Dado que estou na tela home
    Quando clico na lupa de pesquisa

  @PesquisaBarraSucesso
  Cenario: Pesquisa com Sucesso
    E escrevo o produto no qual quero pesquisar
      | produto                       |
      | HP USB 3 Button Optical Mouse |
    E clico no produto
      | produto                       |
      | HP USB 3 Button Optical Mouse |
    E clico em adicionar ao carrinho
    E clico no botão checkout
    E passo o usuario, senha
      | username | senha   |
      | BRUN255  | Felipe2 |
     E clico em conectar-se
     E clico em próximo
     E clico em Pague agora
    Entao estarei na tela de produto comprado "Thank you for buying with Advantage"

  @PesquisaBarraFalha
  Cenario: Pesquisa com falha
    E escrevo o produto no qual quero pesquisar
      | produto                  |
      | DELL Supra Master demais |
    E clico no produto
      | produto                  |
      | DELL Supra Master demais |
    Entao o produto nao sera encontrado "DELL Supra Master demais"
