#languaje: es

  @UsuarioLoginApp
  Feature: : Logueo de usuario en aplicacion

    Como un usuario de internet
    Yo quiero loguearme dentro de la aplicacion
    Para hacer uso de ella

    @SuccessfulLogin
    Scenario: :  Validacion de acceso a la aplicacion
      Given que el usuario abre la aplicacion
      When el usuario digita su usuario y contrasena
        |  usuario     |   contrasena   |
        | carloslogol  |     123456     |
      Then deberia dejarlo ingresar