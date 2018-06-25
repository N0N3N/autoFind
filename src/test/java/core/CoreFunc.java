package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreFunc {

    private WebDriver driver;
    private static final String CHROME_DRIVER_LOCATION = "C://driver/chromedriver.exe";

    public CoreFunc() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
        this.driver = new ChromeDriver();
    }

    public void openWebPage(String url) {
        driver.get(url);
    }

    public void closeWebPage() {
        driver.close();
    }

    public WebElement findElement(By value){

        return driver.findElement(value);

    }
    public void clickElement(By value) {driver.findElement(value).click();}

    public void sendKeys(By value, String text) {
        driver.findElement(value).sendKeys(text);

        //driver.findElement(By.name("phone")).sendKeys("(222)222-2222");
        //driver.findElement(By.id("ssn")).sendKeys("555-55-5555");
    }

}
