public class Materia {
  private String nombre;
  private String clave;
  private int creditos;
  private int horasSemanales;

  // Constructor por defecto
  public Materia() {
  }

  // Constructor con parámetros
  public Materia(String nombre, String clave, int creditos, int horasSemanales) {
    this.nombre = nombre;
    this.clave = clave;
    this.creditos = creditos;
    this.horasSemanales = horasSemanales;
  }

  // Constructor de copia
  public Materia(Materia otra) {
    this.nombre = otra.nombre;
    this.clave = otra.clave;
    this.creditos = otra.creditos;
    this.horasSemanales = otra.horasSemanales;
  }

  // Getters y Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  public int getCreditos() {
    return creditos;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }

  public int getHorasSemanales() {
    return horasSemanales;
  }

  public void setHorasSemanales(int horasSemanales) {
    this.horasSemanales = horasSemanales;
  }
}
