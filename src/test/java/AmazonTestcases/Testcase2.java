package AmazonTestcases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

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






}
