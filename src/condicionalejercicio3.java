import java.util.Scanner;

public class condicionalejercicio3 {
  /**
   * @param args
   */
  public static void main(String[] args) {

    // declaracion de variables
    Scanner leer = new Scanner(System.in);
    String placa1, placa2;
    int numpasajeros1, numpasajeros2;
    float vlrpasajebus1, valorpasajebus2, totalbus1=0, totalbus2=0;

    // entrada de los datos
    System.out.println("ingrese placa del bus 1:");
    placa1 = leer.nextLine();

    System.out.println("ingrese numero de pasajeros bus 1:");
    numpasajeros1 = leer.nextInt();
    leer.nextLine(); // consumir el salto de linea

     System.out.println("ingrese valor pasaje bus 1:");
    vlrpasajebus1 = leer.nextFloat();
    leer.nextLine(); // consumir el salto de linea

    System.out.println("ingrese placa del bus 2:");
    placa2 = leer.nextLine();

    System.out.println("ingrese numero de pasajeros bus 2:");
    numpasajeros2 = leer.nextInt();
    leer.nextLine(); // consumir el salto de linea

     System.out.println("ingrese valor pasaje bus 2:");
    valorpasajebus2= leer.nextFloat();
    leer.nextLine(); // consumir el salto de linea

    //proceso
    totalbus1 = numpasajeros1 * vlrpasajebus1;
    totalbus2 = numpasajeros2 * valorpasajebus2;

    // condicional y salida
    if (totalbus1 > totalbus2 ) {
      System.out.println("el carro con placas " + placa1 + " recaudo mas dinero=" + totalbus1);
    } else {
      System.out.println("el carro con placas " + placa2 + " recaudo mas dinero=" + totalbus2);
    }

    leer.close();
  }
}
