package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class noDuplicateCategory extends BasePage{
	WebDriver driver;

	public noDuplicateCategory(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "//input[@name='data']")
	WebElement Enetr_Category_Name;
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/input[2]")
	WebElement Add_Button_Element;

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[1]")
	WebElement Category_Name_Check;

	public void insertCategoryName(String category) {
		Enetr_Category_Name.sendKeys(category);
	}

	public void clickAddButton() {
		Add_Button_Element.click();

	}

	public void SelectCategoryAdded(String categoryName) {
		selectFromDropDown(Category_Name_Check,categoryName);}
	
	public void checkDuplicatevalue(String value) {
	        Select select = new Select(Category_Name_Check);  

	        List<WebElement> dropDownlist= select.getOptions();
	        
	      //Iterating all the elements of dropdown       
	    	for(int i=0;i<dropDownlist.size()-1;i++ )
	    	{
	    	    if(dropDownlist.get(i).getText().equalsIgnoreCase(value))
	    	    {
	    	       System.out.println("<Duplicated Cataegory Value>");
	    	       select.selectByVisibleText(value);
	    	       break;
	    			 

}
	    	}
}
}

