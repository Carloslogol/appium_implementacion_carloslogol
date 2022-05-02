package co.carloslogol.test_app.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApplicationLoginpage {

    public static final Target BOTON_LOGIN = Target.the("Boton de login")
            .located(By.id("com.example.buildproject:id/btn_submit"));

    public static final Target TEXTO_LOGIN = Target.the("Texto de login")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView"));

    public static final Target CAMPO_TEXTO_USUARIO = Target.the("Campo para digitar usuario")
            .located(By.id("com.example.buildproject:id/et_user_name"));

    public static final Target CAMPO_TEXTO_CONTRASENA = Target.the("Campo para digitar la contraseña")
            .located(By.id("com.example.buildproject:id/et_password"));
}
