import java.util.Scanner;

public class CineExpres {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declaración de variables
        double precioBase = 35000;
        double precioEntrada = 0;
        double precioCombo = 0;
        double totalPagar = 0;
        double promedio = 0;
        double descuentoAplicado = 0;
        double porcentaje1 = 0.50;
        double porcentaje2 = 0.20;
        int codigoCombo;
        String esEstudiante;
        
        // Parte 1: Cálculo de la Entrada
        System.out.print("¿El cliente es estudiante? (SI/NO): ");
        esEstudiante = leer.nextLine();
        
        if (esEstudiante.equalsIgnoreCase("SI")) {
            System.out.print("Ingrese el promedio académico: ");
            promedio = leer.nextDouble();
            
            // Condicional Anidado
            if (promedio >= 3.8) {
                descuentoAplicado = precioBase * porcentaje1;
            } else {
                descuentoAplicado = precioBase * porcentaje2;
            }
            
            precioEntrada = precioBase - descuentoAplicado;
        } else {
            // Si escribe NO, no hay descuento
            precioEntrada = precioBase;
        }
        
        // Parte 2: Selección del Combo
        System.out.print("Seleccione el combo (1: Individual, 2: Pareja, 3: Infantil, Otro: Ninguno): ");
        codigoCombo = leer.nextInt();
        
        // Condicional
        if (codigoCombo == 1) {
            precioCombo = 15000;
        } else if (codigoCombo == 2) {
            precioCombo = 20000;
        } else if (codigoCombo == 3) {
            precioCombo = 25000;
        } else {
            precioCombo = 0;
        }
        
        // proceso calculo total
        totalPagar = precioEntrada + precioCombo;
        
        // Salida de Datos
        System.out.println("--- VALOR ENTRADA ---");
        System.out.println("Costo entrada sin descuento: $" + precioBase);
        System.out.println("Descuento aplicado: $" + descuentoAplicado);
        System.out.println("Costo total entrada: $" + precioEntrada);
        System.out.println("Costo del combo seleccionado: $" + precioCombo);
        System.out.println("Monto Total a Pagar: $" + totalPagar);
        
      
        leer.close();
    }
}