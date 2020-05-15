package com.sntax.class33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {
		
		String file=System.getProperty("user.dir"+"/congigs/configuration.properties");
		try {
			FileInputStream fis=new FileInputStream(file);
			fis.close();
			Properties prop=new Properties();
			prop.load(fis);//new IOException
		}catch (IOException e) {//ilk oce specific olani sonra en kapsamli olani atayabilirz
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		
		}
		finally {
			System.out.println("I am a finally block");
		}
		System.out.println("----END OF THE PROGRAM------");
	}

}
