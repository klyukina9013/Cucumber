package step_defenitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$$;

public class CatalogStepsDef {

    private static final By DETAILS = By.xpath(".//a[@class=\"btn button_detail\"]");
    private static final By PRODUCTS_NAME = By.xpath("//div[contains(@class,'productitem')]/div[@class='name']/a");

    @И("^выбираем \"(.*)\" и нажимаем Подробнее$")
    public void selectProduct(String productName) {
        SelenideElement product = $$(PRODUCTS_NAME).findBy(Condition.text(productName)).parent().parent();
        product.$(DETAILS).click();
    }
}
