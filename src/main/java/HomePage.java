import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private final By surnameField = By.xpath("//td[contains(text(), 'Фамилия:')]");
    private final By nameField = By.xpath("//td[contains(text(), 'Имя:')]");
    private final By genderField = By.xpath("//td[contains(text(), 'Пол:')]");
    private final By submitButton = By.xpath("//input[@type='submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifySurname() {
        return driver.findElement(surnameField).
                getText().contains("Фамилия:");
    }

    public boolean verifyName() {
        return driver.findElement(nameField).
                getText().contains("Имя");
    }

    public boolean verifyGender() {
        return driver.findElement(genderField).
                getText().contains("Пол:");
    }

    public boolean verifyForm() {
        return driver.findElement(submitButton).
                getAttribute("value").contains("Заказать");
    }

    public String getUserSurname() {
        return driver.findElement(By.xpath("//input[@name = 'name']")).getAttribute("value");
    }

    public void setUserSurname(String surname) {
        driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys(surname);
    }

    public String getUserName() {
        return driver.findElement(By.xpath("//input[@name = 'height']")).getAttribute("value");
    }

    public void setUserName(String name) {
        driver.findElement(By.xpath("//input[@name = 'height']")).sendKeys(name);
    }

    public void setUserMGender() {
        driver.findElement(By.xpath("//input[@name='gender'][@value=\"m\"]")).click();
    }

    public boolean getUserGenderM() {
        return driver.findElement(By.xpath("//input[@name='gender'][@value=\"m\"]")).isSelected();
    }
}
