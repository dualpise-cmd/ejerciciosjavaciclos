import java.util.Scanner;

public class cineexpresconciclon {
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
        int i;
        int numeroClientes;
        double ventatotalentradassindcto = 0;
        double descuentoacumulado = 0;
        double totalentradasacumulado = 0;
        int cantcombo1 = 0;
        int cantcombo2 = 0;
        int cantcombo3 = 0;
        int cantcomboNO = 0;
        double totalvendidocombo1 = 0;
        double totalvendidocombo2 = 0;  
        double totalvendidocombo3 = 0;
        double ventatotalcombos = 0;
        double ventatotalacumulada = 0;
        int cantestudiantes = 0;
        int cantnoesestudiante = 0;             


        System.out.print("Ingrese el número de clientes: ");
        numeroClientes = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea

        for (i = 1; i <= numeroClientes; i++) {
            System.out.println("\n--- CLIENTE " + i + " ---");
            
            // Reiniciar variables para cada cliente
            precioEntrada = 0;
            precioCombo = 0;
            totalPagar = 0;
            descuentoAplicado = 0;

        // Parte 1: Cálculo de la Entrada
        System.out.print("¿El cliente es estudiante? (SI/NO): ");
        esEstudiante = leer.next();
        leer.nextLine(); // Consumir el salto de línea
        
        if (esEstudiante.equalsIgnoreCase("SI")) {
            System.out.print("Ingrese el promedio académico: ");
            cantestudiantes=cantestudiantes+1;
            promedio = leer.nextDouble();
            leer.nextLine(); // Consumir el salto de línea

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
            cantnoesestudiante= cantnoesestudiante+1;
        }
        
        // Parte 2: Selección del Combo
        System.out.print("Seleccione el combo (1: Individual, 2: Pareja, 3: Infantil, Otro: Ninguno): ");
        codigoCombo = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea
        
        // Condicional
        switch (codigoCombo) {
        case 1:
            precioCombo = 15000;
            totalvendidocombo1 = totalvendidocombo1 + precioCombo;
            cantcombo1 = cantcombo1 + 1;
            break;  
        case 2:
            precioCombo = 20000;
            totalvendidocombo2 = totalvendidocombo2 + precioCombo;
            cantcombo2 = cantcombo2 + 1;
            break;
        case 3:
            precioCombo = 25000;
            totalvendidocombo3 = totalvendidocombo3 + precioCombo;
            cantcombo3 = cantcombo3 + 1;
            break;
        default:
            precioCombo = 0;
            cantcomboNO = cantcomboNO + 1;
            break;
        }

         // proceso calculo total por
        totalPagar = precioEntrada + precioCombo;

           // Salida de Datos
        System.out.println("--- VALOR ENTRADA INDIVIDUAL ---");
        System.out.println("Costo entrada sin descuento: $" + precioBase);
        System.out.println("Descuento aplicado: $" + descuentoAplicado);
        System.out.println("Costo total entrada: $" + precioEntrada);
        System.out.println("Costo del combo seleccionado: $" + precioCombo);
        System.out.println("Monto Total a Pagar: $" + totalPagar);

        // Acumulación de ventas calculos totales dentro del ciclo
        ventatotalentradassindcto= ventatotalentradassindcto + precioBase;
        descuentoacumulado= descuentoacumulado + descuentoAplicado;
        totalentradasacumulado= totalentradasacumulado+precioEntrada;

    }
      // Acumulación de ventas calculos totales fuera del ciclo
        ventatotalcombos =totalvendidocombo1 +totalvendidocombo2 +totalvendidocombo3;
		ventatotalacumulada= ventatotalcombos + totalentradasacumulado;
    
           // Salida de Datos
        System.out.println("--- VENTAS ACUMULADAS ---");
        System.out.println("venta total de las entradas sin descuento: $"  + ventatotalentradassindcto);
        System.out.println("Descuento total aplicado: $" + descuentoacumulado);
        System.out.println("Venta total entradas: $" + totalentradasacumulado);
        System.out.println("Cantidad de estudiantes: " + cantestudiantes);
        System.out.println("Cantidad de no estudiantes: " + cantnoesestudiante);
        System.out.println("Cantidad de clientes totales: " + numeroClientes);
        System.out.println("Cantidad de combos 1 vendidos: " + cantcombo1);
        System.out.println("Total vendido combos 1: $" + totalvendidocombo1);
        System.out.println("Cantidad de combos 2 vendidos: " + cantcombo2);
        System.out.println("Total vendido combos 2: $" + totalvendidocombo2);
        System.out.println("Cantidad de combos 3 vendidos: " + cantcombo3);
        System.out.println("Total vendido combos 3: $" + totalvendidocombo3);
        System.out.println("Cantidad de combos no vendidos: " + cantcomboNO);
        System.out.println("Venta total de combos: $" + ventatotalcombos);
        System.out.println("Venta total acumulada: $" + ventatotalacumulada);
        
        leer.close();
    }
}