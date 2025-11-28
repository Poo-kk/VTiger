package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	
	//***********locating************
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createNewOrganizationIcon;
	
	//***********initialize******
	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

//**************getter methods********
	public WebElement getCreateNewOrganizationIcon() {
		return createNewOrganizationIcon;
	}

	//*****************utilize************
	
	/**
	 * This is a business library to click on create new lead icon
	 */
	public void clickOnCreateNewOrganizationIcon()
	{
		getCreateNewOrganizationIcon().click();
	}
}
