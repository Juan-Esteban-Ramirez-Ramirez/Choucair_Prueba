package co.com.choucair.proyectobase.tasks;

import co.com.choucair.proyectobase.userinterface.PaginaMapeo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private PaginaMapeo paginaMapeo;

    public static Abrir pagina() {
        return Tasks.instrumented(Abrir.class);

    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(paginaMapeo));

    }
}
