package br.com.rsinet.HUB_BDD.stepDefinition;

import br.com.rsinet.HUB_BDD.picoContainer.ContextoTeste;
import cucumber.api.java.After;

public class Hooks {
	
	private ContextoTeste testeContexto;
	
	public Hooks(ContextoTeste contexto) {
		testeContexto = contexto;
	}
	
	
	@After
	public void finaliza() {
		testeContexto.getWebDriverManager().closeDriver();
	}
}
