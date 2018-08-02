package ua.in.voza.svClicer.pages.hh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.in.voza.svClicer.pages.AbstractPage;
import ua.in.voza.svClicer.pages.CvPage;

public class HhCvPaGe extends AbstractPage implements CvPage {
	@FindBy(xpath = "//*[data-name=\"HH/Resume/UpdateResume\"/ancestor::*]")
	WebElement refreshButton;
	public HhCvPaGe(WebDriver driver) {
		super(driver);
		url = "https://kiev.hh.ua/applicant/resumes/view?resume=71c8cebcff02fe5b610039ed1f727a6a58726a";
		driver.get(url);
		init();
	}

	@Override
	public void upDateDate() {
		refreshButton.click();
	}
}
