package day28_25thNov_PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example3 {

	public static void main(String[] args) throws IOException {
		/*
		 * File path:
		 * 		Absolute path: from the root till the target element
		 * 			  example: D:\AutomationSessions\Workspace\IBsicjavapractice\TestData\AppData.properties
		 * 		Relative Path: start from anywhere
		 * 			  example: .\IBsicjavapractice\TestData\AppData.properties
		 * 				where '.' indicates current working dir
		 * 		String filePath=System.getProperty("user.dir")+"\IBsicjavapractice\TestData\AppData.properties";
		 */
		String filePath=System.getProperty("user.dir")+".\\TestData\\AppData.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String appUrl=prop.getProperty("applicationUrl");
		System.out.println(appUrl);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("mobile"));
		System.out.println(prop.getProperty("emailId"));
	}

}
/*
Steps to read data from property file:
1. First find the location where you have stored property file
2. Create an instance of FileInputStream class and pass the property file location to its constructor.
3. Create an instance of Properties class
4. With the help of properties reference variable call load() properties class and pass
     FileInputStream class reference to this method
5. Call getProperty(key) of Properties class to read data from property file
*/
