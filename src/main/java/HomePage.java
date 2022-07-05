import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

        private final WebDriver driver;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

    public boolean verifySurname() {
            return  driver.findElement(By.xpath("//*[text() = ' Фамилия']")).getText().contains("Фамилия");
    }

    public boolean verifyName() {
            return  driver.findElement(By.xpath("//*[text() = 'Имя']")).getText().contains("Имя");
    }

    public boolean verifyGender() {
            return  driver.findElement(By.xpath("//*[text() = 'Пол']")).click().getText().contains("Пол");
    }

    public boolean verifyForm() {
            return  driver.findElement(By.xpath("//*[text() = 'Заказать']")).getText().contains("Заказать");
    }

}



