import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Main_Class {
    public static void main(String[] args){
        System.setProperty("webdriver.chrom.driver","C:\\Users\\user\\Desktop\\Selenium\\Новая папка\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ru-ru.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[contains(text(), \"Создать новый аккаунт\")]")).click();//*[@id="u_0_2_l1"]/text()
        driver.findElement(By.name("firstname")).sendKeys("Анна");
        driver.findElement(By.name("lastname")).sendKeys("Шутова");
        driver.findElement(By.name("reg_email__")).sendKeys("gtfff3013@yandex.ru");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("gtfff3013@yandex.ru");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Vaska140786");
        driver.findElement(By.name("birthday_day")).click();
        Select select = new Select(driver.findElement(By.name("birthday_day")));
        select.selectByValue("14");
        driver.findElement(By.name("birthday_month")).click();
        Select select1 = new Select(driver.findElement(By.name("birthday_month")));
        select1.selectByVisibleText("июл");
        driver.findElement(By.name("birthday_year")).click();
        Select select2 = new Select(driver.findElement(By.name("birthday_year")));
        select2.selectByValue("1986");
//        Select se = new Select(driver.findElement(By.name("sex")));

// Select the option using the visible text
//        se.selectByValue("1").click();
        driver.findElement(By.xpath("//div[7]/span/span[1]/input")).click();






//       driver.quit();
    }
}
