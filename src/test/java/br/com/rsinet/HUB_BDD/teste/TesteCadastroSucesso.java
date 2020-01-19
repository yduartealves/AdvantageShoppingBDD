package br.com.rsinet.HUB_BDD.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "br.com.rsinet.HUB_BDD.stepDefinition" })
public class TesteCadastroSucesso {

}
