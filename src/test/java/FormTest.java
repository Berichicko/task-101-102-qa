import org.junit.Assert;
import org.junit.Test;

public class FormTest extends BaseTest {
    private HomePage homePage;
    private final String surname = "Ivanov";
    private final String name = "Peter";

    @Test
    public void testLabelSurname() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayedSurname());
    }

    @Test
    public void testLabelName() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayedName());
    }

    @Test
    public void testLabelGender() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayedGender());
    }

    @Test
    public void testButtonLabelForm() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayedButtonForm());
    }

    @Test
    public void testInputSurname() {
        homePage = new HomePage(driver);
        homePage.setInputSurnameLabel(surname);
        Assert.assertEquals(surname, homePage.getInputSurnameLabel());
    }

    @Test
    public void testInputName() {
        homePage = new HomePage(driver);
        homePage.setInputNameLabel(name);
        Assert.assertEquals(name, homePage.getInputNameLabel());
    }

    @Test
    public void testInputGenderM() {
        homePage = new HomePage(driver);
        homePage.setRadioGenderM();
        Assert.assertTrue(homePage.isDisplayedGenderM());
    }
}
