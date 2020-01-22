package br.com.rsinet.HUB_BDD.manager;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.pageFactory.HomePage;
import br.com.rsinet.HUB_BDD.pageFactory.ProductPage;
import br.com.rsinet.HUB_BDD.pageFactory.RegisterPage;
import br.com.rsinet.HUB_BDD.pageFactory.SearchPage;

public class PageObjectManager {
	private WebDriver driver;
	 
	 private ProductPage productPage;
	 	 
	 private HomePage homePage;
	 
	 private RegisterPage registerPage;
	 
	 private SearchPage searchPage;
	 
	 
	 
	 public PageObjectManager(WebDriver driver) {
	 
		this.driver = driver;
	 
	 }
	 
	 
	 
	 public HomePage getHomePage(){
	 
		 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	 
	 }
	 
	 
	 
	 public ProductPage getProductPage() {
	 
		 return (productPage == null) ? productPage = new ProductPage(driver) : productPage;
	 
	 }
	 
	 
	 
	 public RegisterPage getRegisterPage() {
	 
		 return (registerPage == null) ? registerPage = new RegisterPage(driver) : registerPage;
	 
	 }
	 
	 
	 
	 public SearchPage getSearchPage() {
	 
		 return (searchPage == null) ? searchPage = new SearchPage(driver) : searchPage;
	 
	 }
}
