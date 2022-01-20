package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://login.yahoo.com/");
        driver.manage().window().maximize();

       // driver.findElement(By.linkText("Kullanıcı adınızı mı unuttunuz?")).click();

        driver.findElement(By.partialLinkText("Kullanıcı")).click();

        driver.findElement(By.className("phone-no")).sendKeys("fatmak23523532sdggs@gmail.com");
        driver.findElement(By.name("verifyYid")).click();
    }

}
