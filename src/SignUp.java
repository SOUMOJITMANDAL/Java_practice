import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SignUp {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.MINUTES);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.partialLinkText("Create new account")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Soumojit");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mandal");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("soumojit.jit@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("soumojit.jit@gmail.com");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Mandal@123456");
        Select obj = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        obj.selectByValue("28");
        // Thread.sleep(2000l);
        Select obj1 = new Select(driver.findElement(By.id("month")));
        obj1.selectByVisibleText("May");
        // Thread.sleep(2000l);
        Select obj2 = new Select(driver.findElement(By.id("year")));
        obj2.selectByVisibleText("2001");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
         Thread.sleep(2000l);
//         String strfb = driver.findElement(By.xpath("//div[@class='x6s0dn4 x78zum5 x1iyjqo2 x1n2onr6']")).getText();
//         System.out.println(strfb);
    }

}
