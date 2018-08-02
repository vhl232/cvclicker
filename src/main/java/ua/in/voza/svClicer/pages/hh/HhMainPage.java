package ua.in.voza.svClicer.pages.hh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.in.voza.svClicer.Utils;
import ua.in.voza.svClicer.pages.AbstractPage;
import ua.in.voza.svClicer.pages.MainPage;

public class HhMainPage extends AbstractPage implements MainPage {
	public HhMainPage(WebDriver driver) {
		super(driver);
		url = "https://kiev.hh.ua/";
		driver.get(url);
		init();
	}

	@FindBy(className = "navi-item__employer-info")
	private WebElement name;

	public boolean validateLoginIn() {
		if (name != null) {
			String nAme;
			try {
				try {
					driver.findElement(By.className("dropdown-closer")).click();
				} catch (Exception ignored) {}

				nAme = name.getText().trim();
			} catch (Exception e) {
				return false;
			}
			return Utils.getPropery("userName").equals(nAme);
		}
		return false;
	}
}
