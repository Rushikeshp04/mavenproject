package Source_Amazon_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login {
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement hoverover;


    @FindBy(xpath="(//span[.='Sign in'])[1]")
    WebElement signin;

    @FindBy(id="ap_email_login")
    WebElement mailfeild;
   
   @FindBy(id="continue")
   WebElement Continue_button; 

   @FindBy(id="ap_password")
   WebElement password_field; 
   
   
   @FindBy(id="signInSubmit")
 WebElement signin_button;   
   
   
   
   
   public void signin( WebDriver driver)
 {
	 Actions A1 = new Actions(driver);
			 A1.moveToElement(hoverover).perform();
 }

   public void clickonsign()
   {
	   signin.click();
   }

        public void mail() 
        {
        	mailfeild.sendKeys("rushikeshpowar3@gmail.com");
        }
 
   public void continue_button() 
   {
	   Continue_button.click();  
   }
   
   
   public void pwd()
   {
	   password_field.sendKeys("Rushikesh@04");
   }
   
   
   public void button()
   {
	   signin_button.click();
   }
 

   public Amazon_login(WebDriver driver)
   {
          PageFactory.initElements(driver, this);	   
   }


}
