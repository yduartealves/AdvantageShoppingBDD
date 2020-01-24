#language: pt
#coding:utf-8
Funcionalidade: Cadastro de usuario

  Contexto: 
    Dado que estou na tela home
    Quando clico no botao logar
    E clico em Criar uma nova conta

  @cadastroComSucesso
  Cenario: Cadastro com sucesso
    E informo os dados para cadastro
      | Username | email                       | senha   | senhaConfirm | primeiroNome | ultimoNome | telefone     | Pais   | Cidade          | Endereco       | Estado    | CEP       |
      | BRUN336  | felipe.almeidaa14@gmail.com | Felipe2 | Felipe2      | Felipe       | Silva      | (11)94444223 | Brazil | Taboão da Serra | Rua Bueno, 188 | São Paulo | 06784-200 |
    Entao o meu usuario aparece conectado como "BRUN336"

  @cadastroComFalha
  Cenario: Cadastro com falha
    E informo os dados para cadastro
      | Username | email                       | senha    | senhaConfirm | primeiroNome | ultimoNome | telefone     | Pais   | Cidade          | Endereco       | Estado    | CEP       |
      | BRUN303  | felipe.almeidaa14@gmail.com | Felipe32 | Felipe2      | Felipe       | Silva      | (11)94444223 | Brazil | Taboão da Serra | Rua Bueno, 188 | São Paulo | 06784-200 |
    Entao  devo permanecer na tela de registro
