package com.nopcommerce.testsuite;

import com.nopcommerce.pages.TopMenuPage;
import com.nopcommerce.testbase.TestBase;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenuPage topMenuPage =new TopMenuPage();

    @Test
    public void computerNavigation()
    {
        topMenuPage.selectMenu("Computer");
        topMenuPage.verifyComputer();
    }
    @Test
    public void electronicsNavigation()
    {
        topMenuPage.selectMenu("Electronics");
        topMenuPage.verifyElectronic();

    }
    @Test
    public void apparelNavigation()
    {
        topMenuPage.selectMenu("Apparel");
        topMenuPage.verifyApparel();

    }
    @Test
    public void Digital_downloadsNavigation()
    {
        topMenuPage.selectMenu("Digital downloads");
        topMenuPage.verifyDigital_downloads();

    }
    @Test
    public void BookNavigation()
    {
        topMenuPage.selectMenu("Book");
        topMenuPage.verifyBooks();

    }
    @Test
    public void JewelryPageNavigation()
    {
        topMenuPage.selectMenu("Jewelry");
        topMenuPage.verifyJewelry();
    }
    @Test
    public void GiftCardNavigation()
    {
        topMenuPage.selectMenu("Gift Cards");
        topMenuPage.verifyGift_Card();

    }
}
