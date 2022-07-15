import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private final By SURNAME_LOCATOR = By.xpath("//td[contains(text(), 'Фамилия:')]");
    private final By NAME_LOCATOR = By.xpath("//td[contains(text(), 'Имя:')]");
    private final By GENDER_LOCATOR = By.xpath("//td[contains(text(), 'Пол:')]");
    private final By BUTTON_FORM_LOCATOR = By.xpath("//input[@type='submit']");

    private final By INPUT_SURNAME_LOCATOR = By.name("surname");
    private final By INPUT_NAME_LOCATOR = By.name("name");
    private final By RADIO_GENDER_M_LOCATOR = By.xpath("//input[@name='gender'][@value=\"m\"]");


    private final String inputSurnameLabel = "Фамилия:";
    private final String inputNameLabel = "Имя";
    private final String inputGenderLabel = "Пол:";
    private final String buttonForm = "Заказать";


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayedSurname() {
        return driver.findElement(SURNAME_LOCATOR).
                getText().contains(inputSurnameLabel);
    }

    public boolean isDisplayedName() {
        return driver.findElement(NAME_LOCATOR).
                getText().contains(inputNameLabel);
    }

    public boolean isDisplayedGender() {
        return driver.findElement(GENDER_LOCATOR).
                getText().contains(inputGenderLabel);
    }

    public boolean isDisplayedButtonForm() {
        return driver.findElement(BUTTON_FORM_LOCATOR).
                getAttribute("value").contains(buttonForm);
    }

    public String getInputSurnameLabel() {
        return driver.findElement(INPUT_SURNAME_LOCATOR).getAttribute("value");
    }

    public void setInputSurnameLabel(String surname) {
        driver.findElement(INPUT_SURNAME_LOCATOR).sendKeys(surname);
    }

    public String getInputNameLabel() {
        return driver.findElement(INPUT_NAME_LOCATOR).getAttribute("value");
    }

    public void setInputNameLabel(String name) {
        driver.findElement(INPUT_NAME_LOCATOR).sendKeys(name);
    }

    public void setRadioGenderM() {
        driver.findElement(RADIO_GENDER_M_LOCATOR).click();
    }

    public boolean isDisplayedGenderM() {
        return driver.findElement(RADIO_GENDER_M_LOCATOR).isSelected();
    }
}
