import core.CoreFunc;
import org.junit.Test;

public class Locator {

    CoreFunc core =  new CoreFunc();

    @Test
    public void firstTest() {

        core.openWebPage("https://rus.delfi.lv");


        core.closeWebPage();

    }

}
