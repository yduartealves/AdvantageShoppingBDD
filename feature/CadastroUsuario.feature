#language: pt
#coding:utf-8
Funcionalidade: Cadastro de usuario

  @cadastroComSucesso
  Cenario: Cadastro com sucesso
    Dado que estou na tela home
    Quando clico no botao logar
    E clico em Criar uma nova conta
    E informo os dados para cadastro
      | Username | email                       | senha   | senhaConfirm | primeiroNome | ultimoNome | telefone     | Pais   | Cidade          | Endereco       | Estado    | CEP       |
      | BRUN312  | felipe.almeidaa14@gmail.com | Felipe2 | Felipe2      | Felipe       | Silva      | (11)94444223 | Brazil | Taboão da Serra | Rua Bueno, 188 | São Paulo | 06784-200 |
    Entao sou redirecionado para a tela home
    E o meu usuario aparece conectado como "BRUN312"

  @cadastroComFalha
  Cenario: Cadastro com falha
    Dado que estou na tela home
    Quando clico no botao logar
    E clico em Criar uma nova conta
    E informo os dados para cadastro
      | Username | email                       | senha    | senhaConfirm | primeiroNome | ultimoNome | telefone     | Pais   | Cidade          | Endereco       | Estado    | CEP       |
      | BRUN303  | felipe.almeidaa14@gmail.com | Felipe32 | Felipe2      | Felipe       | Silva      | (11)94444223 | Brazil | Taboão da Serra | Rua Bueno, 188 | São Paulo | 06784-200 |
    Entao as senhas devem ser incompativeis 
    E devo permanecer na tela de registro
