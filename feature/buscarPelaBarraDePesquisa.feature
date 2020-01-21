#language: pt
#enconding: utf-8
Funcionalidade: Pesquisa pela barra

  Contexto: 
    Dado em que estou na tela inicial
    Quando clico na lupa de pesquisa

  @PesquisaBarraSucesso
  Cenario: Pesquisa com Sucesso
    E escrevo o produto no qual quero pesquisar
      | Produto                       |
      | HP USB 3 Button Optical Mouse |
    E clico no produto
      | Produto                       |
      | HP USB 3 Button Optical Mouse |
		Entao estarei na tela do produto "HP USB 3 BUTTON OPTICAL MOUSE"
		
	@PesquisaBarraFalha
	Cenario:
		E escrevo o produto no qual quero pesquisar
      | Produto                       |
      | DELL Supra Master demais			|
    E clico no produto
      | Produto                       |
      | DELL Supra Master demais			|
    Entao o produto nao sera encontrado "DELL Supra Master demais"