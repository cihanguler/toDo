package com.dart.pages;

import com.dart.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    @FindBy(css = "menuOptionsExample")
    public List<WebElement> menuOptions;

    @FindBy(css = "pageSubTitleExample")
    public WebElement pageSubTitle;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }



}
