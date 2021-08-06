package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin(){
        loginMap.btnLogin.click();
    }
    public void clickBtnFechar(){
        loginMap.btnFechar.click();
    }
    public void clickDivFecharModal() {
        loginMap.divFecharModal.click();
    }
    public void setInpUserName(String username) {
        loginMap.inpUserName.sendKeys(username);
    }
    public void setInpPassword(String password) {
        loginMap.inpPassword.sendKeys(password);
    }
    public void clickInpRemember(){
        loginMap.inpRemember.click();
    }
    public void btnSignIn(){
        loginMap.btnSignIn.click();
    }
    public void linkCreateAccount(){
        loginMap.linkCreateAccount.click();
    }
    public boolean isBtnSignIn(){
        return loginMap.btnSignIn.isEnabled();
    }
}
