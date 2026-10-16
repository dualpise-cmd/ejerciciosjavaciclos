import java.util.Scanner;

public class CONDICIONALEJERCICIO1 {
  /**
   * @param args
   */
  public static void main(String[] args) {

    // declaracion de variables
    Scanner leer = new Scanner(System.in);
    String nombre1, nombre2;
    int edad1, edad2;

    // entrada de los datos
    System.out.println("ingrese el nombre primer hermano:");
    nombre1 = leer.nextLine();

    System.out.println("ingrese edad del primer hermano:");
    edad1 = leer.nextInt();
    leer.nextLine(); // consumir el salto de linea

    System.out.println("ingrese el nombre del segundo hermano:");
    nombre2 = leer.nextLine();

    System.out.println("ingrese la edad del segundo hermano:");
    edad2 = leer.nextInt();

    // proceso y salida
    if (edad1 > edad2) {
      System.out.println("el hermano mayor es " + nombre1);
    } else {
      System.out.println("el hermano mayor es " + nombre2);
    }

    leer.close();
  }
}
