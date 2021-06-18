
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NhsExam {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.xpath("//*[@id=\"radio-wales\"]")).click();
        // driver.findElement(By.className("block-label selection-button-radio radio-group selected")).click();



        // String userdata =  data.userLoginCrendials().get("customer");
        // String userdatainfo[]=userdata.split("_");
        //  driver.findElement(By.id("Email")).sendKeys(userdatainfo[0]);
        // driver.findElement(By.id("Password")).sendKeys(userdatainfo[1]);
        //  driver.findElement(By.className("login-button")).click();

    }
}




public class Nhs
{

}
