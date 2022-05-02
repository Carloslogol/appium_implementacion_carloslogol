package co.carloslogol.test_app.tasks;

import co.carloslogol.test_app.model.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.carloslogol.test_app.userinterface.ApplicationLoginpage.CAMPO_TEXTO_CONTRASENA;
import static co.carloslogol.test_app.userinterface.ApplicationLoginpage.CAMPO_TEXTO_USUARIO;

public class Login implements Task {
    private List<Usuario> usuarios;

    public Login(List<Usuario> usuarios) { this.usuarios = usuarios; }

    public static Login with(List<Usuario> usuarios) {
        return Tasks.instrumented(Login.class, usuarios);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuarios.get(0).getUsuario()).into(CAMPO_TEXTO_USUARIO),
                Enter.theValue(usuarios.get(0).getContrasena()).into(CAMPO_TEXTO_CONTRASENA)
        );
    }
}
