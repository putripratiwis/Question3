package questionthree;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://en-gb.facebook.com/reg/";

        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.findElement(By.name("firstname")).sendKeys("Putri");
        System.out.println("Input First Name");
        driver.findElement(By.name("lastname")).sendKeys("Pratiwi");
        System.out.println("Input Last Name");
        driver.findElement(By.name("reg_email__")).sendKeys("putripratiwis@gmail.com");
        System.out.println("Input Email");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("putripratiwis@gmail.com");
        System.out.println("Input Email Confirmation");
        driver.findElement(By.name("reg_passwd__")).sendKeys("putripratiwi71");
        System.out.println("Input Password");

        WebElement selectDate = driver.findElement(By.name("birthday_day"));
        Select BirthdayDate = new Select(selectDate);
        BirthdayDate.selectByValue("12");
        System.out.println("Choose Birth Date");

        WebElement selectMonth = driver.findElement(By.name("birthday_month"));
        Select BirthdayMonth = new Select(selectMonth);
        BirthdayMonth.selectByValue("2");
        System.out.println("Choose Birth Month");

        WebElement selectYear = driver.findElement(By.name("birthday_year"));
        Select BirthdayYear = new Select(selectYear);
        BirthdayYear.selectByValue("1990");
        System.out.println("Choose Birth Year");

        driver.findElement(By.className("_8esa")).click();
        System.out.println("Choose Gender");
        driver.findElement(By.name("websubmit")).click();
        System.out.println("Click Submit");


    }
}