package PageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.noDuplicateCategory;
import Util.BrowserFactory;
@Test
public class noDuplicateCategoryTest {
	WebDriver driver;
	public void duplicationTest() throws InterruptedException {
		driver=BrowserFactory.init();
		 noDuplicateCategory ndc= PageFactory.initElements(driver, noDuplicateCategory.class);
		/* ndc.insertCategoryName("3*");
			Thread.sleep(4000);
			ndc.clickAddButton();
			Thread.sleep(4000);
			ndc.SelectCategoryAdded("3*");
			Thread.sleep(4000);*/
			ndc.checkDuplicatevalue("3**");
			Thread.sleep(4000);
	
			BrowserFactory.tearDown();
	
	}
}
