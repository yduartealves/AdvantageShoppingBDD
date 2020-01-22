package br.com.rsinet.HUB_BDD.stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.HUB_BDD.pageFactory.HomePage;
import br.com.rsinet.HUB_BDD.pageFactory.SearchPage;
import br.com.rsinet.HUB_BDD.util.DriverFactory;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisaPelaHome {
	private WebDriver driver;
	private HomePage homePage;
	private SearchPage searchPage;

	@Dado("^que eu esteja na tela principal$")
	public void queEuEstejaNaTelaPrincipal() throws Throwable {
		driver = DriverFactory.initDriver();
		homePage = PageFactory.initElements(driver, HomePage.class);
		searchPage = PageFactory.initElements(driver, SearchPage.class);
	}

	@Quando("^clico em speakers$")
	public void clicoEmSpeakers() throws Throwable {
		homePage.clicarComponentSpeakers();
	}

	@Quando("^clico no produto indicado$")
	public void clicoNoProdutoIndicado(DataTable dados) throws Throwable {
		for (Map<String, String> dado : dados.asMaps(String.class, String.class)) {
			try {
				searchPage.clicarMassaDados(driver, dado.get("produto"));
			}catch(Exception e) {
				break;
			}
		}
	}
	@Entao("^estou na tela do produto \"([^\"]*)\"$")
	public void estouNaTelaDoProduto(String produto) throws Throwable {
			assertEquals("https://www.advantageonlineshopping.com/#/product/20", driver.getCurrentUrl());
			assertTrue(driver.getPageSource().contains(produto));
	}

	@Entao("^nao encontrarei produto$")
	public void naoEncontrareiProduto() throws Throwable {
		assertEquals("https://www.advantageonlineshopping.com/#/category/Speakers/4", driver.getCurrentUrl());
	}
}
