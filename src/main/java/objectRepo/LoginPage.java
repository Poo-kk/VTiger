package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Locating the web element
	
		@FindBy(xpath="//input[@name='user_name']")
		private WebElement userNameTextField;

		@FindBy(xpath="//input[@name='user_password']")
		private WebElement passwordTextField;
		
		@FindBy(id="submitButton")
		private WebElement loginBtn;
		
		//Initializing the Web element
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		
		//public getter methods
		
		public WebElement getUserNameTextField() {
			return userNameTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
		
		//Utilizing the web elements
		
		public void loginApplication(String UN, String PWD) {
			getUserNameTextField().sendKeys(UN);
			getPasswordTextField().sendKeys(PWD);
			getLoginBtn().click();
		}

}
