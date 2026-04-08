// connects the Child to the Parent "extends"
public class Smartphone extends EncapsulationPractice {
  private String operatingSystem;

  // The Constructor
  public Smartphone(String marca, int capacidad, String os) {
    super(marca, capacidad);
    this.operatingSystem = os;
  }

  // The method
  public void displayFullSpecs() {
    System.out.println("Brand: " + getMarca() + " OS: " + operatingSystem);
  }

  // Main
  public static void main(String[] args) {
    Smartphone mySmartPhone = new Smartphone("Samsung", 512, "Android 14");

    mySmartPhone.displayFullSpecs();
  }
}
