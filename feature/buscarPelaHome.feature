#language: pt
#encoding: utf-8
Funcionalidade: Busca pela home

  Contexto: 
    Dado que estou na tela home
    Quando clico em speakers

  @BuscaHomeSucesso
  Cenario: Busca com sucesso pela home
    E clico no produto
      | produto                              |
      | Bose Soundlink Bluetooth Speaker III |
    E clico em adicionar ao carrinho
    E clico no botão checkout
    E passo o usuario, senha
      | username | senha   |
      | BRUN255  | Felipe2 |
    E clico em conectar-se
    E clico em próximo
    E clico em Pague agora
    Entao estarei na tela de produto comprado "Thank you for buying with Advantage"

  @BuscaHomeFalha
  Cenario: Busca com falha pela home
    E clico no produto
      | produto                             |
      | Bose Soundlink Bluetooth Speaker VI |
    Entao nao encontrarei produto
