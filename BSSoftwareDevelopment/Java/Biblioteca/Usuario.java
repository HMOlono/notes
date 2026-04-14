public class Usuario {
  private String nombre;
  private int librosPrestados;

  // Constructor
  public Usuario(String nombre, int librosPrestados) {
    this.nombre = nombre;
    this.librosPrestados = librosPrestados;
  }

  // Getter
  public String getNombre() {
    return nombre;
  }

  // Metodo (puedePedirPrestado)
  public boolean puedePedirPrestado() {
    if (this.librosPrestados >= 2) {
      return false;
    }
    return true;
  }

  // Metodo tomar libro
  public void tomarLibro() {
    this.librosPrestados++;
  }
}
