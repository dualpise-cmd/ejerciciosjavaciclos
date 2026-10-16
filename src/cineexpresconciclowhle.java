import java.util.Scanner;

public class cineexpresconciclowhle {
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
        int i=0;
        double ventatotalentradassindcto = 0;
        double descuentoacumulado = 0;
        double totalentradasacumulado = 0;
        int cantcombo1 = 0;
        int cantcombo2 = 0;
        int cantcombo3 = 0;
        int cantcomboNO = 0;
        double precioCombo1 = 15000;
        double precioCombo2 = 20000;
        double precioCombo3 = 25000;
        double totalvendidocombo1 = 0;
        double totalvendidocombo2 = 0;  
        double totalvendidocombo3 = 0;
        double ventatotalcombos = 0;
        double ventatotalacumulada = 0;
        int cantestudiantes = 0;
        int cantnoesestudiante = 0;
        String continuar = "SI"; 
        String agregarcombo = "SI";        

        // el cliclo while para el ingreso de clientes
        while (continuar.equalsIgnoreCase("SI")) {
            agregarcombo = "SI"; // Obliga a que el nuevo cliente entre al ciclo de combos
            precioEntrada = 0;
            precioCombo = 0;
            totalPagar = 0;
            descuentoAplicado = 0;
        // Parte 1: Cálculo de la Entrada
        System.out.print("¿El cliente es estudiante? (SI/NO): ");
        esEstudiante = leer.next();
        leer.nextLine(); // Consumir el salto de línea
        while (!esEstudiante.equalsIgnoreCase("SI") && !esEstudiante.equalsIgnoreCase("NO")) {
            System.out.print("Respuesta inválida. Ingrese 'SI' o 'NO': ");
            esEstudiante = leer.next();
            leer.nextLine(); // Consumir el salto de línea
        }
        
        if (esEstudiante.equalsIgnoreCase("SI")) {
            System.out.print("Ingrese el promedio académico valores (0.0 - 5.0): ");
            promedio = leer.nextDouble();
            leer.nextLine(); // Consumir el salto de línea
            cantestudiantes=cantestudiantes+1;
            while (promedio < 0.0 || promedio > 5.0) {
                System.out.print("Promedio inválido. Ingrese un promedio válido (0.0 - 5.0): ");
                promedio = leer.nextDouble();
                leer.nextLine(); // Consumir el salto de línea
            }

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
        // ciclo si desea agregar otro combo
        while (agregarcombo.equalsIgnoreCase("SI")) {

        // Parte 2: Selección del Combo
        System.out.print("Seleccione el combo (1: Individual, 2: Pareja, 3: Infantil, Otro: Ninguno): ");
        codigoCombo = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea
        
        // Condicional
        switch (codigoCombo) {
        case 1:
            precioCombo = precioCombo1;
            totalvendidocombo1 = totalvendidocombo1 + precioCombo;
            cantcombo1 = cantcombo1 + 1;
            break;  
        case 2:
            precioCombo = precioCombo2;
            totalvendidocombo2 = totalvendidocombo2 + precioCombo;
            cantcombo2 = cantcombo2 + 1;
            break;  
        case 3:
            precioCombo =precioCombo3;
            totalvendidocombo3 = totalvendidocombo3 + precioCombo;
            cantcombo3 = cantcombo3 + 1;
            break;
        default:
            precioCombo = 0;
            cantcomboNO = cantcomboNO + 1;
            break;
        
        }
        // Preguntar si desea agregar otro combo
        System.out.print("¿Desea agregar otro combo? (SI/NO): ");
        agregarcombo = leer.next();
        leer.nextLine(); // Consumir el salto de línea

          while(!(agregarcombo.equalsIgnoreCase("SI")) && !(agregarcombo.equalsIgnoreCase("NO"))) {
            System.out.print("Respuesta inválida. Ingrese 'SI' o 'NO': ");
            agregarcombo = leer.next();
            leer.nextLine(); // Consumir el salto de línea 
        }
         // proceso calculo total por
        totalPagar = precioEntrada + precioCombo;
      }

           // Salida de Datos
        System.out.println("--- VALOR ENTRADA INDIVIDUAL ---");
        System.out.println("Costo entrada sin descuento: $" + precioBase);
        System.out.println("Descuento aplicado: $" + descuentoAplicado);
        System.out.println("Costo total entrada: $" + precioEntrada);
        System.out.println("cantidad de combos 1 vendidos: " + cantcombo1);
        System.out.println("valor total vendido combos 1: $" + precioCombo1 * cantcombo1);
        System.out.println("cantidad de combos 2 vendidos: " + cantcombo2);
        System.out.println("valor total vendido combos 2: $" + precioCombo2 * cantcombo2);
        System.out.println("cantidad de combos 3 vendidos: " + cantcombo3);
        System.out.println("valor total vendido combos 3: $" + precioCombo3 * cantcombo3);
        System.out.println("Monto Total a Pagar: $" + totalPagar);

        // Acumulación de ventas calculos totales dentro del ciclo
        ventatotalentradassindcto= ventatotalentradassindcto + precioBase;
        descuentoacumulado= descuentoacumulado + descuentoAplicado;
        totalentradasacumulado= totalentradasacumulado+precioEntrada;

        // Preguntar si desea ingresar otro cliente
        System.out.print("¿Desea ingresar otro cliente? (SI/NO): ");
        continuar = leer.next();

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
        System.out.println("Cantidad de clientes totales: " + (cantestudiantes + cantnoesestudiante));
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