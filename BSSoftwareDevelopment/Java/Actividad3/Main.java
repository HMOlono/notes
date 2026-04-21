import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Producto p1 = new Producto();
    Producto p2 = new Producto();

    System.out.println("--- Registro de Producto 1 ---");
    llenarDatos(p1, sc);
    System.out.println("\n--- Registro de Producto 2 ---");
    llenarDatos(p2, sc);

    System.out.println("\nDatos Producto 1:");
    p1.muestraProducto();
    System.out.println("\nDatos Producto 2:");
    p2.muestraProducto();

    System.out.print("\nIngrese el % de utilidad para comparar: ");
    double util = sc.nextDouble();

    String mayor = compararProductos(p1, p2, util);
    System.out.println("\nEl producto con mayor precio de venta es: " + mayor);
  }

  public static void llenarDatos(Producto p, Scanner sc) {
    try {
      System.out.print("Descripción: ");
      p.setDescripcion(sc.next());
      System.out.print("Código: ");
      p.setCodigo(sc.next());
      System.out.print("Tipo: ");
      p.setTipo(sc.next());
      System.out.print("Costo: ");
      p.setCosto(sc.nextDouble());
      System.out.print("Impuesto (%): ");
      p.setImpuesto(sc.nextDouble());
    } catch (Exception e) {
      System.out.println("Error en la entrada de datos.");
      sc.nextLine();
    }
  }

  public static String compararProductos(Producto p1, Producto p2, double utilidad) {
    if (p1.calcularPrecio(utilidad) > p2.calcularPrecio(utilidad)) {
      return p1.getDescripcion();
    } else {
      return p2.getDescripcion();
    }
  }
}
