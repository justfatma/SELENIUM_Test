package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1_name {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.id("L2AGLb")).click();

        driver.findElement(By.name("q")).sendKeys("Java");  //name ile arama

        Thread.sleep(1000);
        driver.findElement(By.className("gNO89b")).click();             //className ile arama
    }
}
