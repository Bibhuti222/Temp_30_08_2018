package com.scripts.Maven_GitHub;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Temp 
{
	@Test
	public void method()
	{
		System.out.println("Maven_GitHUb_Configuration");
		System.out.println("Maven_GitHUb_Update");
		FirefoxDriver d= new FirefoxDriver();
		d.get("https://www.google.co.in/");
		System.out.println(d.getTitle());
		d.close();
	}
}
