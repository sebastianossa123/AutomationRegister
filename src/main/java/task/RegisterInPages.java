package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ObjectsRegisterPages.*;

public class RegisterInPages implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_TITLE)

        );

    }

    public static RegisterInPages objectsRegister(){
        return instrumented(RegisterInPages.class);
    }
}
