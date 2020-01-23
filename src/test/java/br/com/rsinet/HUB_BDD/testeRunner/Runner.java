package br.com.rsinet.HUB_BDD.testeRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.HUB_BDD.manager.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feature",
		glue = {"br.com.rsinet.HUB_BDD.stepDefinition"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:relatorios"}
)
public class Runner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}
