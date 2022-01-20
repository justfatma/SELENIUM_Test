package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com.tr/prime");
        driver.manage().window().maximize();



        driver.findElement(By.xpath("//span[text()='ve Siparişler']")).click();


    }



}
