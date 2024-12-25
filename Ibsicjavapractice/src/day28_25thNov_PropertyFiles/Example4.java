package day28_25thNov_PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * File path: Absolute path: from the root till the target element example:
		 * D:\AutomationSessions\Workspace\IBsicjavapractice\TestData\AppData.properties
		 * Relative Path: start from anywhere example:
		 * .\IBsicjavapractice\TestData\AppData.properties where '.' indicates
		 * current working dir String filePath=System.getProperty("user.dir")+
		 * "\IBsicjavapractice\TestData\AppData.properties";
		 * 
		 */
		String filePath = System.getProperty("user.dir") + ".\\TestData\\AppData.properties";
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String appUrl = prop.getProperty("applicationUrl");
		System.out.println(appUrl);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("mobile"));
		System.out.println(prop.getProperty("emailId"));
		// adding/updating property file
		prop.setProperty("AutomationTool2", "TOSCA");
		prop.setProperty("emailId", "PQR@gmail.com");

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.store(fos, "Modified property file data..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.flush();
				fos.close();
				System.out.println("File updated...");
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
}
/*
 * Steps to read data from property file: 1. First find the location where you
 * have stored property file 2. Create an instance of FileInputStream class and
 * pass the property file location to its constructor. 3. Create an instance of
 * Properties class 4. With the help of properties reference variable call
 * load() properties class and pass FileInputStream class reference to this
 * method 5. Call getProperty(key) of Properties class to read data from
 * property file
 */