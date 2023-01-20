package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class addCategory extends BasePage {
	WebDriver driver;

	public addCategory(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "categorydata")
	WebElement Enetr_Category_Name;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement Add_Category_Button_Element;

	@FindBy(how = How.NAME, using = "category")
	WebElement Category_Name_Check;

	public void insertCategoryName(String name) {
		Enetr_Category_Name.sendKeys(name);
	}

	public void clickAddButton() {
		Add_Category_Button_Element.click();

	}

	public void SelectCategoryAdded(String Category) {
		selectFromDropDown(Category_Name_Check, Category);}
	

	public void ValidateCategoryAdded(String validationText) {
	
			//selectFromDropDown(month_Element, monthName);

	       
	//Creating dropdown object for Month dropdown
	Select dropdownSelectObject=new Select(Category_Name_Check);

	//Getting all the items of dropdown        
	List<WebElement> DrpDownList=dropdownSelectObject.getOptions();

	//Iterating all the elements of dropdown       
	for(int i=0;i<DrpDownList.size();i++ )
	{
	    if(DrpDownList.get(i).getText().equalsIgnoreCase(validationText))
	    {
	       System.out.println(DrpDownList.get(i).getText()+ "  exists in the dropdown");
	       dropdownSelectObject.selectByVisibleText(validationText);
	       break;
			 
		
	
	}

}
}}