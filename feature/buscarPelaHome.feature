#language: pt
#encoding: utf-8
Funcionalidade: Busca pela home

  Contexto: 
    Dado que eu esteja na tela principal
    Quando clico em speakers

  @BuscaHomeSucesso
  Cenario: Busca com sucesso pela home
    E clico no produto
      | produto                              |
      | Bose Soundlink Bluetooth Speaker III |
    Entao estou na tela do produto
      | produto                              |
      | Bose Soundlink Bluetooth Speaker III |

  @BuscaHomeFalha
  Cenario: Busca com falha pela home
    E clico no produto
      | produto                             |
      | Bose Soundlink Bluetooth Speaker VI |
    Entao nao encontrarei produto
      
