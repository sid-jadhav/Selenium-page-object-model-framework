package com.sidfinance.sidWallet.testbase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class TestBase {
	Properties properties;
	String env;
	public void LoadProperties() throws IOException{
		properties= new Properties();
		System.out.println(System.getProperty("user.dir"));
		File f= new File(System.getProperty("user.dir")+"\\src\\test\\resource\\Test1.properties");
		FileReader obj= new FileReader(f);
		properties.load(obj);
		env=System.getenv("env");
		System.out.println(env);
	}
	public String getProperties(String Name) throws IOException{
		return(properties.getProperty(Name));
	}
	@Test
	public void print() throws IOException{
		LoadProperties();
		System.out.println(getProperties(env));
		
	}
}
