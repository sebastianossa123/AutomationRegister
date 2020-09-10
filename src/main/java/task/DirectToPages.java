package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DirectPages.*;

public class DirectToPages implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_BUTTON_SIGIN),
                Enter.theValue("sebastianossa159@gmail.com").into(INPUT_TEXT_EMAIL),
                Click.on(INPUT_BUTTON_CREATE)
        );


    }

    public static DirectToPages actionPages(){
        return instrumented(DirectToPages.class);
    }


}
