package br.com.rsinet.HUB_BDD.dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ConfigFileReader {
	private Properties properties;
	private final String CAMINHOCONFIG = "config//configuration.properties";
	private BufferedReader reader;

	public ConfigFileReader() {
		try {
			reader = new BufferedReader(new FileReader(CAMINHOCONFIG));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties não existe no caminho " + CAMINHOCONFIG);
		}

	}

	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;

		throw new RuntimeException("driverPath não está especificado em Configuration.properties");

	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait não está especificado em Configuration.properties");
	}

	public String getUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url não está especificado em Configuration.properties");
	}

}
