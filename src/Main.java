import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.get("https://www.facebook.com/");
        String str = Driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
        System.out.println("By relative xpath - "+ str);
        String strg = Driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/h2")).getText();
        System.out.println(strg);
        Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Soumojit Mandal");
        Driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password1234");
        Driver.findElement(By.xpath("//button[@name='login']")).click();
        String str1 = Driver.findElement(By.partialLinkText("Forgotten account?")).getText();
        System.out.println(str1);
        Driver.findElement(By.partialLinkText("Forgotten account?")).click();
        String taw = Driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _aklv _4jy3 _517h _51sy']")).getText();
        System.out.println("Try another way " + taw);
        String strfb = Driver.findElement(By.xpath("//div[@class='x6s0dn4 x78zum5 x1iyjqo2 x1n2onr6']")).getText();
        System.out.println(strfb);
//        int count = Driver.findElements(By.xpath("//input[@id='send_email']")).size();
//        System.out.println(count);
//        Driver.close();
    }
}