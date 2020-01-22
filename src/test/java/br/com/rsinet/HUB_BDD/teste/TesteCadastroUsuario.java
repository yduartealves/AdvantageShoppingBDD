package br.com.rsinet.HUB_BDD.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature", 
	glue = {"br.com.rsinet.HUB_BDD.stepDefinition" }, 
	tags = {"@cadastroComSucesso, @cadastroComFalha" },
	monochrome = true,
	plugin = {"pretty", "html:relatorios"},
	snippets = SnippetType.CAMELCASE
)
public class TesteCadastroUsuario {

}
