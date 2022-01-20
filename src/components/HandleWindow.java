package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class HandleWindow {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Selenium\\Gecko Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();


        driver.get("http://www.demo.guru99.com/popup.php");
        Thread.sleep(3000);

        //we save first window
        String firstWin = driver.getWindowHandle();
        driver.switchTo().frame("gdpr-consent-notice");

        Thread.sleep(3000);
        driver.findElement(By.id("save")).click();

        driver.switchTo().window(firstWin);


        String firstWinUrl = driver.getCurrentUrl();
        System.out.println("First Window :   " + firstWinUrl);

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        //We use set for windows changing
        Set<String> windowAllWindows = driver.getWindowHandles();

        for (String window:windowAllWindows) {
            driver.switchTo().window(window);
        }


        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("omer@gmail.com");
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

        System.out.println("2. windows Url =  " + driver.getCurrentUrl());

        //to close the window we use driver.close();
        driver.close();

        driver.switchTo().window(firstWin);
        System.out.println("Current page Url=   " + driver.getCurrentUrl());

        Thread.sleep(2000);

        //to close use driver.quit();
        driver.quit();
    }
}
