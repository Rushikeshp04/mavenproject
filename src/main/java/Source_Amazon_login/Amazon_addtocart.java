package Source_Amazon_login;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_addtocart {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(xpath="(//div[@class='a-section a-spacing-base a-text-center'])[2]")
	WebElement selectshoe;

    @FindBy(xpath="//input[@id='add-to-cart-button']")
    WebElement addtocart;



     public void searchshoe()
     {
    	 search.sendKeys("shoes"+Keys.ENTER);
    	 
    	 
     }

     public void selectshoe() 
     {
    	 selectshoe.click();
     }
     
    public void addtocart()
    {
    	addtocart.click();
        }


public Amazon_addtocart(WebDriver driver)
{
   PageFactory.initElements(driver, this);	

}

}
