package pageObjectModels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myInfoPageObjects {

	public WebDriver driver;
	
	
	private By myInfo=By.xpath("//span[normalize-space()='My Info']");
	
	private By nationalityDropdown=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	
	private By nationalityOptions= By.xpath("//div[@class='oxd-select-option']");
	
	
	
	public myInfoPageObjects(WebDriver driver) {
		
	     this.driver=driver;
	}


	public WebElement clickOnMyInfo() {
		
		return driver.findElement(myInfo);
	}
	
	public WebElement clickOnNationalityDropdwon() {
		
		return driver.findElement(nationalityDropdown);
	}
	
    public List<WebElement> chooseNationality() {
		
		return driver.findElements(nationalityOptions);
	}
	
	
	
	
}
