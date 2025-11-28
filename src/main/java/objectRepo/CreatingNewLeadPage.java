package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class CreatingNewLeadPage {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTF;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTF;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyTF;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement titleTF;
	
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadSourceDropdown;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobileTF;
	
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployeeTF;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement cityTF;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement stateTF;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement countryTF;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	//*********initializing*******
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	
	//************getter methods************
	
	
	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getCompanyTF() {
		return companyTF;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}

	public WebElement getMobileTF() {
		return mobileTF;
	}

	public WebElement getNoOfEmployeeTF() {
		return noOfEmployeeTF;
	}

	public WebElement getCityTF() {
		return cityTF;
	}

	public WebElement getStateTF() {
		return stateTF;
	}

	public WebElement getCountryTF() {
		return countryTF;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	//***************utilization***************
	
	public void createNewLead(String fName,String lName, String company)
	{
		getFirstNameTF().sendKeys(fName);
		getLastNameTF().sendKeys(lName);
		getCompanyTF().sendKeys(company);
		getSaveBtn().click();
		
	}
	
	
	
	public void createNewLead(String lName,String company,String title, String leadSource,String mobile)
	{
		getLastNameTF().sendKeys(lName);
		getCompanyTF().sendKeys(company);
		getTitleTF().sendKeys(title);
		SeleniumUtility sUtil=new SeleniumUtility();
		sUtil.selectOptionByValue(getLeadSourceDropdown(),leadSource);
		getMobileTF().sendKeys(mobile);
		getSaveBtn().click();
	}
	
	/**
	 * This is business library to create new lead
	 * @param lName
	 * @param company
	 * @param title
	 * @param noOfEmployee
	 * @param mobile
	 * @param city
	 * @param state
	 * @param country
	 */
	
	public void createNewLead(String lName,String company,String title,String noOfEmployee,String mobile,String city,String state,String country )
	{
		getLastNameTF().sendKeys(lName);
		getCompanyTF().sendKeys(company);
		getTitleTF().sendKeys(title);
		getNoOfEmployeeTF().sendKeys(noOfEmployee);
		getMobileTF().sendKeys(mobile);
		getCityTF().sendKeys(city);
		getStateTF().sendKeys(state);
		getCountryTF().sendKeys(country);
		getSaveBtn().click();
		
		
	}	
}