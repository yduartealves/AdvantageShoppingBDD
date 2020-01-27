package br.com.rsinet.HUB_BDD.stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.pageFactory.HomePage;
import br.com.rsinet.HUB_BDD.pageFactory.SearchPage;
import br.com.rsinet.HUB_BDD.picoContainer.ContextoTeste;
import br.com.rsinet.HUB_BDD.util.ScrollDownEUp;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisaPelaHome {
	private WebDriver driver;
	private HomePage homePage;
	private ContextoTeste testeContexto;
	private SearchPage SearchPage;
	private ScrollDownEUp scrollDownEUp;

	public PesquisaPelaHome(ContextoTeste contexto) {
		testeContexto = contexto;
		homePage = testeContexto.getPageObjectManager().getHomePage();
		driver = testeContexto.getWebDriverManager().getDriver();
		SearchPage = testeContexto.getPageObjectManager().getSearchPage();
		scrollDownEUp = testeContexto.getPageObjectManager().getScroll();
	}

	@Quando("^clico em speakers$")
	public void clicoEmSpeakers() throws Throwable {
		homePage.clicarComponentSpeakers();
	}
	
	@Quando("^clico nas especificacoes$")
	public void clicoNasEspecificacoes() throws Throwable {
	    SearchPage.escolherMarca();
	    SearchPage.escolherPotencia();
	}

	@Entao("^nao encontrarei produto$")
	public void naoEncontrareiProduto() throws Throwable {
		assertTrue(driver.getPageSource().contains("No results"));
		scrollDownEUp.scrollDown();
	}
}
