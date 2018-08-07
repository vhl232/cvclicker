package ua.in.voza.svClicer.pages.hh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.in.voza.svClicer.Utils;
import ua.in.voza.svClicer.pages.AbstractPage;
import ua.in.voza.svClicer.pages.CvPage;

public class HhCvPaGe extends AbstractPage implements CvPage {
	@FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div/div[4]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div[2]/button")
	WebElement refreshButton;
	public HhCvPaGe(WebDriver driver) {
		super(driver);
		url = Utils.getPropery("cvLink");
		driver.get(url);
		init();
	}

	@Override
	public void upDateDate() {
		refreshButton.click();
	}
}
