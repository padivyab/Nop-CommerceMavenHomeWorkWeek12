package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {

    By TopMenu = By.xpath("//div[@class='header-menu']/ul[1]");

    By Computer = By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a[1]");

    By electronic = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a[1]");

    By Apparel = By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a[1]");

    By Digital_downloads = By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a[1]");

    By Books = By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a[1]");

    By Jewelry = By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a[1]");

    By Gift_Cards = By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a[1]");

    public void selectMenu(String menu) {

        //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
        //1.2 This method should click on the menu whatever name is passed as parameter.
        List<WebElement> topMenuName = driver.findElements(TopMenu);

        for (WebElement name : topMenuName) {
            if (name.getText().equalsIgnoreCase(menu)) {
                name.click();
                break;

            }
        }
    }
    public String verifyComputer()
    {
        return getTextFromElement(Computer);

    }
    public String verifyElectronic()
    {
        return getTextFromElement(electronic);

    }
    public String verifyApparel()
    {
        return getTextFromElement(Apparel);

    }
    public String verifyDigital_downloads()
    {
        return getTextFromElement(Digital_downloads);

    }
    public String verifyBooks()

    {
        return getTextFromElement(Books);

    }
    public String verifyJewelry()
    {
        return getTextFromElement(Jewelry);

    }
    public String verifyGift_Card()
    {
        return getTextFromElement(Gift_Cards);

    }


}
