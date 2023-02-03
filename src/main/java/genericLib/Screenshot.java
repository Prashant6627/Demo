package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public void getScreenshot(WebDriver driver, String name) throws IOException {
		Date d = new Date();
		String currentDate = d.toString().replaceAll(":","-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(AutoConstant.photopath+currentDate+name+".png");
		FileUtils.copyFile(srcFile, destFile);
	}

}
