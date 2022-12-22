package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AboutUsPageObject {

    WebDriver driver;

    public AboutUsPageObject(WebDriver driver) {
        this.driver = driver;
    }

    By lcHome = By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/nav/ul/li[1]/a/span");
    By lcShop = By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/nav/ul/li[2]/a");
    By lcContact = By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/nav/ul/li[3]/a");
    By tvTabOne = By.xpath("//*[@id=\"customsitewidebar\"]/div[1]/h4");
    By tvTabTwo = By.xpath("//*[@id=\"customsitewidebar\"]/div[2]/h4");
    By tvTabThree = By.xpath("//*[@id=\"customsitewidebar\"]/div[3]/h4");
    By tvPageTitle = By.xpath("//*[@id=\"shopify-section-template--17105175511348__14e9c73d-fb1c-4544-b2cb-a5da5a6a8275\"]/div/div/div/div/h2/span");
    By btnBackToShop = By.xpath("//*[@id=\"shopify-section-template--17105175511348__14e9c73d-fb1c-4544-b2cb-a5da5a6a8275\"]/div/div/div/div/div[2]/a");


    public void clickHomeLink(){
        WebElement home = driver.findElement(lcHome);
        Assert.assertEquals(home.isDisplayed(),true);
        home.click();
    }
    public void clickShopLink(){
        WebElement shop = driver.findElement(lcShop);
        Assert.assertEquals(shop.isDisplayed(), true);
        shop.click();
    }
    public void clickContactLink(){
        WebElement contact = driver.findElement(lcContact);
        Assert.assertEquals(contact.isDisplayed(), true);
        contact.click();
    }
    public void selectTabOneText(){
        WebElement tabOne = driver.findElement(tvTabOne);
        Assert.assertEquals(tabOne.isDisplayed(), true);
        tabOne.getText();
    }
    public void selectTabTwoText(){
        WebElement tabTwo = driver.findElement(tvTabTwo);
        Assert.assertEquals(tabTwo.isDisplayed(), true);
        tabTwo.getText();
    }
    public void selectTabThreeText(){
        WebElement tabThree = driver.findElement(tvTabThree);
        Assert.assertEquals(tabThree.isDisplayed(), true);
        tabThree.getText();
    }
    public void clickBackToShopButton(){
        WebElement backToShopButton = driver.findElement(btnBackToShop);
        Assert.assertEquals(backToShopButton.isDisplayed(), true);
        backToShopButton.click();
    }


//    public void setNameValue(String keysToPass){
//        WebElement name = driver.findElement(etName);
//        name.sendKeys(keysToPass);
//    } //script for entering text
}
