package ua.in.voza.svClicer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage implements Page {

	protected WebDriver driver;
	protected String url;

	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
	protected void init(){
		PageFactory.initElements(driver,this);
	}
}
