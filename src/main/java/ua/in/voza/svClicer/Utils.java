package ua.in.voza.svClicer;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utils {
	private static Properties properties = new Properties();
	static {
		try {
			properties.load(new FileReader("src/main/resources/data.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getPropery(String prop){
		return  properties.getProperty(prop);
	}

}
