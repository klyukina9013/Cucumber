package step_defenitions;

import io.cucumber.java.ru.И;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class AddressCheckoutStepsDef {
    private static final By NAME_FIELD = By.xpath("//input[@name='f_name']");
    private static final By LAST_NAME = By.xpath("//input[@name='l_name']");
    private static final By EMAIL = By.xpath("//input[@id='email']");
    private static final By STREET = By.xpath("//input[@name='street']");
    private static final By POST_CODE = By.xpath("//input[@id='zip']");
    private static final By CITY = By.xpath("//input[@name='city']");
    private static final By REGION = By.xpath("//input[@name='state']");
    private static final By BUTTON_COUNTRY = By.xpath("//select[@name='country']");
    private static final By RUSSIA = By.xpath("//select[@name=\"country\"]/option[@value=\"176\"]");
    private static final By PHONE = By.xpath("//input[@name='phone']");
    private static final By NEXT_BUTTON = By.xpath("//input[@value='Далее']");

    @И("^заполняем форму заказа$")
    public void fillOutTheOrderForm() {
        $(NAME_FIELD).sendKeys("Тест");
        $(LAST_NAME).sendKeys("Тестов");
        $(EMAIL).sendKeys("test@test.ru");
        $(STREET).sendKeys("Московская, 1");
        $(POST_CODE).sendKeys("111111");
        $(CITY).sendKeys("Москва");
        $(REGION).sendKeys("Москва");
        $(BUTTON_COUNTRY).click();
        $(RUSSIA).scrollTo();
        $(RUSSIA).click();
        $(PHONE).sendKeys("9999999999");
        $(NEXT_BUTTON).click();
    }
}
