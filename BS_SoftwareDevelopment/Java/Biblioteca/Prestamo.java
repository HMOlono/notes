public class Prestamo {
  public void realizarOperacion(Usuario user, Libro book) {
    System.out.println("-- Iniciando tramite de prestamo --");
    if (user.puedePedirPrestado() && book.prestar()) {
      user.tomarLibro();

      System.out.println("El usuario " + user.getNombre() + " ha retirado el libro: " + book.getTitulo());
    } else {
      System.out.println(" ERROR: No se puede realizar el prestamo.");
    }
  }
}
