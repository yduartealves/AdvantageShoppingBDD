package br.com.rsinet.HUB_BDD.stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.manager.FileReaderManager;
import br.com.rsinet.HUB_BDD.pageFactory.ProductPage;
import br.com.rsinet.HUB_BDD.pageFactory.SearchPage;
import br.com.rsinet.HUB_BDD.picoContainer.ContextoTeste;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepRepetidas {

	private WebDriver driver;
	private ContextoTeste testeContexto;
	private SearchPage searchPage;
	private ProductPage productPage;

	public StepRepetidas(ContextoTeste contexto) {
		testeContexto = contexto;
		driver = testeContexto.getWebDriverManager().getDriver();
		searchPage = testeContexto.getPageObjectManager().getSearchPage();
		productPage = testeContexto.getPageObjectManager().getProductPage();
	}

	@Dado("^que estou na tela home$")
	public void queEstouNaTelaHome() throws Throwable {
		driver.get(FileReaderManager.getInstance().getConfigReader().getUrl());
	}

	@Quando("^clico no produto$")
	public void clicoNoProduto(DataTable dados) throws Throwable {
		for (Map<String, String> dado : dados.asMaps(String.class, String.class)) {
			try {
				searchPage.clicarMassaDados(dado.get("produto"));
			} catch (Exception e) {
				break;
			}
		}
	}

	@Quando("^clico em adicionar ao carrinho$")
	public void clicoEmAdicionarAoCarrinho() throws Throwable {
		productPage.btnAddCart();
	}

	@Quando("^clico no botão checkout$")
	public void clicoNoBotãoCheckout() throws Throwable {
		productPage.btnCheckout();
	}

	@Quando("^passo o usuario, senha$")
	public void passoOUsuarioSenha(DataTable dados) throws Throwable {
		for (Map<String, String> dado : dados.asMaps(String.class, String.class)) {
			productPage.userName(dado.get("username"));
			productPage.password(dado.get("senha"));
		}

	}

	@Quando("^clico em conectar-se$")
	public void clicoEmConectarSe() throws Throwable {
		productPage.btnLogin();
	}

	@Quando("^clico em próximo$")
	public void clicoEmPróximo() throws Throwable {
		productPage.btnNext();
	}

	@Quando("^clico em Pague agora$")
	public void clicoEmPagueAgora() throws Throwable {
		productPage.btnPayNow();
	}

	@Entao("^estarei na tela de produto comprado \"([^\"]*)\"$")
	public void estareiNaTelaDeProdutoComprado(String texto) throws Throwable {
		assertEquals(texto,productPage.getMessageThankYou());
	}
}
