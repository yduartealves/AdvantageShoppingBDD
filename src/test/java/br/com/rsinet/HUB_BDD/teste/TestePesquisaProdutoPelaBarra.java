package br.com.rsinet.HUB_BDD.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feature",
		glue = {"br.com.rsinet.HUB_BDD.stepDefinition"},
		tags = {"@PesquisaBarraSucesso, @PesquisaBarraFalha"},
		monochrome = true, plugin = {"pretty", "html:relatorios"}
)
public class TestePesquisaProdutoPelaBarra {

}
