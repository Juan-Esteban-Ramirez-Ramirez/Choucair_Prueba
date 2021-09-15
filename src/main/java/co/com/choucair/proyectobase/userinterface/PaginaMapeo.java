package co.com.choucair.proyectobase.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://operacion.choucairtesting.com/academy/my/")
public class PaginaMapeo extends PageObject {

    public static final Target INGRESAR = Target.the(" Boton para ingresar al Login ").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target IN_USER = Target.the(" ingresar usuario ").located(By.id("username"));
    public static final Target IN_KEY = Target.the(" ingresar contraseña ").located(By.id("password"));
    public static final Target ACCEDER = Target.the(" confirmar Login ").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));






}
