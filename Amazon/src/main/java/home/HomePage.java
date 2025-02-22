package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utility.DataDriven;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static webelements.HomePageWebElements.*;


public class HomePage extends WebAPI {


    //    @FindBy(css=shopLinksWebElements) public List<WebElement> shopLinks;
    @FindBy(how = How.CSS, using = shopLinksWebElements)
    public List<WebElement> shopLinks;

    // Page Objects Design Pattern/Page object Model(POM)
    @FindBy(how = How.CSS, using = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(how = How.CSS, using = searchButtonWebElement)
    public WebElement searchButton;
    //@FindBy(how = How.XPATH,using = artNaturalWebElement) public WebElement artNatural;
    @FindBy(css = artNaturalWebElement)
    public WebElement artNatural;
    @FindBy(how = How.CSS, using = qtyWebElement)
    public WebElement qty;
    @FindBy(how = How.XPATH, using = selectQtyWebElement)
    public WebElement selectQty;
    @FindBy(how = How.ID, using = addToCartWebElement)
    public WebElement addToCart;
    @FindBy(how = How.ID, using = checkoutWebElement)
    public WebElement checkout;
    @FindBy(how = How.XPATH, using = iphone11ProWebElements)
    public WebElement iphone11Pro;


    // Steps:1: // Enter keyword in search box
    public void enterKeyWord(String keyword) {
        // Enter keyword in search box
        searchBox.sendKeys(keyword);
    }

    // Steps:2:
    public void clickSearchButton() {
        // Click searchButton
        searchButton.click();
    }

    // Steps:3:
    public void clickProduct() {
        // Click Product
        artNatural.click();
    }

    // Steps:4:
    public void clickQty() {
        // Click Quantity
        qty.click();
    }

    // Steps:5:
    public void doSelectQty() {
        // Select Quantity
        selectQty.click();
    }

    // Steps:6:
    public void clickAddToCart() {
        // Click Add to Cart
        addToCart.click();
    }

    // Steps:7:
    public void clickCheckout() {
        // Click Checkout
        checkout.click();
    }


    public void searchProduct() throws InterruptedException {
        // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("I Phone 11 pro");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);

    }

    public void validateSearchProduct() {
        String actualResult = iphone11Pro.getText();
        Assert.assertEquals(actualResult, "\"iphone 11 pro\"", "I phone 11 Pro is not Displayed");

    }
    public void validateSearchProduct1() {
        String actualResult = iphone11Pro.getText();
        Assert.assertEquals(actualResult, "\"iphone 11 pr\"", "I phone 11 Pro is not Displayed");

    }

//
//    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
//        clickOnSearchButton();
//        List<String> list = DataDriven.getItemsListFromDB();
//        for (int i = 0; i < list.size(); i++) {
//            searchFor(list.get(i));
//            submitSearchButton();
//            navigateBack();
//            clearInput();
//        }
//    }
//
//    public void searchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
//        clickOnSearchButton();
//        List<String> itemList = DataDriven.getItemValue();
//        for (String st : itemList) {
//            searchFor(st);
//            submitSearchButton();
//            navigateBack();
//            clearInput();
//            //validate items
//        }
//    }

}
