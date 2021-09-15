package co.com.choucair.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarCursoPagina extends PageObject {

    public static final Target BUTT_CC = Target.the(" Selecciona cursos y certificaciones ").located(By.xpath("//*[@id=\"certificaciones\"]/a/img"));
    public static final Target WRITE_WA = Target.the(" Buscar curso").located(By.id("coursesearchbox"));
    public static final Target IR = Target.the(" Confirmar la busqueda anterior ").located(By.xpath("//button[@class = 'btn btn-secondary']"));
    public static final Target SELECT_CURSO = Target.the("click para seleccionar el curso Workshop de Automatizacion").located(By.xpath("//*[@id=\"yui_3_17_2_1_1631654332701_296\"]"));

    public static final Target NAME_COURSE = Target.the("Extraer el nombre del curso").located(By.xpath("//*[@id=\"region-main\"]/div/div[1]/div/div[1]/h3/a"));
}
