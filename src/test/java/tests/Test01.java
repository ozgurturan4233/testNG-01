package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page01;
import utils.Base;
import utils.ConfigReader;

public class Test01 extends Base {

    @Test
    public void logo() throws InterruptedException {
        Page01 elements = new Page01(driver) ;
        driver.get(ConfigReader.getProperty("link"));
        elements.cookiePoP.click();
        Assert.assertTrue(elements.logo.isDisplayed());




    }
}
