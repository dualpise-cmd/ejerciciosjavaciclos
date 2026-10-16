import java.util.Scanner;

public class EjercicioAsesores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración e inicialización de variables
        int idAsesor = 0;
        String nombreCliente;
        int tipoPaquete = 0; // 1 = Playa, 2 = Ciudad, 3 = Montaña, 4 = Crucero
        int canTiquetesVend = 0;
        double precioTiquete = 0;

        int cantAsesorPlaya = 0; // +30 tiquetes
        int idAsesorCiudad = 0; // Asesor de ciudad que vendió más
        double mayorVentaCiudad = 0;

        double ventaTotalMontana = 0;
        int cantAsesoresMontana = 0;

        int cantTiquetesCrucero = 0;
        int cantAsesoresCrucero = 0;
        double promTiquetesCruceros = 0;

        double dineroRecolectado = 0;
        double totalDineroRecolec = 0;
        int n = 0;

        System.out.print("Ingrese cantidad de asesores a procesar: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Procesando Asesor " + i + " de " + n + " ---");
            System.out.print("Ingrese la identificacion del asesor: ");
            idAsesor = scanner.nextInt();
            scanner.nextLine(); // Limpiar el búfer del teclado

            System.out.print("Ingrese nombre del cliente: ");
            nombreCliente = scanner.nextLine();

            System.out.print("Tipo de paquete vendido (1 = Playa, 2 = Ciudad, 3 = Montaña, 4 = Crucero): ");
            tipoPaquete = scanner.nextInt();

            System.out.print("Cantidad de tiquetes vendidos: ");
            canTiquetesVend = scanner.nextInt();

            System.out.print("Valor de cada tiquete: ");
            precioTiquete = scanner.nextDouble();

            dineroRecolectado = canTiquetesVend * precioTiquete;
            totalDineroRecolec= totalDineroRecolec + dineroRecolectado;

            switch (tipoPaquete) {
                case 1: // Playa
                    if (canTiquetesVend > 30) {
                        cantAsesorPlaya = cantAsesorPlaya + 1;
                    }
                    break;

                case 2: // Ciudad
                    if (dineroRecolectado > mayorVentaCiudad) {
                        idAsesorCiudad = idAsesor;
                        mayorVentaCiudad = dineroRecolectado;
                    }
                    break;

                case 3: // Montaña
                    ventaTotalMontana= ventaTotalMontana + dineroRecolectado;
                    cantAsesoresMontana = cantAsesoresMontana + 1;
                    break;

                case 4: // Crucero
                    cantTiquetesCrucero= cantTiquetesCrucero + canTiquetesVend;
                    cantAsesoresCrucero= cantAsesoresCrucero + 1;
                    break;

                default:
                    System.out.println("Error en tipo de paquete ingresado.");
                    break;
            }
        }

        // Reportes finales de salida
        System.out.println("\n================ REPORTES FINALES ================");
        System.out.println("A: Asesores de Playa con más de 30 tiquetes: " + cantAsesorPlaya);
        System.out.println("B: ID del asesor de Ciudad con mayor recaudo: " + idAsesorCiudad);
        System.out.println("   Valor total de su venta: $" + mayorVentaCiudad);
        System.out.println("C: Dinero total recolectado en Montaña: $" + ventaTotalMontana);
        System.out.println("   Cantidad de asesores en Montaña: " + cantAsesoresMontana);

        // Validación para evitar división por cero
        if (cantAsesoresCrucero > 0) {
            promTiquetesCruceros =cantTiquetesCrucero / cantAsesoresCrucero;
            System.out.println("D: Promedio de tiquetes vendidos en Cruceros: " + promTiquetesCruceros);
        } else {
            System.out.println("D: Promedio de tiquetes vendidos en Cruceros: 0 (No hubo ventas)");
        }

        System.out.println("E: Total general recolectado por la agencia: $" + totalDineroRecolec);
        System.out.println("   Total de asesores procesados: " + n);

        scanner.close();
    }
}
