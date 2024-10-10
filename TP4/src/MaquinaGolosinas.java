import java.util.Scanner;

public class MaquinaGolosinas {
    static double ventasTotales = 0;
    // Función para pedir una golosina
    public static void pedirGolosina(Scanner sc, String[][] golosinas) {
        System.out.print("Ingrese el número de la golosina que desea (0-11): ");
        int numero = sc.nextInt();
        if (numero < 0 || numero >= golosinas.length) {
            System.out.println("Número inválido.");
            return;
        }

        int cantidad = Integer.parseInt(golosinas[numero][2]);

        if (cantidad > 0) {
            int precio = Integer.parseInt(golosinas[numero][1]);
            golosinas[numero][2] = Integer.toString(cantidad - 1);
            ventasTotales += precio;
            System.out.println("Has comprado: " + golosinas[numero][0] + " por $" + precio);
        } else {
            System.out.println("Lo siento, la golosina " + golosinas[numero][0] + " está agotada.");
        }
    }

    // Función para mostrar todas las golosinas y su stock
    public static void mostrarGolosinas(String[][] golosinas) {
        System.out.println("\n--- Golosinas Disponibles ---");
        for (int i = 0; i < golosinas.length; i++) {
            System.out.println(i + ". " + golosinas[i][0] + " - Precio: $" + golosinas[i][1] + " - Cantidad: " + golosinas[i][2]);
        }
    }

    // Función para rellenar golosinas (solo para técnicos)
    public static void rellenarGolosinas(Scanner sc, String[][] golosinas) {
        System.out.print("Ingrese la contraseña: ");
        String contraseña = sc.next();

        if (contraseña.equals("AdminXYZ")) {
            System.out.print("Ingrese el número de la golosina a rellenar (0-11): ");
            int numero = sc.nextInt();

            if (numero < 0 || numero >= golosinas.length) {
                System.out.println("Número inválido.");
                return;
            }

            System.out.print("Ingrese la cantidad a recargar: ");
            int cantidadAgregar = sc.nextInt();

            int cantidadActual = Integer.parseInt(golosinas[numero][2]);
            golosinas[numero][2] = Integer.toString(cantidadActual + cantidadAgregar);
            System.out.println("Has recargado " + cantidadAgregar + " unidades de " + golosinas[numero][0]);
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }

    // Función para apagar la máquina y mostrar las ventas totales
    public static void apagarMaquina() {
        System.out.println("Apagando la máquina...");
        System.out.println("Ventas totales: $" + ventasTotales);
    }
}
