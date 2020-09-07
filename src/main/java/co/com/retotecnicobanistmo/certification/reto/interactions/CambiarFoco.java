package co.com.retotecnicobanistmo.certification.reto.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CambiarFoco implements Interaction {
  @Override
  public <T extends Actor> void performAs(T actor) {

    ArrayList<String> tabs =
        new ArrayList<String>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
    BrowseTheWeb.as(actor).getDriver().switchTo().window(tabs.get(1));

  }

  public static CambiarFoco Pestana() {
    return instrumented(CambiarFoco.class);
  }
}
