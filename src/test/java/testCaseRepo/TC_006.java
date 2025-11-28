package testCaseRepo;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationsPage;

public class TC_006 extends BaseClass {
	
	@Test(groups= {"Regression","Sanity","Smoke"})
	public void ORG_002() throws EncryptedDocumentException, Exception {
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganizationMenu();
		OrganizationsPage op=new OrganizationsPage(driver);
		op.clickOnCreateNewOrganizationIcon();
		String orgName=eUtil.getSingleCellDataFromExcel("Organizations",7,1);
		String website=eUtil.getSingleCellDataFromExcel("Organizations",7,2);
		String phone=eUtil.getSingleCellDataFromExcel("Organizations",7,3);
		String email=eUtil.getSingleCellDataFromExcel("Organizations",7,4);
		String city=eUtil.getSingleCellDataFromExcel("Organizations",7,5);
		String state=eUtil.getSingleCellDataFromExcel("Organizations",7,6);
		String country=eUtil.getSingleCellDataFromExcel("Organizations",7,7);
		int ranNum=jUtil.generateRandomNumber(10000);
		CreatingNewOrganizationPage cnop=new CreatingNewOrganizationPage(driver);
		cnop.createNewOrganization(orgName+ranNum, website, phone, email, city, state, country);
		Thread.sleep(2000);
	
	}		

}


