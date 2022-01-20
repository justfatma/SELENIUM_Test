package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2_id {


    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://login.yahoo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("createacc")).click();

        Thread.sleep(1000);
        String isim = "Fatma";
        driver.findElement(By.name("firstName")).sendKeys(isim);

        Thread.sleep(1000);
        driver.findElement(By.id("usernamereg-lastName")).sendKeys("KIRAC");
    }
}
