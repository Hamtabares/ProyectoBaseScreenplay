package questions;

import interfaceusuario.GoogleTraductorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(GoogleTraductorPage.GET_MSJ).viewedBy(actor).asString();
    }




    public static Question es() {
        return  new LaRespuesta();
    }


}
