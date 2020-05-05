package interfaceusuario;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTraductorPage {
    public static final Target BOTON_MAS_ORIGEN = Target.the("el boton de mas idionas").located(By.xpath("//div[@class='sl-more tlid-open-source-language-list']"));
    public static final Target LBL_INGLES = Target.the("sele idioma ingles").located(By.xpath("//div[@class='language_list_item_icon sl_list_en_checkmark']"));
    public static final Target BOTON_MAS_DESTINO = Target.the("el boton de mas idionas").located(By.xpath("//div[@class='tl-more tlid-open-target-language-list']"));
    public static final Target LBL_ESPANOL = Target.the("sele idioma ingles").located(By.xpath("//div[@class='language_list_item_icon tl_list_es_checkmark']"));
    public static final Target INPUT_MSJ = Target.the("ingresar palabra").located(By.id("source"));
    public static final Target GET_MSJ = Target.the("ingresar palabra").located(By.xpath("//div[@class='text-wrap tlid-copy-target']"));
}
