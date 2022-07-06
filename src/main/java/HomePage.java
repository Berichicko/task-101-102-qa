import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifySurname() {
        return driver.findElement(By.xpath("//td[contains(text(), 'Фамилия:')] ")).
                getText().contains("Фамилия");
    }

    public boolean verifyName() {
        return driver.findElement(By.xpath("//td[contains(text(), 'Имя:')] ")).
                getText().contains("Имя");
    }

    public boolean verifyGender() {
        return driver.findElement(By.xpath("//td[contains(text(), 'Пол:')] ")).
                getText().contains("Пол");
    }

    public boolean verifyForm() {
        return driver.findElement(By.xpath("//input[@type=\"submit\"][@value=\"Заказать\"]")).
                getAttribute("value").contains("Заказать");
    }

}

