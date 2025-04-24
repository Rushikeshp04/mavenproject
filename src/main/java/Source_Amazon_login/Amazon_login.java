package Source_Amazon_login;

<<<<<<< HEAD

=======
>>>>>>> 3632f3323dd713e125400360630897283cb0c3a7
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login {
<<<<<<< HEAD
           // WebDriver driver;
	  @FindBy(id="nav-link-accountList-nav-line-1")
	  WebElement hovertobutton;
	  
	  @FindBy(xpath="//span[@class=\"nav-action-inner\"]")
	  WebElement loginbutton;

       @FindBy(name="email")
       WebElement email;
       
       @FindBy(className = "a-button-input")
           WebElement continuebutton;
       
       @FindBy(id="ap_password")
       WebElement password;

       @FindBy(id="signInSubmit")
       WebElement signinbutton;
       
       
       public void hoverbutton(WebDriver driver)
       {
    	  Actions A1 = new Actions(driver);
    	  A1.moveToElement(hovertobutton).perform();;
       }
        
      public void clickonlogin()
      {
    	  loginbutton.click(); 
      }

      public void email()
      {
    	  email.sendKeys("rushikeshpowar3@gmail.com");
      }

 public void clickoncontinuebutton()
 {
	 continuebutton.click(); 
 }
 
  public void password() 
  {
	  password.sendKeys("7769983872");
  }

 public void signinbuuton()
 {
	 signinbutton.click();
 }

   public Amazon_login(WebDriver driver) 
   {
	   PageFactory.initElements(driver, this);
   }



=======
	
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


>>>>>>> 3632f3323dd713e125400360630897283cb0c3a7
}
