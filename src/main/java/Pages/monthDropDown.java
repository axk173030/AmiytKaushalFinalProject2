package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class monthDropDown extends BasePage {
	WebDriver driver;

	public monthDropDown(WebDriver driver) {
		this.driver = driver;
	}

	// @FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]")
	// WebElement DropDownElement;
	@FindBy(how = How.NAME, using = "due_month")
	WebElement DropDownElement;
	

	public void selectMonthName(String monthName) {
		//selectFromDropDown(month_Element, monthName);

//WebElement DropDownElement=driver.findElement(By.name("due_month"));
       
//Creating dropdown object for Month dropdown
Select dropdownSelectObject=new Select(DropDownElement);

//Getting all the items of dropdown        
List<WebElement> DrpDownList=dropdownSelectObject.getOptions();

//Iterating all the elements of dropdown       
for(int i=0;i<DrpDownList.size();i++ )
{
    if(DrpDownList.get(i).getText().equalsIgnoreCase(monthName))
    {
       System.out.println(DrpDownList.get(i).getText()+ " month exists in the dropdown");
       dropdownSelectObject.selectByVisibleText(monthName);
       break;
     }       
  
    	 
     }
}
	}