package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * version 28-10-2025
 * author QSP
 * 
 */

public class PropertiesUtility implements IPathUtility {
	
	/**
	 * This is a generic method to fetch data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperties(String key) throws IOException{
		FileInputStream fis=new FileInputStream(IPathUtility.propertiesPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}

}
