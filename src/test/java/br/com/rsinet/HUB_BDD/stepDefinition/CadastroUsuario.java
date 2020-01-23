package br.com.rsinet.HUB_BDD.stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.manager.PageObjectManager;
import br.com.rsinet.HUB_BDD.manager.WebDriverManager;
import br.com.rsinet.HUB_BDD.pageFactory.HomePage;
import br.com.rsinet.HUB_BDD.pageFactory.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroUsuario {
	private WebDriver driver;
	private HomePage homePage;
	private RegisterPage registerPage;
	private PageObjectManager pageObjectManager;
	private WebDriverManager webDriver;
	@Dado("^que estou na tela home$")
	public void que_estou_na_tela_home() throws Throwable {
		webDriver = new WebDriverManager();
		driver = webDriver.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		registerPage = pageObjectManager.getRegisterPage();
	}

	@Quando("^clico no botao logar$")
	public void clico_no_botao_logar() throws Throwable {
		homePage.clickBtnLogar();
	}

	@Quando("^clico em Criar uma nova conta$")
	public void clico_em_Criar_uma_nova_conta() throws Throwable {
		homePage.clickCriarConta();
	}

	@Quando("^informo os dados para cadastro$")
	public void informo_os_dados_para_cadastro(DataTable dados) throws Throwable {
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
	public void o_meu_usuario_aparece_conectado_como(String userName) throws Throwable {
		String usuarioLogado = homePage.getUserLog();
		assertEquals("https://www.advantageonlineshopping.com/#/", driver.getCurrentUrl());
		assertEquals(userName, usuarioLogado);
	}

	@Entao("^devo permanecer na tela de registro$")
	public void devo_permanecer_na_tela_de_registro() throws Throwable {
		assertEquals("https://www.advantageonlineshopping.com/#/register", driver.getCurrentUrl());
	}

	@After
	public void finalizaDriverACadaCenario() {
		webDriver.closeDriver();
	}

}
