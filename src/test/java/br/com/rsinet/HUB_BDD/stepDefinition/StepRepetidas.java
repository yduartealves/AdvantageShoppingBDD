package br.com.rsinet.HUB_BDD.stepDefinition;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.manager.FileReaderManager;
import br.com.rsinet.HUB_BDD.pageFactory.SearchPage;
import br.com.rsinet.HUB_BDD.picoContainer.ContextoTeste;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class StepRepetidas {

	private WebDriver driver;
	private ContextoTeste testeContexto;
	private SearchPage searchPage;

	public StepRepetidas(ContextoTeste contexto) {
		testeContexto = contexto;
		driver = testeContexto.getWebDriverManager().getDriver();
		searchPage = testeContexto.getPageObjectManager().getSearchPage();
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
}
