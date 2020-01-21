package br.com.rsinet.HUB_BDD.stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.HUB_BDD.pageFactory.HomePage;
import br.com.rsinet.HUB_BDD.util.DriverFactory;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisaPelaHome {
	private WebDriver driver;
	private HomePage homePage;
	
	@Dado("^que eu esteja na tela principal$")
	public void que_eu_esteja_na_tela_principal() throws Throwable {
		driver = DriverFactory.initDriver();
		homePage = PageFactory.initElements(driver, HomePage.class);	
	}

	@Quando("^clico em speakers$")
	public void clico_em_speakers() throws Throwable {
		homePage.clicarComponentSpeakers();
	}

	@Entao("^estou na tela do produto$")
	public void estou_na_tela_do_produto(DataTable dados) throws Throwable {
		for (Map<String, String> dado : dados.asMaps(String.class, String.class)) {
			assertTrue(driver.getPageSource().contains(dado.get("produto")));
		}
	}

	@Entao("^nao encontrarei produto$")
	public void nao_encontrarei_produto() throws Throwable {
		assertEquals("https://www.advantageonlineshopping.com/#/category/Speakers/4", driver.getCurrentUrl());
	}
}
