import core.CoreFunc;
import org.junit.Test;
import org.openqa.selenium.By;

public class Locator {

    private CoreFunc core =  new CoreFunc();

    @Test
    public void firstTest() {

        core.openWebPage("https://rus.delfi.lv");

        core.findElement(By.xpath("//img[@alt='DELFI']"));

        core.closeWebPage();

    }

}
