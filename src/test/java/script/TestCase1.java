package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryDemoAppPage;
import pomPages.SkillraryPage;

public class TestCase1 extends BaseClass{
	@Test(groups = "RegressionSuite")
	public void tc1() {
		SkillraryPage s=new SkillraryPage(driver);
		s.gearsButton();
		s.skillraryDemoAppcication();
		
		driverUtilities.switchTabs(driver);
		
		SkillraryDemoAppPage sd=new SkillraryDemoAppPage(driver);
		driverUtilities.mouseHover(driver, sd.getCourseTab());
		sd.seleniumTrainingTab();
		
		AddToCartPage a = new AddToCartPage(driver);
		driverUtilities.doubleClick(driver, a.getAddButton());
		a.addToCartButton();
		driverUtilities.alertPopup(driver);
		
		Reporter.log("TestCase1 executed successfully",true);
	}
	@Test(groups ="SmokeSuite")
	public void demo1() {
		Reporter.log("TestCase1 Smoke",true);
	}
	@Test(groups ="RegressionSuite")
	public void demo2() {
		Reporter.log("TestCase1 Regression",true);
	}
	@Test
	public void demo3() {
		Reporter.log("TestCase1 NoSmoke-NoRegression",true);
	}
	@Test
	public void demo4() {
		Reporter.log("TestCase1 RegionalRegression",true);
	}
}
