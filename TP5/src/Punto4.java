import java.util.Scanner;

/*algoritmo que permita cargar un array de una dimensión de 20 elementos enteros.
Finalizada la carga de los 20 elementos el programa debe solicitar como se desea ordenar el array ASCENDENTE O DESCENDENTE y que méetodo de ordenamiento aplicar (inserción, burbuja, selección), según las opciones elegidas aplique el algoritmos fundamental de ordenamiento que corresponda.
Muestre por pantalla el array original desordenado y su resultante ordenado según las opciones elegidas.*/

public class punto4 {
    public void insercion(int[] A, String orden) {
        for (int i = 1; i < A.length; i++) {
            int valor = A[i];
            int j = i - 1;

            if (orden.equals("ASCENDENTE")) {
                while (j >= 0 && A[j] > valor) {
                    A[j + 1] = A[j];
                    j--;
                }
            } else if (orden.equals("DESCENDENTE")) {
                while (j >= 0 && A[j] < valor) {
                    A[j + 1] = A[j];
                    j--;
                }
            }
            A[j + 1] = valor;
        }
    }

    public void burbuja(int[] A, String orden) {
        int n = A.length;
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++) {
                boolean debeIntercambiar = (orden.equals("ASCENDENTE")) ? A[i - 1] > A[i] : A[i - 1] < A[i];
                if (debeIntercambiar) {
                    int aux = A[i - 1];
                    A[i - 1] = A[i];
                    A[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
    }

    public void seleccion(int[] A, String orden) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int ind = i;
            for (int j = i + 1; j < n; j++) {
                boolean actualizar = (orden.equals("ASCENDENTE")) ? A[j] < A[ind] : A[j] > A[ind];
                if (actualizar) {
                    ind = j;
                }
            }
            int aux = A[ind];
            A[ind] = A[i];
            A[i] = aux;
        }
    }

    public void main() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        System.out.println("Cargue 20 números:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        sc.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("¿Cómo desea ordenar el array? (ascendente o descendente)");
        String orden = sc.nextLine().toUpperCase();

        // Convertir la entrada a "ASCENDENTE" o "DESCENDENTE"
        if (orden.equals("ASCENDENTE")) {
            orden = "ASCENDENTE";
        } else if (orden.equals("DESCENDENTE")) {
            orden = "DESCENDENTE";
        } else {
            System.out.println("Orden no válido. Se utilizará el orden ascendente por defecto.");
            orden = "ASCENDENTE";
        }

        System.out.println("¿En qué método? (insercion, burbuja, seleccion)");
        String metodo = sc.nextLine().toLowerCase();

        System.out.println("Array ingresado:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        switch (metodo) {
            case "insercion":
                insercion(array, orden);
                break;
            case "burbuja":
                burbuja(array, orden);
                break;
            case "seleccion":
                seleccion(array, orden);
                break;
            default:
                System.out.println("Método de ordenamiento no válido.");
                break;
        }

        System.out.println("Array ordenado:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        punto4 obj = new punto4();
        obj.main();
    }
}