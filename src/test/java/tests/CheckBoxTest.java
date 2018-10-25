package tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest {
    @Test
    public void singleCheckBoxTest() throws InterruptedException {
        String outputMessage = new CheckBoxPage(driver).clickSingleCheckBox();

        Assertions.assertThat(outputMessage).isEqualTo("Success - Check box is checked");
    }
}
