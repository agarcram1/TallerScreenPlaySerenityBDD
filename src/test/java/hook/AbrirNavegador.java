package hook;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {

    private String url;

    public AbrirNavegador(String url) {
        this.url = url;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    public static AbrirNavegador en(String url) {
        return Tasks.instrumented(AbrirNavegador.class, url);
    }
}
