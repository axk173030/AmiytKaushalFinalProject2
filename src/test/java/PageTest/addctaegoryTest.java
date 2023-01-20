package PageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.addCategory;
import Util.BrowserFactory;

public class addctaegoryTest {
	
	WebDriver driver;
	
	@Test
	public void validateCategoryadded() throws InterruptedException {
		
		driver=BrowserFactory.init();
		addCategory ac=PageFactory.initElements(driver, addCategory.class);
		ac.insertCategoryName("1*");
		Thread.sleep(4000);
		ac.clickAddButton();
		Thread.sleep(4000);
		ac.SelectCategoryAdded("1*");
		Thread.sleep(4000);
		ac.ValidateCategoryAdded("1*");
		Thread.sleep(4000);
		BrowserFactory.tearDown();
	}}


