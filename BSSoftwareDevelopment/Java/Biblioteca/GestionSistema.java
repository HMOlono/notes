public class GestionSistema {
  public static void main(String[] args) {
    Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central Universitaria");

    // (Nota: el usuario empieza con 0 libros prestados)
    Libro libro1 = new Libro("Clean Code", "Robert C. Martin", 1);
    Usuario user1 = new Usuario("TuNombre", 0);

    miBiblioteca.registrarLibro();
    miBiblioteca.registrarUsuario();

    // Gestor de Prestamos
    Prestamo gestor = new Prestamo();

    // Intento 1: Debe funcionar
    gestor.realizarOperacion(user1, libro1);
    miBiblioteca.anotarPrestamo();

    // Intento 2: Debe FALLAR porque el libro ya no tiene stock (ejemplares = 0)
    System.out.println("\n> Intento de préstamo 2 (Mismo libro sin stock):");
    gestor.realizarOperacion(user1, libro1);

    // Reporte Final
    miBiblioteca.mostrarEstado();
  }
}
