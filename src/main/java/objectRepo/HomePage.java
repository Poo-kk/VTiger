package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;
/**
 * This is a Home page POM class
 * @author QSP
 * @version 05-11-2025
 */
public class HomePage {
	//Locating web elements
	
	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
	private WebElement leadsMenu;
	
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
	private WebElement orgaizationMenu;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement signOutOption;
	
	//Initializing the web element
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// getter methods
	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getOrgaizationMenu() {
		return orgaizationMenu;
	}


	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignOutOption() {
		return signOutOption;
	}
	
	
	//Utilizing Web element

	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	public void clickOnOrganizationMenu()
	{
		getOrgaizationMenu().click();
	}
	
	
	public void signOutOperation(WebDriver driver) {
		
		SeleniumUtility sUtil=new SeleniumUtility();
		sUtil.mouseHovering(driver,getAccountsIcon());
		getSignOutOption().click();
	}
		
}
