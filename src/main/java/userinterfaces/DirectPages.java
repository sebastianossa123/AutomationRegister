package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DirectPages extends PageObject {


             public static final Target INPUT_BUTTON_SIGIN = Target.the("INPUT BUTTON SIGNIN").located(By.className("login"));
             public static final Target INPUT_TEXT_EMAIL = Target.the("INPUT THE EMAIL").located(By.id("email_create"));
             public static final Target INPUT_BUTTON_CREATE = Target.the("INPUT BUTTON REGISTER").located(By.name("SubmitCreate"));
}
