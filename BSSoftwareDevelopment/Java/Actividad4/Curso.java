public class Curso {
  private String nombre;
  private Materia[] materias = new Materia[3]; // Composición: 3 materias fijas

  public Curso() {
  }

  public Curso(String nombre, Materia m1, Materia m2, Materia m3) {
    this.nombre = nombre;
    this.materias[0] = m1;
    this.materias[1] = m2;
    this.materias[2] = m3;
  }

  public Curso(Curso otro) {
    this.nombre = otro.nombre;
    this.materias = otro.materias.clone();
  }

  // Método funcional requerido
  public int calcularTotalCreditos() {
    int total = 0;
    for (Materia m : materias) {
      if (m != null) {
        total += m.getCreditos();
      }
    }
    return total;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
