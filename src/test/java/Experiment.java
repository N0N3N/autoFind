import core.CoreFunc;
import org.junit.Test;
import org.openqa.selenium.By;

public class Experiment {

    private CoreFunc core =  new CoreFunc();

    @Test
    public void unoExp() {

        core.openWebPage("http://rus.delfi.lv/");
        //core.list(By.xpath("//*[@class='top2012-title']"));
        core.checkList(By.xpath("//*[@class='top2012-title']"), "В Каунасе рабочие нашли");


        // core.clickElement(By.xpath("//*[contains(text(`Кандидат  bbbbb   Согласия на пост президента Петерис Спрогис`))]"));
        // core.clickElement(By.xpath("//*[@id=\"sfdiv\"]"));
        // core.sendKeys(By.xpath("//*[@id=\"lst-ib\"]"),"555");


    }
}
