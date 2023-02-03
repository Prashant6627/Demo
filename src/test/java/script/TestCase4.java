package script;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryPage;

public class TestCase4 extends BaseClass{
	@Test(groups = "SmokeSuite")
	public void tc4() throws InterruptedException, IOException {
		SkillraryPage s = new SkillraryPage(driver);
		s.categories();
		Thread.sleep(5000);
		for(WebElement b:s.getList()) {
			String innerhtml = b.getAttribute("innerHTML");
			if(innerhtml.contains(pdata.getData("category"))) {
				b.click();
			}
		}
		Thread.sleep(9000);
		
		Reporter.log("TestCase4 executed successfully",true);
	}
	@Test(groups ="SmokeSuite")
	public void demo1() {
		Reporter.log("TestCase4 Smoke",true);
	}
	@Test(groups ="RegressionSuite")
	public void demo2() {
		Reporter.log("TestCase4 Regression",true);
	}
	@Test
	public void demo3() {
		Reporter.log("TestCase4 NoSmoke-NoRegression",true);
	}
	@Test
	public void demo4() {
		Reporter.log("TestCase4 RegionalRegression",true);
	}
	
}
