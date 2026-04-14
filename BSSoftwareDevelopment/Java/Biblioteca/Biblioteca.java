public class Biblioteca {
  private String nombre;
  private int totalLibrosRegistrados = 0;
  private int totalUsuariosRegistrados = 0;
  private int prestamosExitosos = 0;

  public Biblioteca(String nombre) {
    this.nombre = nombre;
  }

  // Reporte del estado
  public void mostrarEstado() {
    System.out.println("\n=== REPORTE DE LA BIBLIOTECA: " + nombre + " ===");
    System.out.println("Libros en sistema: " + totalLibrosRegistrados);
    System.out.println("Usuarios activos: " + totalUsuariosRegistrados);
    System.out.println("Préstamos realizados: " + prestamosExitosos);
    System.out.println("==========================================\n");
  }

  // Métodos (Simulación de registro)
  public void registrarLibro() {
    totalLibrosRegistrados++;
  }

  public void registrarUsuario() {
    totalUsuariosRegistrados++;
  }

  public void anotarPrestamo() {
    prestamosExitosos++;
  }
}
