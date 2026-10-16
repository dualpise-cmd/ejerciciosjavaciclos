import java.util.Scanner;

public class condicionalejercicio5 {
  /**   
   * @param args
   */
    public static void main(String[] args) {
        // Declaración de variables
        Scanner leer = new Scanner(System.in);
        String tipoTrabajador, nombre;
        float horasTrabajadas;
        float valorHora, deducciones, bonificaciones, salarioNeto;
        
        // Primera pregunta clave
        System.out.println("Ingrese el tipo de trabajador (Escriba FIJO o TEMPORAL):");
        tipoTrabajador = leer.nextLine();
        
        // condicional para salario fijo
        if (tipoTrabajador.equalsIgnoreCase("FIJO")) {
            
            // Si es FIJO, le pedimos todos los datos completos
            System.out.println("Ingrese el nombre del trabajador:");
            nombre = leer.nextLine();
            
            System.out.println("Ingrese el número de horas trabajadas:");
            horasTrabajadas = leer.nextFloat();
            
            System.out.println("Ingrese el salario básico por hora:");
            valorHora = leer.nextFloat();
            
            System.out.println("Ingrese el total de deducciones:");
            deducciones = leer.nextFloat();
            
            System.out.println("Ingrese el total de bonificaciones:");
            bonificaciones = leer.nextFloat();
            
            // Proceso para salario fijo
            salarioNeto = (horasTrabajadas * valorHora) - deducciones + bonificaciones;
            
            // Salida
            System.out.println("El trabajador FIJO " + nombre + " tiene un salario neto de: $" + salarioNeto);

            } else if (tipoTrabajador.equalsIgnoreCase("TEMPORAL")) {
            
            // Si es TEMPORAL, solo le pedimos nombre y horas
            System.out.println("Ingrese el nombre del trabajador:");
            nombre = leer.nextLine();
            
            System.out.println("Ingrese el número de horas trabajadas:");
            horasTrabajadas = leer.nextFloat();
            
            // Proceso matemático para el temporal
            salarioNeto = horasTrabajadas * 6000;
            
            // Salida
           System.out.println("El trabajador TEMPORAL " + nombre + " tiene un salario neto de: $" + salarioNeto);
            
            } else {
            // si el usuario escribe mal la palabra
            System.out.println("Error: Tipo de trabajador incorrecto. Debe escribir FIJO o TEMPORAL.");
        }
        
        leer.close();
    }
}
