package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;


//create a class "TopMenuTest"
public class TopMenuTest extends Utility {
    String baseUrl = "https://demowebshop.tricentis.com/";



    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }


    //create a method with the name "selectMenu()" It has one parameter name "menu" of type string
    //This method should click on the menu whatever name is passed as a parameter.
    public void selectMenu(String menu){
        String menuTab = "Books";
        clickOnElement(By.xpath("//div[@class='header-menu']"));

    }

    //
    @Test
    public void verifyPageNavigation(){
        String menuTab = "Top Menu";
        System.out.println("Verifying navigate to : " +menuTab);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }




}
