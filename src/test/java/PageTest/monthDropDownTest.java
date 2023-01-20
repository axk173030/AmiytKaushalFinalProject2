package PageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.monthDropDown;
import Util.BrowserFactory;

public class monthDropDownTest {
	WebDriver driver;
	@Test
	public void monthDropTest() throws InterruptedException {
		driver= BrowserFactory.init();
		monthDropDown mdd= PageFactory.initElements(driver, monthDropDown.class);
		mdd.selectMonthName("Jan");
		
		Thread.sleep(2000);
		
		mdd.selectMonthName("Feb");
		Thread.sleep(2000);
		mdd.selectMonthName("Mar");
		Thread.sleep(2000);
		mdd.selectMonthName("Apr");
		Thread.sleep(2000);
		mdd.selectMonthName("May");
		Thread.sleep(2000);
		mdd.selectMonthName("Jun");
		Thread.sleep(2000);
		mdd.selectMonthName("Jul");
		Thread.sleep(2000);
		mdd.selectMonthName("Aug");
		Thread.sleep(2000);
		mdd.selectMonthName("Sep");
		Thread.sleep(2000);
		mdd.selectMonthName("Oct");
		Thread.sleep(2000);
		mdd.selectMonthName("Nov");
		Thread.sleep(2000);
		mdd.selectMonthName("Dec");
		Thread.sleep(2000);
		BrowserFactory.tearDown();
		
	
	}
	

}
