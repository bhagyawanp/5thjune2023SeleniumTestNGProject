package TestCases;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.baseClass;
import Resources.commonMethods;
import pageObjectModels.loginPageObjects;
import pageObjectModels.myInfoPageObjects;

public class myInfoTestCases extends baseClass {

	@Test
	public void fillPersonalDetails() throws IOException, InterruptedException, AWTException {
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		loginPageObjects lpo = new loginPageObjects(driver);
		lpo.enterUsername().sendKeys("Admin");
		lpo.enterPassword().sendKeys("admin123");
		lpo.clickOnLogin().click();

		myInfoPageObjects mpo = new myInfoPageObjects(driver);

		Thread.sleep(3000);
		mpo.clickOnMyInfo().click();

		Thread.sleep(3000);

		Thread.sleep(2000);
		mpo.clickOnNationalityDropdwon().click();

		Thread.sleep(3000);
		
		commonMethods.handleDropdown(mpo.chooseNationality(), "Indian");
		
		
		
	//	commonMethods.handleDropdown(mpo.chooseNationality(), "Married");
		
		
		
		
		
		
	
		
		
		

		/*
		 * driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(
		 * Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 * driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(
		 * "Satyawan");
		 * driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys(
		 * Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 * driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys(
		 * "Ashok");
		 * driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(
		 * Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 * driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(
		 * "Pawar"); driver.findElement(By.
		 * xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Nitin"
		 * ); Thread.sleep(5000);
		 * driver.findElement(By.xpath("(//div[@data-v-957b4417='']/input)[5]")).
		 * sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)); Thread.sleep(5000);
		 * driver.findElement(By.xpath("(//div[@data-v-957b4417='']/input)[5]")).
		 * sendKeys("12345"); Thread.sleep(2000); driver.findElement(By.
		 * xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("23");
		 * Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath("(//label[@data-v-7ef819fd=''])[2]")).click();
		 * 
		 * 
		 * 
		 * driver.findElement(By.
		 * xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text']")).
		 * click(); Thread.sleep(5000); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//div[text()='Browse']")).click();
		 * Thread.sleep(2000); //click on ‘Choose file’ to upload the desired file //
		 * browse.sendKeys("C:\\Users\\bhagy\\Pictures\\test.jpeg");
		 * 
		 * setClipboardData("C:\\Users\\bhagy\\Pictures\\test.jpeg"); //native key
		 * strokes for CTRL, V and ENTER keys Robot robot = new Robot();
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * 
		 * 
		 * } public static void setClipboardData(String string) { StringSelection
		 * stringSelection = new StringSelection(string);
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,
		 * null); }
		 * 
		 * }
		 */
	}

}
