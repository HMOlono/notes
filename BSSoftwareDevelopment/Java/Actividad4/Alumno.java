public class Alumno {
  private String matricula;
  private String nombre;
  private int edad;
  private Curso cursoInscrito;

  public Alumno() {
  }

  public Alumno(String matricula, String nombre, int edad, Curso curso) {
    this.matricula = matricula;
    this.nombre = nombre;
    this.edad = edad;
    this.cursoInscrito = curso;
  }

  public Alumno(Alumno otro) {
    this.matricula = otro.matricula;
    this.nombre = otro.nombre;
    this.edad = otro.edad;
    this.cursoInscrito = otro.cursoInscrito;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Curso getCursoInscrito() {
    return cursoInscrito;
  }

  public void setCursoInscrito(Curso curso) {
    this.cursoInscrito = curso;
  }
}
