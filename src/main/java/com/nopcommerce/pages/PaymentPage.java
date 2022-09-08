package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class PaymentPage extends Utility {


    By CardHolderNum = By.xpath("//input[@id='CardholderName']");
    By CardNum = By.xpath("//input[@id='CardNumber']");
    By ExMonth = By.xpath("//select[@id='ExpireMonth']");
    By ExYear = By.xpath("//select[@id='ExpireYear']");
    By CardCode = By.xpath("//input[@id='CardCode']");
    By continueCardDetail = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    By CardVisaNumber = By.xpath("//input[@id='CardNumber']");


    public void EnterCardHolderName() throws InterruptedException {
        sendTextToElement(CardHolderNum,"DivyaPatel");
        Thread.sleep(1000);
    }
    public void EnterCardNumber()
    {
        sendTextToElement(CardNum,"5123 4590 4605 8920");
    }
    public void EnterExpireMonth()
    {
        sendTextToElement(ExMonth,"7");

    }
    public void EnterExpireYear()
    {
        sendTextToElement(ExYear,"2025");
    }
    public void EnterCardCode()
    {
        sendTextToElement(CardCode,"233");
    }
    public void ContinueCardDetails()
    {
        clickOnElement(continueCardDetail);
    }
    public void SelectVisaCardNumber()
    {
        sendTextToElement(CardVisaNumber,"4012888888881881");
    }
}
