package script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;

import org.testng.annotations.Test;

public class Demo {
	@Test
	public void demotest() throws AWTException {
		Robot r = new Robot();
		StringSelection stringSelection = new StringSelection("");
	}

}
