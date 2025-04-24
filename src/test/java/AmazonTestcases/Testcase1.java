package AmazonTestcases;

<<<<<<< HEAD
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
=======
>>>>>>> 3632f3323dd713e125400360630897283cb0c3a7
import org.testng.annotations.Test;

import Source_Amazon_login.Amazon_login;

public class Testcase1 extends launch_quit
<<<<<<< HEAD

{      
      @Test
      //@Parameters("browser")
      public void test1()
//           {  
//    	  if (nameofbrowser.equals("chrome")) 
//    	  {
//    		 driver = new ChromeDriver(); 
//    	  }
//    	  if (nameofbrowser.equals("edge")) 
//    	  {
//    		 driver = new EdgeDriver(); 
//    	  }if (nameofbrowser.equals("firefox")) 
//    	  {
//    		 driver = new FirefoxDriver(); 
//    	  }
              {
    	 
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
    	  Amazon_login DD = new Amazon_login( driver);
    	   DD.hoverbutton(driver);
    	   DD.clickonlogin();
    	   DD.email();
    	   DD.clickoncontinuebutton();
    	   DD.password();
    	   DD.signinbuuton();
      
      
=======
{
      @Test
      public void test1()
      {
    	  Amazon_login OK = new Amazon_login(driver);
    	  OK.signin(driver);
    	  OK.clickonsign();
    	  OK.mail();
    	  OK.continue_button();
    	  OK.pwd();
    	  OK.button();
    	  
>>>>>>> 3632f3323dd713e125400360630897283cb0c3a7
      }
}
