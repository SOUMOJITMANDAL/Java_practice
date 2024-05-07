import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.easemytrip.com/?msclkid=d761552210cb101b507b33181b66d568");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String month = "MAY 2024";
        String day = "28";
        driver.findElement(By.xpath("//*[@id='ddate']")).click();
        Thread.sleep(2000L);
//        String strrel = driver.findElement(By.xpath("//*[@class='month2']")).getText();
//        System.out.println(strrel);
//        String str = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div[3]/div/div[4]/div[2]/div/div[1]/div/div[1]/div[2]")).getText();
//        System.out.println(str);
        while(true){
            String strrel = driver.findElement(By.xpath("//*[@class='month2']")).getText();
            System.out.println(strrel);
            if(strrel.equals(month)){
                System.out.println(strrel);
                break;
            }else{
                driver.findElement(By.xpath("//*[@id='img2Nex']")).click();
            }
        }
        Thread.sleep(2000L);
//      driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div[3]/div/div[4]/div[2]/div/div[1]/div/div/ul/li[contains(text(),'28')]")).click();
        driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div[3]/div/div[4]/div[2]/div/div[1]/div/div/ul/li[contains(text(),"+day+")]")).click();
        Thread.sleep(2000L);
        String remonth = "JUL 2024";
        String reday = "17";
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='rdatelbl']")).click();
//        String retn = driver.findElement(By.xpath("//*[@id='dvcalendar']/div/div[1]/div/div[1]/div[2]")).getText();
//        System.out.println(retn);
        while (true){
            String retrn = driver.findElement(By.xpath("//*[@id='dvcalendar']/div/div[1]/div/div[1]/div[2]")).getText();
            System.out.println(retrn);
            if (retrn.equals(remonth)){
                break;
            }else {
                driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
            }
        }
        Thread.sleep(2000L);
        driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div[3]/div/div[4]/div[2]/div/div[1]/div/div/ul/li[contains(text(),"+reday+")]")).click();
    }
}
