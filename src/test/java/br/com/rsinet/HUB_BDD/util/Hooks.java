package br.com.rsinet.HUB_BDD.util;

import cucumber.api.java.After;

public class Hooks {

	@After
	public void DepoisDoCenario() {
		DriverFactory.closeDriver();
	}
}
