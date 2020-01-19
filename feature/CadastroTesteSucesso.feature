#language: pt

@cadastroComSucesso
Funcionalidade: Register Action

  Cenario: Cadastro com sucesso
    Dado que estou na tela home
		Quando clico no botao logar
		E clico em Criar uma nova conta
		E informo o userName "FelipeAL001"
		E informo o email "littleAmim@100gts.com"
		E informo a senha "Felipe2"
		E informo a confirmacao de senha "Felipe2"
		E informo o primeiro nome "Felipe"
		E informo o ultimo nome "Silva"
		E informo o telefone "(11) 944442223"
		E informo o pais "Brazil"
		E informo a cidade/municipio "Taboão da Serra"
		E informo o endereco "Rua Bueno, 188"
		E informo o estado "Sao Paulo"
		E informo o CEP "06784-200"
		E clico no termo concordar
		E clico em register
		Entao sou redirecionado para a tela home
		E apareco como logado
		
		
