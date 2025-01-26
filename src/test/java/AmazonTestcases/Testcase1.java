package AmazonTestcases;

import org.testng.annotations.Test;

import Source_Amazon_login.Amazon_login;

public class Testcase1 extends launch_quit
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
    	  
      }
}
