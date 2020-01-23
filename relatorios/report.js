$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("buscarPelaBarraDePesquisa.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#enconding: utf-8"
    }
  ],
  "line": 3,
  "name": "Pesquisa pela barra",
  "description": "",
  "id": "pesquisa-pela-barra",
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
  "name": "em que estou na tela inicial",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "clico na lupa de pesquisa",
  "keyword": "Quando "
});
formatter.match({
  "location": "PesquisaPelaBarra.emQueEstouNaTelaInicial()"
});
formatter.result({
  "duration": 13597401300,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaPelaBarra.clicoNaLupaDePesquisa()"
});
formatter.result({
  "duration": 1509620000,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Pesquisa com Sucesso",
  "description": "",
  "id": "pesquisa-pela-barra;pesquisa-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 9,
      "name": "@PesquisaBarraSucesso"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "escrevo o produto no qual quero pesquisar",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 12
    },
    {
      "cells": [
        "HP USB 3 Button Optical Mouse"
      ],
      "line": 13
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "clico no produto",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 15
    },
    {
      "cells": [
        "HP USB 3 Button Optical Mouse"
      ],
      "line": 16
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "estarei na tela do produto \"HP USB 3 BUTTON OPTICAL MOUSE\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaPelaBarra.escrevoOProdutoNoQualQueroPesquisar(DataTable)"
});
formatter.result({
  "duration": 724581800,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaPelaBarra.clicoNoProduto(DataTable)"
});
formatter.result({
  "duration": 3389741200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP USB 3 BUTTON OPTICAL MOUSE",
      "offset": 28
    }
  ],
  "location": "PesquisaPelaBarra.estareiNaTelaDoProduto(String)"
});
formatter.result({
  "duration": 66644300,
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
  "name": "em que estou na tela inicial",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "clico na lupa de pesquisa",
  "keyword": "Quando "
});
formatter.match({
  "location": "PesquisaPelaBarra.emQueEstouNaTelaInicial()"
});
formatter.result({
  "duration": 10735763700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaPelaBarra.clicoNaLupaDePesquisa()"
});
formatter.result({
  "duration": 1361786100,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "",
  "id": "pesquisa-pela-barra;",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 19,
      "name": "@PesquisaBarraFalha"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "escrevo o produto no qual quero pesquisar",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 22
    },
    {
      "cells": [
        "DELL Supra Master demais"
      ],
      "line": 23
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "clico no produto",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 25
    },
    {
      "cells": [
        "DELL Supra Master demais"
      ],
      "line": 26
    }
  ],
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "o produto nao sera encontrado \"DELL Supra Master demais\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaPelaBarra.escrevoOProdutoNoQualQueroPesquisar(DataTable)"
});
formatter.result({
  "duration": 573051800,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaPelaBarra.clicoNoProduto(DataTable)"
});
formatter.result({
  "duration": 10122405100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DELL Supra Master demais",
      "offset": 31
    }
  ],
  "location": "PesquisaPelaBarra.oProdutoNaoSeraEncontrado(String)"
});
formatter.result({
  "duration": 27118300,
  "status": "passed"
});
});