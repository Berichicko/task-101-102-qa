import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
    private final static String URL_CONNECTION = "file:///D:/Саша/IT/IT%20Academ_QAQ/Форма%20заказов.html";
    HomePage homePage;
    private WebDriver driver;

    @Before
    public void openConnection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_CONNECTION);
        homePage = new HomePage(driver);
    }

    @After
    public void closeConnection() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
