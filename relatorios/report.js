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
  "duration": 14761543700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.clico_no_botao_logar()"
});
formatter.result({
  "duration": 1296994300,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.clico_em_Criar_uma_nova_conta()"
});
formatter.result({
  "duration": 624648700,
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
        "BRUN328",
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
  "name": "o meu usuario aparece conectado como \"BRUN328\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastroUsuario.informo_os_dados_para_cadastro(DataTable)"
});
formatter.result({
  "duration": 5336618400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BRUN328",
      "offset": 38
    }
  ],
  "location": "CadastroUsuario.o_meu_usuario_aparece_conectado_como(String)"
});
formatter.result({
  "duration": 10348132000,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to be \"https://www.advantageonlineshopping.com/#/\". Current url: \"https://www.advantageonlineshopping.com/#/register\" (tried for 10 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RSI1515\u0027, ip: \u002710.1.0.57\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.42.591088 (7b2b2dca23cca0..., userDataDir: C:\\Users\\FELIPE~1.ALM\\AppDa...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51299}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 79.0.3945.117, webStorageEnabled: true}\nSession ID: d652e034c5a40a9019ae4471c2657849\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat br.com.rsinet.HUB_BDD.pageFactory.HomePage.getUserLog(HomePage.java:46)\r\n\tat br.com.rsinet.HUB_BDD.stepDefinition.CadastroUsuario.o_meu_usuario_aparece_conectado_como(CadastroUsuario.java:73)\r\n\tat ✽.Entao o meu usuario aparece conectado como \"BRUN328\"(CadastroUsuario.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 742007600,
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
  "duration": 10887826000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.clico_no_botao_logar()"
});
formatter.result({
  "duration": 1519630600,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.clico_em_Criar_uma_nova_conta()"
});
formatter.result({
  "duration": 708181200,
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
  "duration": 7599670000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.devo_permanecer_na_tela_de_registro()"
});
formatter.result({
  "duration": 16341500,
  "status": "passed"
});
formatter.after({
  "duration": 1546187400,
  "status": "passed"
});
});