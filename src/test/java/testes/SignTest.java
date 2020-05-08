package testes;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignTest {
    @Test
    public void testFazerLoginNoTaskit() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuário\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);

        navegador.get("http://www.juliodelima.com.br/taskit/");
        navegador.manage().window().maximize();
        //Thread.sleep(1000);
        navegador.findElement(By.linkText("Sign in")).click();

        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("felipe4002");
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("felipe123");

        navegador.findElement(By.linkText("SIGN IN")).click();

        String saudacao = navegador.findElement(By.className("me")).getText();

        assertEquals("Hi, felipe",saudacao);

        //navegador.quit();
    }
}