import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    private final static String URL = "https://codepen.io/berichicko/full/wvmWPpX";
    private String result = "result";
    protected WebDriver driver;

    @Before
    public void openConnection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        driver.switchTo().frame(driver.findElement(By.id(result)));
     }

    @After
    public void closeConnection() {
       driver.quit();
    }
}
