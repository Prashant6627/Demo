package script;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoAppPage;
import pomPages.SkillraryPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {
	
	@Test(groups = "SmokeSuite")
	public void tc2() throws IOException {
		SkillraryPage s=new SkillraryPage(driver);
		s.gearsButton();
		s.skillraryDemoAppcication();
		
		driverUtilities.switchTabs(driver);
		
		SkillraryDemoAppPage sd=new SkillraryDemoAppPage(driver);
		driverUtilities.dropDown(sd.getCoursedd(),pdata.getData("courseName"));
		
		TestingPage t=new TestingPage(driver);
		driverUtilities.dragAndDrop(driver, t.getSeleniumTraining(),t.getCart());
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverUtilities.scrollBar(driver, x, y);
		t.facebookIcon();
		
		Reporter.log("TestCase2 executed successfully",true);
		
	}
	@Test(groups ="SmokeSuite")
	public void demo1() {
		Reporter.log("TestCase2 Smoke",true);
	}
	@Test(groups ="RegressionSuite")
	public void demo2() {
		Reporter.log("TestCase2 Regression",true);
	}
	@Test
	public void demo3() {
		Reporter.log("TestCase2 NoSmoke-NoRegression",true);
	}
	@Test
	public void demo4() {
		Reporter.log("TestCase2 RegionalRegression",true);
	}

}
