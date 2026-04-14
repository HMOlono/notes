public class EncapsulationPractice {
  // Encapsulation
  private String marca;
  private int capacidad;

  // Constructor
  public EncapsulationPractice(String marcaEnviada, int capacidadEnviada) {
    this.marca = marcaEnviada;
    this.capacidad = capacidadEnviada;
  }

  // Getter (read)
  public String getMarca() {
    return marca;
  }

  // Setter (write) with simple validation
  public void setCapacidad(int newCapacidad) {
    if (newCapacidad > 0) {
      this.capacidad = newCapacidad;
    }
  }

  // Setter for capacidad
  public int getCapacidad() {
    return capacidad;
  }

  public static void main(String[] args) {
    EncapsulationPractice myPhone = new EncapsulationPractice("Samsung", 128); // Object
    System.out.println("La marca es:" + myPhone.getMarca());
    myPhone.setCapacidad(-50);
    System.out.println("Capacidad despues de error: " + myPhone.getCapacidad());
    myPhone.setCapacidad(100);
    System.out.println("Nueva capacidad: " + myPhone.getCapacidad());
  }
}
