package br.com.rsinet.HUB_BDD.stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.manager.FileReaderManager;
import br.com.rsinet.HUB_BDD.pageFactory.SearchPage;
import br.com.rsinet.HUB_BDD.picoContainer.ContextoTeste;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisaPelaBarra {
	private WebDriver driver;
	private SearchPage	searchPage;
	private ContextoTeste testeContexto;

	public PesquisaPelaBarra(ContextoTeste contexto) {
		testeContexto = contexto;
		searchPage = testeContexto.getPageObjectManager().getSearchPage();
		driver = testeContexto.getWebDriverManager().getDriver();
	}
	
	@Dado("^em que estou na tela inicial$")
	public void emQueEstouNaTelaInicial() throws Throwable {
		driver.get(FileReaderManager.getInstance().getConfigReader().getUrl());
	}

	@Quando("^clico na lupa de pesquisa$")
	public void clicoNaLupaDePesquisa() throws Throwable {
	    searchPage.lupaPesquisa();
	}

	@Quando("^escrevo o produto no qual quero pesquisar$")
	public void escrevoOProdutoNoQualQueroPesquisar(DataTable dados) throws Throwable {
		for (Map<String, String> dado : dados.asMaps(String.class, String.class)) {
			searchPage.barraPesquisa(dado.get("produto"));
			searchPage.barraPesquisa(Keys.ENTER);
		}
	}

	@Quando("^clico no produto$")
	public void clicoNoProduto(DataTable dados) throws Throwable {
		for (Map<String, String> dado : dados.asMaps(String.class, String.class)) {
			try {
				searchPage.clicarMassaDados(dado.get("produto"));
			}catch(Exception e) {
				break;
			}
		}
	}

	@Entao("^estarei na tela do produto \"([^\"]*)\"$")
	public void estareiNaTelaDoProduto(String produto) throws Throwable {
	   assertEquals("https://www.advantageonlineshopping.com/#/product/29?viewAll=HP%20USB%203%20Button%20Optical%20Mouse", driver.getCurrentUrl());
	   assertTrue(driver.getPageSource().contains(produto));
	}

	@Entao("^o produto nao sera encontrado \"([^\"]*)\"$")
	public void oProdutoNaoSeraEncontrado(String produto) throws Throwable {
		String produtoNaoEncontrado = "No results for \"" + produto + "\"";
		assertTrue(driver.getPageSource().contains(produtoNaoEncontrado));
	}
}
