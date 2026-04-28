public class Profesor {
  private String nombre;
  private String numeroNomina;
  private double sueldoPorHora;
  private Materia materiaImpartida; // Un profesor solo puede impartir una materia

  public Profesor() {
  }

  public Profesor(String nombre, String numeroNomina, double sueldoPorHora, Materia materia) {
    this.nombre = nombre;
    this.numeroNomina = numeroNomina;
    this.sueldoPorHora = sueldoPorHora;
    this.materiaImpartida = materia;
  }

  public Profesor(Profesor otro) {
    this.nombre = otro.nombre;
    this.numeroNomina = otro.numeroNomina;
    this.sueldoPorHora = otro.sueldoPorHora;
    this.materiaImpartida = otro.materiaImpartida;
  }

  // Método funcional: Sueldo semanal basado en horas de la materia
  public double calcularSueldoSemanal() {
    if (materiaImpartida != null) {
      return sueldoPorHora * materiaImpartida.getHorasSemanales();
    }
    return 0.0;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Materia getMateriaImpartida() {
    return materiaImpartida;
  }

  public void setMateriaImpartida(Materia m) {
    this.materiaImpartida = m;
  }
}
