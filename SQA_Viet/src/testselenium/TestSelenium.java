package testselenium;

import java.awt.Button;
import java.time.Duration;
import javax.swing.text.Element;
import javax.swing.text.html.FormView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelenium {

    static WebDriver driver;
    static String url = "http://localhost:8080/SQA_Demo";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Nam4_2\\SQA\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        testLogin1();
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        testLogin2();
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        testLogin3();
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        testLogin4();
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        testLogin5();

    }

    static void testLogin1() {

        (driver.findElement(By.name("login"))).click();
    }

    static void testLogin2() throws InterruptedException {
        WebElement username = driver.findElement(By.name("user"));
        username.sendKeys("B17DCCN685");
        Thread.sleep(1000);
        (driver.findElement(By.name("login"))).click();
    }

    static void testLogin3() throws InterruptedException {
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("123");
        Thread.sleep(1000);
        (driver.findElement(By.name("login"))).click();
    }

    static void testLogin4() throws InterruptedException {
        WebElement username = driver.findElement(By.name("user"));
        username.sendKeys("B17DCCN685");
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("125ascscs");
        Thread.sleep(1000);
        (driver.findElement(By.name("login"))).click();
    }

    static void testLogin5() throws InterruptedException {
        WebElement username = driver.findElement(By.name("user"));
        username.sendKeys("B17DCCN685");
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("123");
        Thread.sleep(1000);
        (driver.findElement(By.name("login"))).click();
    }

}
