package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 /**
  * This is a creating new Organization page POM class
  * @author QSP
  * @version 05-11-2025
  */

public class CreatingNewOrganizationPage {
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement organizationNameTF;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement websiteTF;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement employeeTF ;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industryDropdown;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phoneTF;
	
	@FindBy(xpath="//input[@name='email1']")
	private WebElement emailTF;
	
	@FindBy(xpath="//input[@name='ship_city']")
	private WebElement shippingCityTF;
	
	@FindBy(xpath="//input[@id='ship_state']")
	private WebElement shippingStateTF;
	
	@FindBy(xpath="//input[@id='ship_country']")
	private WebElement shippingCountryTF;
	
	@FindBy(xpath="(//input[@value='  Save  '])[2]")
	private WebElement saveBtn;
	
	//************initialize***********
	public CreatingNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//*****************getter methods *********

	public WebElement getOrganizationNameTF() {
		return organizationNameTF;
	}

	public WebElement getWebsiteTF() {
		return websiteTF;
	}

	public WebElement getEmployeeTF() {
		return employeeTF;
	}

	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	public WebElement getPhoneTF() {
		return phoneTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getShippingCityTF() {
		return shippingCityTF;
	}

	public WebElement getShippingStateTF() {
		return shippingStateTF;
	}

	public WebElement getShippingCountryTF() {
		return shippingCountryTF;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//*********utilize**********
	
	public void createNewOrganization(String orgName,String website,String employee)
	{
		getOrganizationNameTF().sendKeys(orgName);
		getWebsiteTF().sendKeys(website);
		getEmployeeTF().sendKeys(employee);
		getSaveBtn().click();
	}
	
	public void createNewOrganization(String orgName,String website,String industry,String phone )
	{
		getOrganizationNameTF().sendKeys(orgName);
		getWebsiteTF().sendKeys(website);
		getIndustryDropdown().sendKeys(industry);
		getPhoneTF().sendKeys(phone);
		getSaveBtn().click();
	}
	
	public void createNewOrganization(String orgName,String website,String phone,String email,String shippingCity,String shippingState,String shippingCountry)
	{
		getOrganizationNameTF().sendKeys(orgName);
		getWebsiteTF().sendKeys(website);
		getPhoneTF().sendKeys(phone);
		getEmailTF().sendKeys(email);
		getShippingCityTF().sendKeys(shippingCity);
		getShippingStateTF().sendKeys(shippingState);
		getShippingCountryTF().sendKeys(shippingCountry);
		getSaveBtn().click();
		
	}	

}
