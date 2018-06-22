import core.CoreFunc;
import org.junit.Test;
import org.openqa.selenium.By;

public class Experiment {

    private CoreFunc core =  new CoreFunc();

    @Test
    public void unoExp() {

        core.openWebPage("https://google.com");
        core.clickElement(By.xpath("//*[@id=\"SIvCob\"]/a[3]"));
        core.clickElement(By.xpath("//*[@id=\"sfdiv\"]"));
        core.sendKeys(By.xpath("//*[@id=\"sfdiv\"]"),"555");
    }
}
