package step_defenitions;

import io.cucumber.java.bg.И;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class PodсastStepsDef {

    private static final By WISHLIST = By.xpath("//input[@value=\"В список пожеланий\"]");

    @И("^добавляем Выпуск подкаста В список пожеланий$")
    public void podkastGoToWishlist() {
        $(WISHLIST).click();
    }
}
