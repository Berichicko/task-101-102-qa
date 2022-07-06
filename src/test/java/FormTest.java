import org.junit.Assert;
import org.junit.Test;

public class FormTest extends Base {

    @Test
    public void testSurname() {
        Assert.assertTrue(homePage.verifySurname());
    }

    @Test
    public void testName() {
        Assert.assertTrue(homePage.verifyName());
    }

    @Test
    public void testGender() {
        Assert.assertTrue(homePage.verifyGender());
    }

    @Test
    public void testForm() {
        Assert.assertTrue(homePage.verifyForm());
    }
}

