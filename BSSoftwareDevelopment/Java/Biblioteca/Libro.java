public class Libro {
  private String titulo;
  private String autor;
  private int ejemplares;

  // Constructor
  public Libro(String titulo, String autor, int ejemplares) {
    this.titulo = titulo;
    this.autor = autor;

    if (ejemplares >= 0) {
      this.ejemplares = ejemplares;
    } else {
      this.ejemplares = 0;
      System.out.println("Ejemplares invalidos");
    }
  }

  // Getters
  public String getTitulo() {
    return titulo;
  }

  public int getEjemplares() {
    return ejemplares;
  }

  // Metoto (prestar el libro)
  public boolean prestar() {
    if (this.ejemplares > 0) {
      this.ejemplares--; // Se reduce el stock
      return true;
    }
    return false; // No hay libros disponibles
  }

  // Metodo para devolver el libro
  public void devolver() {
    this.ejemplares++;
  }

}
