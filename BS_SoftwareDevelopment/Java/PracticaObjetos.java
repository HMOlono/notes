public class PracticaObjetos { // Clase/Molde
  // Atributos
  String marca;
  String almacenamiento;

  // Constructor
  public PracticaObjetos(String marcaEnviada, String almacenamientoEnviado) {
    marca = marcaEnviada;
    almacenamiento = almacenamientoEnviado;
  }

  // El Metodo/Funcion
  void encender() {
    System.out.println("El celular " + marca + " de " + almacenamiento + " se ha encendido");
  }

  // El main
  public static void main(String[] args) {
    PracticaObjetos celularAmigo = new PracticaObjetos("Iphone", "128gb");
    PracticaObjetos miCelular = new PracticaObjetos("Samsung", "64GB");
    miCelular.encender();
    celularAmigo.encender();
  }
}
