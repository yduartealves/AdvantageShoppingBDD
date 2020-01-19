package br.com.rsinet.HUB_BDD.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	private static WebDriver driver;
	
	public static WebDriver initDriver() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constantes.URLHOME);
		
		return driver;
	}

	public static WebDriver getdriver() {
		if(driver != null) {
			return driver;
		}
		
		initDriver();
		return driver;
		
	}
	
	public static void closeDriver() {
		if(driver != null) {
			driver.quit();
		}
	}
	
	
}
