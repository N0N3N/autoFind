package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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
    }

    public void list(By value){
        List<WebElement> elements = driver.findElements(value);
        System.out.println("Number of found elements = "+ elements.size());

        for(WebElement ele : elements){
            System.out.println(ele.getText());
        }

    }
    public void checkList(By value, String text){
        List<WebElement> elements = driver.findElements(value);
        System.out.println("Number of found elements = "+ elements.size());

        for(WebElement ele : elements){
            if (ele.getText().contains(text)){
                System.out.println("Found: "+ ele.getText());
            }

        }

    }


}
