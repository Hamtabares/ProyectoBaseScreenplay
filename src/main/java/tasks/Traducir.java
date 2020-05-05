package tasks;


import interfaceusuario.GoogleHomePage;
import interfaceusuario.GoogleTraductorPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

public class Traducir implements Task {
    private String palabra;

    public Traducir(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(GoogleHomePage.BOTON_APLICACIONES));
        actor.attemptsTo(Switch.toFrame(0));
        actor.attemptsTo(Click.on(GoogleHomePage.BOTON_GOOGLETRASLATE));

        actor.attemptsTo(Click.on(GoogleTraductorPage.BOTON_MAS_ORIGEN));
        actor.attemptsTo(Click.on(GoogleTraductorPage.LBL_INGLES));
        actor.attemptsTo(Click.on(GoogleTraductorPage.BOTON_MAS_DESTINO));
        actor.attemptsTo(Click.on(GoogleTraductorPage.LBL_ESPANOL));

        actor.attemptsTo(Enter.theValue(palabra).into(GoogleTraductorPage.INPUT_MSJ));

    }

    public static Traducir DeInglesAEspanolLa (String palabra){

        return Tasks.instrumented(Traducir.class, palabra);
    }
}
