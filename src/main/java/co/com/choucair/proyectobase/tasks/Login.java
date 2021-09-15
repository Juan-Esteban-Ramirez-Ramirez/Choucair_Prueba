package co.com.choucair.proyectobase.tasks;

import co.com.choucair.proyectobase.userinterface.PaginaMapeo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class Login implements Task {


    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }


    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaMapeo.INGRESAR),
                Enter.theValue(strUser).into(PaginaMapeo.IN_USER),
                Enter.theValue(strPassword).into(PaginaMapeo.IN_KEY),
                Click.on(PaginaMapeo.ACCEDER)

        );

    }
}
