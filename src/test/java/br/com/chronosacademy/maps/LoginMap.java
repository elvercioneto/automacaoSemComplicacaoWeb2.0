package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUser")
    public WebElement btnLogin;

    @FindBy(css = ".closeBtn")
    public WebElement btnFechar;

    @FindBy(css = ".PopUp")
    public WebElement divFecharModal;

    @FindBy(css = "*[name='username']")
    public WebElement inpUserName; //set

    @FindBy(css = "*[name='password']")
    public WebElement inpPassword; //set

    @FindBy(css = "*[name='remember_me']")
    public WebElement inpRemember; //click

    @FindBy(css = "#sign_in_btnundefined")
    public WebElement btnSignIn;

    @FindBy(css = ".create-new-account")
    public WebElement linkCreateAccount;

    @FindBy(css = ".loader")
    public WebElement divLoader;

    @FindBy(css = ".containMiniTitle")
    public WebElement textLogado;

    @FindBy(xpath = "//label[contains(text(), 'Incorrect')]")
    public WebElement textErroLogin;




}
