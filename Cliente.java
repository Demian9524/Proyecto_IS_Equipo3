import java.util.List;

public class Cliente extends Usuario {
  private String RFC;
  private String codigoPostal;
  private List<Factura> facturas;
  private List<Pedido> pedidos;

  public Cliente(int idUsuario, String nombre, String correo, String password, String RFC, String codigoPostal) {
    super(idUsuario, nombre, correo, password);
    this.RFC = RFC;
    this.codigoPostal = codigoPostal;
    this.facturas = NULL;
    this.pedidos = NULL;
  }

  public void consultarPerfil() {
    System.out.println("Perfil de cliente: "+ getNombre() + " - RFC: " + RFC);
    // Falta agregar lógica
  }

  public void HistorialCompras() {
    System.out.println(getNombre() + " ha confirmado un pedido.");
    // Falta agregar lógica
  }

  public String getRFC() { return RFC; }
  public void setRFC(String RFC) { this.RFC = RFC; }

  public String getCodigoPostal() { return codigoPostal; }
  public void setCodigoPostal(String codigoPostal) { this.codigoPostal = codigoPostal; }

  public List<Factura> getFacturas() { return facturas; }
  public void setFacturas(List<Factura> facturas) { this.facturas = facturas; }

  public List<Pedido> getPedidos() { return pedidos; }
  public void setPedidos(List<Pedido> pedidos) { this.pedidos = pedidos; }
}
