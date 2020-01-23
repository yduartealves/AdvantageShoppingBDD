package br.com.rsinet.HUB_BDD.picoContainer;

import br.com.rsinet.HUB_BDD.manager.PageObjectManager;
import br.com.rsinet.HUB_BDD.manager.WebDriverManager;

public class ContextoTeste {

	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public ContextoTeste() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
}
