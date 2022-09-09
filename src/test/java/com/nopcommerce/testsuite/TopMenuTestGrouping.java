package com.nopcommerce.testsuite;

import com.nopcommerce.pages.TopMenuPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTestGrouping extends TestBase {

    TopMenuPage topMenuPage =new TopMenuPage();

    @Test (groups = "regression")
    public void computerNavigation()
    {
        topMenuPage.selectMenu("Computer");
        topMenuPage.verifyComputer();
    }
    @Test (groups = "sanity")
    public void electronicsNavigation()
    {
        topMenuPage.selectMenu("Electronics");
        topMenuPage.verifyElectronic();

    }
    @Test (groups = "smoke")
    public void apparelNavigation()
    {
        topMenuPage.selectMenu("Apparel");
        topMenuPage.verifyApparel();

    }
    @Test (groups = {"regression","sanity"})
    public void Digital_downloadsNavigation()
    {
        topMenuPage.selectMenu("Digital downloads");
        topMenuPage.verifyDigital_downloads();

    }
    @Test (groups = {"sanity","smoke"})
    public void BookNavigation()
    {
        topMenuPage.selectMenu("Book");
        topMenuPage.verifyBooks();

    }
    @Test (groups = "regression")
    public void JewelryPageNavigation()
    {
        topMenuPage.selectMenu("Jewelry");
        topMenuPage.verifyJewelry();
    }
    @Test (groups = "smoke")
    public void GiftCardNavigation()
    {
        topMenuPage.selectMenu("Gift Cards");
        topMenuPage.verifyGift_Card();

    }
}
