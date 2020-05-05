package interfaceusuario;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject {

    public static final Target BOTON_APLICACIONES = Target.the("el boton muestra apps").located(By.id("gbwa"));
    public static final Target BOTON_GOOGLETRASLATE = Target.the("el boton de google traslate").located(By.xpath("//a[@data-pid='51']"));

}
