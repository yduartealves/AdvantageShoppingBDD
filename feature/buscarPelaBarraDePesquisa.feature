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
		Entao estarei na tela do produto "HP USB 3 BUTTON OPTICAL MOUSE"
		
	@PesquisaBarraFalha
	Cenario:
		E escrevo o produto no qual quero pesquisar
      | produto                       |
      | DELL Supra Master demais			|
    E clico no produto
      | produto                       |
      | DELL Supra Master demais			|
    Entao o produto nao sera encontrado "DELL Supra Master demais"