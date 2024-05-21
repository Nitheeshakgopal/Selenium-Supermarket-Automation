package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;
import context.Constants;

public class ManageUsersPage extends PageActions {
	
	WebDriver driver;
	
	 public ManageUsersPage(WebDriver driver) {
		 super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@class='content']/div/a[1]")
	 WebElement search;
	 
	 @FindBy(id="un")
	 WebElement nameBtn;
	 
	 @FindBy(id="ut")
	 WebElement emailBtn;
	 
	 @FindBy(id="st")
	 WebElement statusBtn;
	 
	 @FindBy(xpath="//*[@name='Search']")
	 WebElement saveBtn;
        public void manageUserPage() throws InterruptedException {
        clickElement(search);
        setTextBox(nameBtn,"Neethu Albert");
        setTextBox(emailBtn,"neethu@gmail.com	");
   		 handleStaticDropdown(statusBtn,"Active");
   		 Thread.sleep(1000);
   		 scrollToBottomofPage();
   		 clickElement(saveBtn);
        	
        	
        	
        	
  }
	
}
