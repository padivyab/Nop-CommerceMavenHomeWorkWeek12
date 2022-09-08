package com.nopcommerce.testsuite;

import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.ElectronicsPage;
import com.nopcommerce.pages.PaymentPage;
import com.nopcommerce.pages.QuantityPage;
import com.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {

    ComputerPage computerPage =new ComputerPage();

    ElectronicsPage electronicsPage =new ElectronicsPage();

    PaymentPage paymentPage =new PaymentPage();

    QuantityPage quantityPage =new QuantityPage();

    @Test
    public void TabClickText() throws InterruptedException {
        electronicsPage.TabClick();
        electronicsPage.VerifyText();

    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronicsPage.TabClick();
        electronicsPage.VerifyText();
        electronicsPage.TheProductAddedSuccessfullyAndPlaceOrderSuccessfully();
        electronicsPage.VerifyTextNokia();
        electronicsPage.VerifyThePrice();
        electronicsPage.VerifyShoppingCartMsg();
        electronicsPage.Success();
        electronicsPage.VerifyMsgShoppingCart();
        electronicsPage.VerifyQtyUpdate();
        electronicsPage.VerifyTotalAfterCheck();
        computerPage.CheckBoxClick();
        Thread.sleep(1000);
        computerPage.CheckoutClick();
        Thread.sleep(1000);
        electronicsPage.VerifyWelcomeText();
        electronicsPage.ClickOnRegister();
        electronicsPage.VerifyRegisterClick();
        electronicsPage.AllMandatoryField();
        electronicsPage.RegistrationCompleted();
        electronicsPage.ContinueClickR();
        electronicsPage.VerifyShoppingR();
        computerPage.CheckBoxClick();
        computerPage.CheckoutClick();
        Thread.sleep(1000);
        computerPage.EnterCountry();
        Thread.sleep(1000);
        computerPage.EnterCity();
        Thread.sleep(1000);
        computerPage.EnterAddress();
        Thread.sleep(1000);
        computerPage.EnterZipCodeClick();
        Thread.sleep(1000);
        computerPage.EnterPhoneNumClick();
        Thread.sleep(1000);
        computerPage.ClickContinue();
        electronicsPage.RadioButtonSecondDayAir();
        Thread.sleep(1000);
        computerPage.ClickContinueNextAir();
        Thread.sleep(1000);
        computerPage.RadioButtonCreditCard();
        Thread.sleep(1000);
        electronicsPage.SelectVisaCard();
        Thread.sleep(1000);
        paymentPage.EnterCardHolderName();
        Thread.sleep(1000);
        paymentPage.SelectVisaCardNumber();
        Thread.sleep(1000);
        paymentPage.EnterExpireMonth();
        Thread.sleep(1000);
        paymentPage.EnterExpireYear();
        Thread.sleep(1000);
        paymentPage.EnterCardCode();
        Thread.sleep(1000);
        paymentPage.ContinueCardDetails();
        Thread.sleep(1000);
        computerPage.PaymentMethodCreditAir();
        Thread.sleep(1000);
        electronicsPage.VerifySecondDayAir();
        Thread.sleep(1000);
        electronicsPage.VerifySecondTotal();
        Thread.sleep(1000);
        computerPage.ClickConfirm();
        Thread.sleep(1000);
        computerPage.VerifyThankyYouText();
        Thread.sleep(1000);
        computerPage.VerifyMessageSuccessfullyText();
        Thread.sleep(1000);
        computerPage.ContinueOrderSuccessfully();
        Thread.sleep(1000);
        computerPage.VerifyWelcometext();
        Thread.sleep(1000);
        electronicsPage.ClickLogout();
        Thread.sleep(1000);
        electronicsPage.VerifyURLLink();



    }
}
