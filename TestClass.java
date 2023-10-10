package org.capminds.capmindsproject;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;

import com.pom.Pom_Class;
import com.runner.Base_class;

public class TestClass extends Base_class{


	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);
	

 public static void main(String[] args)  throws InterruptedException {
	 
	// Launch browser
	geturl("https://ehr.vozo.xyz:444/");

	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	// Enter User name
	sendkeys(pom.getinstance().getUsername(), "tech1");

	// Enter Password
	sendkeys(pom.getinstance().getPassword(), "capminds@03");

	// Click Sign In Button '
	Clickonelement(pom.getinstance().getSigninbtn());

	// Click On Month Option
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
    
    
    ///////////////////Favorite Pharmacies   

    
    
  //click Settings Module
	Clickonelement(pom.getERXPage().getClickSettingsModule2());
	
	Thread.sleep(4000);
	
	//click Features Button
	Clickonelement(pom.getERXPage().getClickFeatures2());		
	
	Thread.sleep(4000);
	
	//click Administration
	Clickonelement(pom.getERXPage().getClickAdministration());	
	
	//click ERX Settings
	Clickonelement(pom.getERXPage().getClickERXSettings());		
	
	Thread.sleep(4000);
	
	//click Favourite Pharmacies
	Clickonelement(pom.getERXPage().getClickFavoritePharamices());		
	
	//click Add Pharmacies button
	Clickonelement(pom.getERXPage().getClickAddPharmacies());		
		
	// Enter Pharmacies
	sendkeys(pom.getERXPage().getEnterPharamacies(), "C");
	
	Thread.sleep(4000);
	
	//click Search Button
	Clickonelement(pom.getERXPage().getClickSearchButton());
	
	//click Search Button
	Clickonelement(pom.getERXPage().getClickSearchButton());
	
	Thread.sleep(4000);
	
	//Select Cypress Radio Button 
	Clickonelement(pom.getERXPage().getSelectCypressRadiobutton());
	
	//click SAve Button
	Clickonelement(pom.getERXPage().getClickSaveButton());
	
	
	////////////////       RX Profiles
	
	Thread.sleep(4000);
	
	//click RX Profile Button
	Clickonelement(pom.getERXPage().getClickRXProfiles());
		
	//click RXprofiles
	Clickonelement(pom.getERXPage().getClickAddRXProfiles());
	
	// Enter Name
	sendkeys(pom.getERXPage().getEnterName(), "kumar");
		
	//click SYNTHROID (Oral Pill) Yes
	Clickonelement(pom.getERXPage().getClickSYNTHROIDyes());
	
	
	
	
	
	
	
	//Click LEVO-T (Oral Pill) Yes
	Clickonelement(pom.getERXPage().getClickLEVOyes());
	
	//click CLEOCIN-T (Topical) Yes
	Clickonelement(pom.getERXPage().getClickCLEOCINyes());
	
	//click RETIN-A (Topical) Yes
	Clickonelement(pom.getERXPage().getClickRETINyes());
	
	//click  IONIL T (Shampoo) Yes
	Clickonelement(pom.getERXPage().getClickIONILyes());
	
	//click Interferon beta-1a (Injectable) Yes
	Clickonelement(pom.getERXPage().getClickInterferonyes());
	
	//click ZOCOR (Oral Pill)Yes
	Clickonelement(pom.getERXPage().getClickZOCORyes());
		
	//click Peginterferon alfa-2a (Injectable) Yes
	Clickonelement(pom.getERXPage().getClickPeginterferonyes());
	
	//click SAVE
	Clickonelement(pom.getERXPage().getClickSAVE());
		
	//click CLOSE
	Clickonelement(pom.getERXPage().getClickClose());
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
