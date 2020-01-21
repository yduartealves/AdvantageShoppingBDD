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
  "location": "PesquisaPelaHome.que_eu_esteja_na_tela_principal()"
});
formatter.result({
  "duration": 16714197700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaPelaHome.clico_em_speakers()"
});
formatter.result({
  "duration": 6670945200,
  "status": "passed"
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
  "name": "clico no produto",
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
  "name": "estou na tela do produto",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 15
    },
    {
      "cells": [
        "Bose Soundlink Bluetooth Speaker III"
      ],
      "line": 16
    }
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaPelaBarra.clico_no_produto(DataTable)"
});
formatter.result({
  "duration": 4973300,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaPelaHome.estou_na_tela_do_produto(DataTable)"
});
formatter.result({
  "duration": 34149600,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat br.com.rsinet.HUB_BDD.stepDefinition.PesquisaPelaHome.estou_na_tela_do_produto(PesquisaPelaHome.java:36)\r\n\tat ✽.Entao estou na tela do produto(buscarPelaHome.feature:14)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 661348300,
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
  "location": "PesquisaPelaHome.que_eu_esteja_na_tela_principal()"
});
formatter.result({
  "duration": 10816731400,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaPelaHome.clico_em_speakers()"
});
formatter.result({
  "duration": 5537883300,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Busca com falha pela home",
  "description": "",
  "id": "busca-pela-home;busca-com-falha-pela-home",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 18,
      "name": "@BuscaHomeFalha"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "clico no produto",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 21
    },
    {
      "cells": [
        "Bose Soundlink Bluetooth Speaker VI"
      ],
      "line": 22
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "nao encontrarei produto",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaPelaBarra.clico_no_produto(DataTable)"
});
formatter.result({
  "duration": 188400,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaPelaHome.nao_encontrarei_produto()"
});
formatter.result({
  "duration": 7611500,
  "status": "passed"
});
formatter.after({
  "duration": 643697800,
  "status": "passed"
});
});