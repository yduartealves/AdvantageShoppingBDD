$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CadastroUsuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#coding:utf-8"
    }
  ],
  "line": 3,
  "name": "Cadastro de usuario",
  "description": "",
  "id": "cadastro-de-usuario",
  "keyword": "Funcionalidade"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que estou na tela home",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "clico no botao logar",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "clico em Criar uma nova conta",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.que_estou_na_tela_home()"
});
formatter.result({
  "duration": 11365547100,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.clico_no_botao_logar()"
});
formatter.result({
  "duration": 841884400,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.clico_em_Criar_uma_nova_conta()"
});
formatter.result({
  "duration": 566305100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Cadastro com sucesso",
  "description": "",
  "id": "cadastro-de-usuario;cadastro-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 10,
      "name": "@cadastroComSucesso"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "informo os dados para cadastro",
  "rows": [
    {
      "cells": [
        "Username",
        "email",
        "senha",
        "senhaConfirm",
        "primeiroNome",
        "ultimoNome",
        "telefone",
        "Pais",
        "Cidade",
        "Endereco",
        "Estado",
        "CEP"
      ],
      "line": 13
    },
    {
      "cells": [
        "BRUN329",
        "felipe.almeidaa14@gmail.com",
        "Felipe2",
        "Felipe2",
        "Felipe",
        "Silva",
        "(11)94444223",
        "Brazil",
        "Taboão da Serra",
        "Rua Bueno, 188",
        "São Paulo",
        "06784-200"
      ],
      "line": 14
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "o meu usuario aparece conectado como \"BRUN329\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastroUsuario.informo_os_dados_para_cadastro(DataTable)"
});
formatter.result({
  "duration": 3306677900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BRUN329",
      "offset": 38
    }
  ],
  "location": "CadastroUsuario.o_meu_usuario_aparece_conectado_como(String)"
});
formatter.result({
  "duration": 1627682700,
  "status": "passed"
});
formatter.after({
  "duration": 607878900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que estou na tela home",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "clico no botao logar",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "clico em Criar uma nova conta",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.que_estou_na_tela_home()"
});
formatter.result({
  "duration": 10092846000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.clico_no_botao_logar()"
});
formatter.result({
  "duration": 895954700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.clico_em_Criar_uma_nova_conta()"
});
formatter.result({
  "duration": 565232100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Cadastro com falha",
  "description": "",
  "id": "cadastro-de-usuario;cadastro-com-falha",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 17,
      "name": "@cadastroComFalha"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "informo os dados para cadastro",
  "rows": [
    {
      "cells": [
        "Username",
        "email",
        "senha",
        "senhaConfirm",
        "primeiroNome",
        "ultimoNome",
        "telefone",
        "Pais",
        "Cidade",
        "Endereco",
        "Estado",
        "CEP"
      ],
      "line": 20
    },
    {
      "cells": [
        "BRUN303",
        "felipe.almeidaa14@gmail.com",
        "Felipe32",
        "Felipe2",
        "Felipe",
        "Silva",
        "(11)94444223",
        "Brazil",
        "Taboão da Serra",
        "Rua Bueno, 188",
        "São Paulo",
        "06784-200"
      ],
      "line": 21
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "devo permanecer na tela de registro",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastroUsuario.informo_os_dados_para_cadastro(DataTable)"
});
formatter.result({
  "duration": 3014365600,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.devo_permanecer_na_tela_de_registro()"
});
formatter.result({
  "duration": 3672500,
  "status": "passed"
});
formatter.after({
  "duration": 625030000,
  "status": "passed"
});
});