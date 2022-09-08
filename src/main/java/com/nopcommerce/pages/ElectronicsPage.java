package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import javafx.scene.control.Cell;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    ComputerPage computerPage =new ComputerPage();
    By Electronics = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a[1]");
    By CellPhone = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By VerifyCellPhone = By.xpath("//div[@class='center-2']/div[1]/div[1]/h1[1]");
    By ListView = By.xpath("//div[@class='page-body']/div[1]/div[1]/a[2]");
    By ProductName = By.xpath("//div[@class='item-grid']/div[3]/div[1]/div[2]/h2[1]/a[1]");
    By VerifyTextNokiaLumia = By.xpath("//div[@class='product-essential']/div[2]/div[1]/h1[1]");
    By VerifyPrice = By.xpath("//span[@id='price-value-20']");
    By ChangeQtyClear = By.xpath("//input[@id='product_enteredQuantity_20']");
    By ChangeQty = By.xpath("//input[@id='product_enteredQuantity_20']");
    By AddtoCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By VerifyMsg = By.xpath("//p[@class='content']");
    By CloseCross = By.xpath("//span[@class='close']");
    By MouseHoverShopping = By.xpath("//div[@class='header-links']/ul[1]/li[4]/a[1]/span[1]");
    By MouseHoverGotoCart = By.xpath("//button[@class='button-1 cart-button']");
    By VerifyShoppingCartMsgs = By.xpath("//div[@class='center-1']/div[1]/div[1]/h1[1]");
    By VerifyQtycheck = By.xpath("//input[@class='qty-input']");
    By VerifyTotalAfter = By.xpath("//div[@class='total-info']/table[1]/tbody/tr[4]/td[2]/span[1]/strong[1]");
    By VerifyWelcome = By.xpath("//div[@class='center-1']/div[1]/div[1]/h1[1]");

    By Register = By.xpath("//button[@class='button-1 register-button']");
    By VerifyRegister = By.xpath("//div[@class='center-1']/div[1]/div[1]/h1[1]");
    //Fill the mandatory Field
    By FirstNameR = By.xpath("//input[@id='FirstName']");
    By LastNameR = By.xpath("//input[@id='LastName']");
    By EmailR = By.xpath("//input[@id='Email']");
    By passwordR = By.xpath("//input[@id='Password']");
    By ConfirmPasswordR = By.xpath("//input[@id='ConfirmPassword']");
    By ClickRegister = By.xpath("//button[@class='button-1 register-next-step-button']");
    By MsgRegisterCompleted = By.xpath("//div[@class='center-1']/div[1]/div[2]/div[1]");
    By clickContinueR = By.xpath("//a[@class='button-1 register-continue-button']");
    By VerifyTextShopping = By.xpath("//div[@class='center-1']/div[1]/div[1]/h1[1]");
    By RadioButton2ndDayAir = By.xpath("//input[@id='shippingoption_2']");
    By SelectVisa = By.xpath("//select[@id='CreditCardType']");

    By Verify2ndDayAir = By.xpath("//div[@class='order-review-data']/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By Verify2ndTotal = By.xpath("//div[@class='total-info']/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");

    By Logout = By.xpath("//a[@href=\"/logout\"]");

    By VerifyURL = By.xpath("//div[@class='header-logo']/a/img[1]");



    public void TabClick() throws InterruptedException {
        mouseHoverToElement(Electronics);
        Thread.sleep(1000);
        mouseHoverToElementAndClick(CellPhone);

    }
    public String VerifyText()
    {
        return getTextFromElement(VerifyCellPhone);

    }
    public void TheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        clickOnElement(ListView);
        Thread.sleep(1000);
        clickOnElement(ProductName);
        Thread.sleep(1000);
        driver.findElement(ChangeQtyClear).clear();
        Thread.sleep(1000);
        sendTextToElement(ChangeQty,"2");
        Thread.sleep(1000);
        clickOnElement(AddtoCart);
        Thread.sleep(1000);
        clickOnElement(CloseCross);

    }
    public String VerifyTextNokia()
    {
        return getTextFromElement(VerifyTextNokiaLumia);

    }
    public String VerifyThePrice()
    {
        return getTextFromElement(VerifyPrice);

    }
    public String VerifyShoppingCartMsg()
    {
        return getTextFromElement(VerifyMsg);

    }
    public String VerifyMsgShoppingCart()
    {
        return getTextFromElement(VerifyShoppingCartMsgs);
    }
    public String VerifyQtyUpdate()
    {
        return getTextFromElement(VerifyQtycheck);

    }
    public String VerifyTotalAfterCheck()
    {
        return getTextFromElement(VerifyTotalAfter);

    }
    public void Success() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(MouseHoverShopping);
        Thread.sleep(1000);
        clickOnElement(MouseHoverGotoCart);
        Thread.sleep(1000);
    }

       /* computerPage.CheckBoxClick();
        Thread.sleep(1000);
        computerPage.CheckoutClick();
        Thread.sleep(1000);*/


    public String VerifyWelcomeText()
    {
        return getTextFromElement(VerifyWelcome);

    }
    public void ClickOnRegister() throws InterruptedException {
        clickOnElement(Register);
        Thread.sleep(1000);
    }
    public String VerifyRegisterClick()
    {
        return getTextFromElement(VerifyRegister);

    }
    public void AllMandatoryField() throws InterruptedException {
        sendTextToElement(FirstNameR,"Divya");
        Thread.sleep(1000);
        sendTextToElement(LastNameR,"Patel");
        Thread.sleep(1000);
        sendTextToElement(EmailR,"divpat@gmail.com");
        Thread.sleep(1000);
        sendTextToElement(passwordR,"DivPa96");
        sendTextToElement(ConfirmPasswordR,"DivPa96");
        Thread.sleep(1000);
        clickOnElement(ClickRegister);

    }
    public String RegistrationCompleted()
    {
        return getTextFromElement(MsgRegisterCompleted);

    }
    public void ContinueClickR() throws InterruptedException {
         clickOnElement(clickContinueR);
         Thread.sleep(1000);

    }
    public String VerifyShoppingR()
    {
        return getTextFromElement(VerifyTextShopping);

    }
    public void RadioButtonSecondDayAir() throws InterruptedException {
        clickOnElement(RadioButton2ndDayAir);
        Thread.sleep(1000);

    }
    public void SelectVisaCard()
    {
        selectByValueFromDropDown(SelectVisa,"visa");

    }
    public String VerifySecondDayAir()
    {
        return getTextFromElement(Verify2ndDayAir);

    }
    public String VerifySecondTotal()
    {
        return getTextFromElement(Verify2ndTotal);

    }
    public void ClickLogout()
    {
        clickOnElement(Logout);

    }
    public String VerifyURLLink()
    {
        return getTextFromElement(VerifyURL);

    }


}
