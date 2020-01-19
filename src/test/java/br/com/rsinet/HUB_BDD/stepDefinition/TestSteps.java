package br.com.rsinet.HUB_BDD.stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.util.DriverFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TestSteps {
	private WebDriver driver;
	private JavascriptExecutor js;

	@Dado("^que estou na tela home$")
	public void que_estou_na_tela_home() throws Throwable {
		driver = DriverFactory.initDriver();
	}

	@Quando("^clico no botao logar$")
	public void clico_no_botao_logar() throws Throwable {
		driver.findElement(By.id("menuUser")).click();
	}

	@Quando("^clico em Criar uma nova conta$")
	public void clico_em_Criar_uma_nova_conta() throws Throwable {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")));
	}

	@Quando("^informo o userName \"([^\"]*)\"$")
	public void informo_o_userName(String arg1) throws Throwable {
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("FLP001");
	}

	@Quando("^informo o email \"([^\"]*)\"$")
	public void informo_o_email(String arg1) throws Throwable {
		driver.findElement(By.name("emailRegisterPage")).sendKeys("felipe.felipe@felipe.com");
	}

	@Quando("^informo a senha \"([^\"]*)\"$")
	public void informo_a_senha(String arg1) throws Throwable {
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Felipe8");
	}

	@Quando("^informo a confirmacao de senha \"([^\"]*)\"$")
	public void informo_a_confirmacao_de_senha(String arg1) throws Throwable {
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Felipe8");
	}

	@Quando("^informo o primeiro nome \"([^\"]*)\"$")
	public void informo_o_primeiro_nome(String arg1) throws Throwable {
		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Felipe");
	}

	@Quando("^informo o ultimo nome \"([^\"]*)\"$")
	public void informo_o_ultimo_nome(String arg1) throws Throwable {
		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Silva");
	}

	@Quando("^informo o telefone \"([^\"]*)\"$")
	public void informo_o_telefone(String arg1) throws Throwable {
		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("(11) 953701433");
	}

	@Quando("^informo o pais \"([^\"]*)\"$")
	public void informo_o_pais(String arg1) throws Throwable {
		driver.findElement(By.name("countryListboxRegisterPage")).sendKeys("Brazil");
	}

	@Quando("^informo a cidade/municipio \"([^\"]*)\"$")
	public void informo_a_cidade_municipio(String arg1) throws Throwable {
		driver.findElement(By.name("cityRegisterPage")).sendKeys("Taboão da Serra");
	}

	@Quando("^informo o endereco \"([^\"]*)\"$")
	public void informo_o_endereco(String arg1) throws Throwable {
		driver.findElement(By.name("addressRegisterPage")).sendKeys("Rua particular, 25");
	}

	@Quando("^informo o estado \"([^\"]*)\"$")
	public void informo_o_estado(String arg1) throws Throwable {
		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("São Paulo");
	}

	@Quando("^informo o CEP \"([^\"]*)\"$")
	public void informo_o_CEP(String arg1) throws Throwable {
		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("06784-200");
	}

	@Quando("^clico no termo concordar$")
	public void clico_no_termo_concordar() throws Throwable {
		driver.findElement(By.name("i_agree")).click();
	}

	@Quando("^clico em register$")
	public void clico_em_register() throws Throwable {
		driver.findElement(By.id("register_btnundefined")).click();
	}

	@Entao("^sou redirecionado para a tela home$")
	public void sou_redirecionado_para_a_tela_home() throws Throwable {
		assertEquals("https://www.advantageonlineshopping.com/#/", driver.getCurrentUrl());
		System.out.println("Cadastro feito");
	}

	@Entao("^apareco como logado$")
	public void apareco_como_logado() throws Throwable {
		assertTrue(driver.getPageSource().contains("FLP001"));
	}

}
