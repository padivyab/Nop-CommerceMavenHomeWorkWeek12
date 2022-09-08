package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {

    ComputerPage computerPage =new ComputerPage();

    ElectronicsPage electronicsPage =new ElectronicsPage();

    TopMenuPage topMenuPage =new TopMenuPage();

    PaymentPage paymentPage = new PaymentPage();

    QuantityPage quantityPage =new QuantityPage();

    @Test
    public void computerTestMenu() throws InterruptedException {
        computerPage.ClickComputer();
        computerPage.ClickDesktop();
        computerPage.ClickZtoA();
        computerPage.VerifyZtoA();

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {

        computerPage.ClickComputer();
        computerPage.ClickDesktop();
        computerPage.NameAtoZ();
        computerPage.ClickAddToCart();
        computerPage.SelectGHZIntel();
        computerPage.Select8GBIntel();
        computerPage.SelectHDDRadioIntel();
        computerPage.SelectOSRadioIntel();
        computerPage.checkMicroSoftOffice();
        computerPage.VerifyThePrice();
        computerPage.AddToCartButton();
        computerPage.VerifyMsgProduct();
        computerPage.CloseCressButoon();
        computerPage.MouseHoverShoppingCat();
        computerPage.VerifyShoppingCart();
        computerPage.ChangeQTYClear();
        computerPage.VerifyTheTotal();
        computerPage.CheckBoxClick();
        computerPage.CheckoutClick();
        computerPage.VerifyWelcomeMsg();
        //computerPage.TermsCrossClick();
        computerPage.CheckOutAsGuest();
        //computerPage.TermsCrossClick();
        computerPage.EnterFirstName();
        Thread.sleep(1000);
        computerPage.EnterLastName();
        Thread.sleep(1000);
        computerPage.EnterGmail();
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
        Thread.sleep(1000);
        computerPage.ClickRadioButtonNextAir();
        Thread.sleep(1000);
        computerPage.ClickContinueNextAir();
        Thread.sleep(1000);
        computerPage.RadioButtonCreditCard();
        Thread.sleep(1000);
        computerPage.MasterCardClick();
        Thread.sleep(1000);
        computerPage.EnterCardHolderName();
        Thread.sleep(1000);
        computerPage.EnterCardNumber();
        Thread.sleep(1000);
        computerPage.EnterExpireMonth();
        Thread.sleep(1000);
        computerPage.EnterExpireYear();
        Thread.sleep(1000);
        computerPage.EnterCardCode();
        Thread.sleep(1000);
        computerPage.ContinueCardDetails();
        Thread.sleep(1000);
        computerPage.PaymentMethodCreditAir();
        Thread.sleep(1000);
        computerPage.ShippingMethodNextDayAir();
        Thread.sleep(1000);
        computerPage.VerifyTotalMsgnextAir();
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

    }
}
