import org.junit.Assert;
import org.junit.Test;

public class FormTest extends Base {

    @Test
    public void testTextSurname() {
        Assert.assertTrue(homePage.verifySurname());
    }

    @Test
    public void testTextSurnameName() {
        Assert.assertTrue(homePage.verifyName());
    }

    @Test
    public void testTextGender() {
        Assert.assertTrue(homePage.verifyGender());
    }

    @Test
    public void testTextForm() {
        Assert.assertTrue(homePage.verifyForm());
    }

    @Test
    public void testInputSurname() {
        homePage.setUserSurname("Ivanov");
        Assert.assertEquals("Ivanov", homePage.getUserSurname());
    }

    @Test
    public void testInputName() {
        homePage.setUserName("Peter");
        Assert.assertEquals("Peter", homePage.getUserName());
    }

    @Test
    public void testInputGenderM() {
        homePage.setUserMGender();
        Assert.assertTrue(homePage.getUserGenderM());
    }
}
