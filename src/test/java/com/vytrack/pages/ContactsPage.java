package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ContactsPage extends BasePage{

//    @FindBy(xpath = )
//    public WebElement  email;

    public WebElement getContactEmail(String email){

        String xpath = "//td[contains(text(),'"+email+"')][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));


    }



}
