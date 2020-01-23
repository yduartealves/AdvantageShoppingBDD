package br.com.rsinet.HUB_BDD.stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.manager.FileReaderManager;
import br.com.rsinet.HUB_BDD.pageFactory.HomePage;
import br.com.rsinet.HUB_BDD.pageFactory.RegisterPage;
import br.com.rsinet.HUB_BDD.picoContainer.ContextoTeste;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroUsuario {
	private WebDriver driver;
	private HomePage homePage;
	private RegisterPage registerPage;
	private ContextoTeste testeContexto;

	public CadastroUsuario(ContextoTeste contexto) {
		testeContexto = contexto;
		homePage = testeContexto.getPageObjectManager().getHomePage();
		registerPage = testeContexto.getPageObjectManager().getRegisterPage();
		driver = testeContexto.getWebDriverManager().getDriver();
	}

	@Dado("^que estou na tela home$")
	public void queEstouNaTelaHome() throws Throwable {
		driver.get(FileReaderManager.getInstance().getConfigReader().getUrl());
	}

	@Quando("^clico no botao logar$")
	public void clicoNoBotaoLogar() throws Throwable {
		homePage.clickBtnLogar();
	}

	@Quando("^clico em Criar uma nova conta$")
	public void clicoEmCriarUmaNovaConta() throws Throwable {
		homePage.clickCriarConta();
	}

	@Quando("^informo os dados para cadastro$")
	public void informoOsDadosParaCadastro(DataTable dados) throws Throwable {
		for (Map<String, String> dado : dados.asMaps(String.class, String.class)) {
			registerPage.userName(dado.get("Username"));
			registerPage.userEmail(dado.get("email"));
			registerPage.password(dado.get("senha"));
			registerPage.passwordConfirm(dado.get("senhaConfirm"));
			registerPage.firstName(dado.get("primeiroNome"));
			registerPage.lastName(dado.get("ultimoNome"));
			registerPage.phoneNumber(dado.get("telefone"));
			registerPage.country(dado.get("Pais"));
			registerPage.city(dado.get("Cidade"));
			registerPage.address(dado.get("Endereco"));
			registerPage.stateORProvince(dado.get("Estado"));
			registerPage.postalCode(dado.get("CEP"));

			registerPage.checkedOk();
			try {
				registerPage.btnRegister();
			} catch (Exception e) {
				break;
			}

		}
	}

	@Entao("^o meu usuario aparece conectado como \"([^\"]*)\"$")
	public void oMeuUsuarioApareceConectadoComo(String userName) throws Throwable {
		String usuarioLogado = homePage.getUserLog();
		assertEquals("https://www.advantageonlineshopping.com/#/", driver.getCurrentUrl());
		assertEquals(userName, usuarioLogado);
	}

	@Entao("^devo permanecer na tela de registro$")
	public void devoPermanecerNaTelaDeRegistro() throws Throwable {
		assertEquals("https://www.advantageonlineshopping.com/#/register", driver.getCurrentUrl());
	}

}
