package step_defenitions;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import org.openqa.selenium.By;
import java.io.File;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AboutUsStepsDef {

    private static final By FORM = By.cssSelector("h3.el-title.uk-card-title");
    private static final By NAME = By.id("firstName");
    private static final By SURNAME = By.id("lastName");
    private static final By EMAIL = By.id("userEmail");
    private static final By DIFFERENT_CHECKBOX = By.xpath("//div[@class=\"custom-control custom-checkbox custom-control-inline\"]");
    private static final By CHECKBOX_BUTTON = By.xpath(".//input[@type=\"checkbox\"]");
    private static final By NOT_IMPORTANT = By.xpath("//input[@value=\"Хочу кошку\"]");
    private static final By TELEPHONE = By.id("userNumber");
    private static final By DATE = By.id("date");
    private static final By PASSPORT = By.id("загрузите картинку");
    private static final By ADDRESS = By.id("currentAddress");
    private static final By SUBMIT_BUTTON = By.id("submit");
    private static final By ASSERT_TEXT = By.xpath("//div[@class=\"form-file\"]");


    @И("^вводим имя заказчика$")
    public void writeFirstName() {
        $(FORM).scrollTo();
        $(NAME).sendKeys("Валерия");
    }

    @И("^вводим фамилию заказчика$")
    public void writeLastName() {
        $(SURNAME).sendKeys("Клюкина");
    }

    @И("^вводим email заказчика$")
    public void writeEMail() {
        $(EMAIL).sendKeys("test@mail.ru");
    }


    @И("^выбираем желаемый пол щенка Не важно$")
    public void selectSex() {
      $(NOT_IMPORTANT).click();
    }


    @И("^вводим телефон$")
    public void writeTelephone() {
        $(TELEPHONE).sendKeys("89999999999");
    }

    @И("^вводим дату, когда хотим забрать$")
    public void writeDate() {
        $(DATE).sendKeys("16 Apr 2023");
    }

    @И("^выбираем размер собаки, которую планируем купить \"(.*)\"$")
    public void selectSize(String sizeName){
        SelenideElement size = $$(DIFFERENT_CHECKBOX).findBy(text(sizeName));
        size.$(CHECKBOX_BUTTON).click();
    }

    @И("^выбираем язык, на котором должна говорить собака \"(.*)\"$")
    public void selectLanguage(String languageName){
        SelenideElement language = $$(DIFFERENT_CHECKBOX).findBy(text(languageName));
        language.$(CHECKBOX_BUTTON).click();
    }


    @И("^прикладываем фото паспорта$")
    public void uploadPhoto() {
        File cv = new File("src/main/resources/паспорт.jpeg");
        $(PASSPORT).uploadFile(cv);
    }

    @И("^вводим адрес прописки$")
    public void writeAddress() {
        $(ADDRESS).sendKeys("Москва, ул. Московская, д.1, кв. 1");
    }

    @И("^подтверждаем отправку$")
    public void confirmSending() {
        $(SUBMIT_BUTTON).click();
      //  $(ASSERT_TEXT).shouldHave(text("паспорт.jpeg"));

    }


}
