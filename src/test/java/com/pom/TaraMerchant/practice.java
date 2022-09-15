package com.pom.TaraMerchant;

import java.io.IOException;

import org.testng.annotations.Test;
import com.pom.TaraMerchant.pages.OTPread_Page;

import com.relevantcodes.extentreports.LogStatus;

public class practice  extends BaseTest {

	@Test
	public void InventoryOutOfStocks() throws InterruptedException, IOException {
		test = rep.startTest("outofstock");
		test.log(LogStatus.INFO, "Starting the test ");
		launchApp();
		Thread.sleep(4000);
		
		OTPread_Page OT=new OTPread_Page(aDriver, test);
		//PageFactory.initElements(aDriver, this);
		Thread.sleep(10000);
		OT.OTPValidationMethod("8884254279");
		
		
			
    }

	}
