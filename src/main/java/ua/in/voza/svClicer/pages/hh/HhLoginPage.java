package ua.in.voza.svClicer.pages.hh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.in.voza.svClicer.Utils;
import ua.in.voza.svClicer.pages.AbstractPage;
import ua.in.voza.svClicer.pages.LoginPage;

public class HhLoginPage extends AbstractPage implements LoginPage {

	@FindBy(name = "username")
	private WebElement email;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(css = "input[type='submit']")
	private WebElement enterButton;
	public HhLoginPage(WebDriver driver) {
		super(driver);
		url = "https://hh.ua/account/login";
		driver.get(url);
		init();
	}


	public void login() {
		email.sendKeys(Utils.getPropery("email"));
		password.sendKeys(Utils.getPropery("password"));
		enterButton.click();
	}
}
