package ua.in.voza.svClicer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ua.in.voza.svClicer.pages.MainPage;
import ua.in.voza.svClicer.pages.hh.HhCvPaGe;
import ua.in.voza.svClicer.pages.hh.HhLoginPage;
import ua.in.voza.svClicer.pages.hh.HhMainPage;

public class Main {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		while (!new HhMainPage(driver).validateLoginIn()){
			new HhLoginPage(driver).login();
		}

		new HhCvPaGe(driver).upDateDate();
	}

}
