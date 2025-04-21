public abstract class Usuario {
  private int idUsuario;
  private String nombre;
  private String correo;
  private String password;

  public abstract iniciarSesion();
  public abstract cerrarSesion();
}
