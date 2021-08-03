package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.pages.CursoPage;
import br.com.chronosacademy.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class testeWeb {
    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTeste() {

        driverWeb = new Driver("chrome");

        driver = driverWeb.getDriver();

        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }
    @Test
    public void primeiroTeste() {
        String titulo = principalPage.getTitulo();

        assertEquals("Porque Tempo É Conhecimento", titulo);
    }



    @Test
    public void segundoTeste(){
        principalPage.clickBotao();
        cursoPage = new CursoPage(driver);

        String titulo = cursoPage.getTitulo2();

        assertEquals("AUTOMAÇÃO SEM COMPLICAÇÃO WEB 2.0", titulo);
    }





    @After
        public void finalizaTeste(){
            driver.quit();
        }



}
