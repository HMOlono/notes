public class Main {
  public static void main(String[] args) {
    // 1. Instanciar Materias
    Materia m1 = new Materia("Java Development", "JD01", 10, 6);
    Materia m2 = new Materia("Sistemas Operativos", "SO01", 8, 4);
    Materia m3 = new Materia("Bases de Datos", "BD01", 9, 5);

    // 2. Crear Curso (Composición)
    Curso curso = new Curso("BS Software Development", m1, m2, m3);

    // 3. Crear Alumno e inscribirlo al curso
    Alumno alumno = new Alumno("2026-JAVA", "Estudiante Tech", 22, curso);

    // 4. Crear Profesor (Agregación: el profesor recibe una materia)
    Profesor profe = new Profesor("Dr. Martinez", "NOM-99", 200.0, m1);

    // 5. Mostrar resultados
    System.out.println("--- Reporte de Control Escolar ---");
    System.out.println("Alumno: " + alumno.getNombre());
    System.out.println("Inscrito en: " + alumno.getCursoInscrito().getNombre());
    System.out.println("Créditos totales del curso: " + curso.calcularTotalCreditos());
    System.out.println("Profesor: " + profe.getNombre());
    System.out.println("Sueldo Semanal del Profesor: $" + profe.calcularSueldoSemanal());
  }
}
