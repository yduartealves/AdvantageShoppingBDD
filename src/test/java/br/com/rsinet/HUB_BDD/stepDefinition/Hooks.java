package br.com.rsinet.HUB_BDD.stepDefinition;

import br.com.rsinet.HUB_BDD.manager.WebDriverManager;
import cucumber.api.java.After;

public class Hooks {
	
	private WebDriverManager webDriver;

	@After
	public void finaliza() {
		webDriver.closeDriver();
	}
}
