package AmazonTestcases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
<<<<<<< HEAD
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
=======

>>>>>>> 3632f3323dd713e125400360630897283cb0c3a7
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Source_Amazon_login.Amazon_addtocart;
import Source_Amazon_login.Amazon_login;
@Listeners(Amazon_listeners.Amazonlisteners.class)
public class Testcase2 extends launch_quit
{
   @Test
  public void testcase2()
  {
<<<<<<< HEAD
	   Amazon_addtocart F1 = new Amazon_addtocart(driver);
                  F1.searchshoe();
                  F1.selectshoe();
                  
                    Set <String> IF       = driver.getWindowHandles();
                              Iterator <String>  KK=  IF.iterator();
                                  String parentwindow =    KK.next();
                                  String  childwindow =  KK.next();
                              
                                  driver.close();
                                  driver.switchTo().window(childwindow);
                                     
                              F1.addtocart();
                  F1.proccedtobuy();
                  F1.emailid();
                  F1.continuebuttonc();
                  F1.pwd();
                  F1.signinbutton();
                  F1.cardselect();
                  F1.clickonsavecard();
                  
                  
                  WebDriverWait W1 = new WebDriverWait(driver, Duration.ofSeconds(5));
                  W1.until(ExpectedConditions.elementToBeClickable(By.name("ApxSecureIframe")));
                WebElement iframe = driver.findElement(By.name("ApxSecureIframe"));
                driver.switchTo().frame(iframe);
                  
                  F1.inputcardnumber();
                  F1.selectexyears();
                  F1.selectoneyear();
                  F1.selectexpirydate();
                  F1.selectexpirydates();
                  F1.doclickonsavecard();;
                  
                  
          
  
  }
   
=======
//	   Amazon_login OK = new Amazon_login(driver);
//	   OK.signin(driver);
// 	  OK.clickonsign();
// 	  OK.mail();
// 	  OK.continue_button();
// 	  OK.pwd();
// 	  OK.button();
//      
    Amazon_addtocart AB = new Amazon_addtocart(driver); 
       AB.searchshoe();
       AB.selectshoe();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       
       Set <String>     KK = driver.getWindowHandles();
        Iterator <String>        ids=  KK.iterator();
                        String parentid  = ids.next();
                          String childId = ids.next();
//driver.close();
driver.switchTo().window(childId);
AB.addtocart();


      
                                   
                                   
  }
>>>>>>> 3632f3323dd713e125400360630897283cb0c3a7






}
