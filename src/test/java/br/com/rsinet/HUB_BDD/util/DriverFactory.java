package br.com.rsinet.HUB_BDD.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.HUB_BDD.manager.FileReaderManager;

public class DriverFactory {
	private static WebDriver driver;
	
	public static WebDriver initDriver() {
		System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(FileReaderManager.getInstance().getConfigReader().getUrl());
		
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
