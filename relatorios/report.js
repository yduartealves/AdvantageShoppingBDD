$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("buscarPelaHome.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#encoding: utf-8"
    }
  ],
  "line": 3,
  "name": "Busca pela home",
  "description": "",
  "id": "busca-pela-home",
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
  "name": "que eu esteja na tela principal",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "clico em speakers",
  "keyword": "Quando "
});
formatter.match({
  "location": "PesquisaPelaHome.queEuEstejaNaTelaPrincipal()"
});
formatter.result({
  "duration": 14951796700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaPelaHome.clicoEmSpeakers()"
});
formatter.result({
  "duration": 4637107900,
  "error_message": "java.lang.NullPointerException\r\n\tat br.com.rsinet.HUB_BDD.pageFactory.HomePage.clicarComponentSpeakers(HomePage.java:52)\r\n\tat br.com.rsinet.HUB_BDD.stepDefinition.PesquisaPelaHome.clicoEmSpeakers(PesquisaPelaHome.java:35)\r\n\tat ✽.Quando clico em speakers(buscarPelaHome.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 10,
  "name": "Busca com sucesso pela home",
  "description": "",
  "id": "busca-pela-home;busca-com-sucesso-pela-home",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 9,
      "name": "@BuscaHomeSucesso"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "clico no produto indicado",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 12
    },
    {
      "cells": [
        "Bose Soundlink Bluetooth Speaker III"
      ],
      "line": 13
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "estou na tela do produto \"BOSE SOUNDLINK BLUETOOTH SPEAKER III\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaPelaHome.clicoNoProdutoIndicado(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "BOSE SOUNDLINK BLUETOOTH SPEAKER III",
      "offset": 26
    }
  ],
  "location": "PesquisaPelaHome.estouNaTelaDoProduto(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 687376000,
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
  "name": "que eu esteja na tela principal",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "clico em speakers",
  "keyword": "Quando "
});
formatter.match({
  "location": "PesquisaPelaHome.queEuEstejaNaTelaPrincipal()"
});
formatter.result({
  "duration": 10749660100,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaPelaHome.clicoEmSpeakers()"
});
formatter.result({
  "duration": 5181718600,
  "error_message": "java.lang.NullPointerException\r\n\tat br.com.rsinet.HUB_BDD.pageFactory.HomePage.clicarComponentSpeakers(HomePage.java:52)\r\n\tat br.com.rsinet.HUB_BDD.stepDefinition.PesquisaPelaHome.clicoEmSpeakers(PesquisaPelaHome.java:35)\r\n\tat ✽.Quando clico em speakers(buscarPelaHome.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 17,
  "name": "Busca com falha pela home",
  "description": "",
  "id": "busca-pela-home;busca-com-falha-pela-home",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 16,
      "name": "@BuscaHomeFalha"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "clico no produto indicado",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 19
    },
    {
      "cells": [
        "Bose Soundlink Bluetooth Speaker VI"
      ],
      "line": 20
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "nao encontrarei produto",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaPelaHome.clicoNoProdutoIndicado(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PesquisaPelaHome.naoEncontrareiProduto()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1133392200,
  "status": "passed"
});
});