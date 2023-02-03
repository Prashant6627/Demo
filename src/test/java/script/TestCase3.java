package script;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryPage;
import pomPages.WishListPage;

public class TestCase3 extends BaseClass {
	@Test(groups = "RegressionSuite")
	public void tc3() throws IOException, InterruptedException {
		SkillraryPage s=new SkillraryPage(driver);
		s.searchTextBox(pdata.getData("searchTextBox"));
		s.searchButton();
		
		CoreJavaPage c=new CoreJavaPage(driver);
		c.coreJavaCourse();
		
		WishListPage w=new WishListPage(driver);
		w.closeCookies();
		driverUtilities.switchToFrame(driver);
		w.playButton();
		Thread.sleep(3000);
		w.pauseButton();
		driverUtilities.switchBackFromFrame(driver);
		w.wishList();
		
		Reporter.log("TestCase3 executed successfully",true);
		
	}
	@Test(groups ="SmokeSuite")
	public void demo1() {
		Reporter.log("TestCase3 Smoke",true);
	}
	@Test(groups ="RegressionSuite")
	public void demo2() {
		Reporter.log("TestCase3 Regression",true);
	}
	@Test
	public void demo3() {
		Reporter.log("TestCase3 NoSmoke-NoRegression",true);
	}
	@Test
	public void demo4() {
		Reporter.log("TestCase3 RegionalRegression",true);
	}
}
