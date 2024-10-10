import java.util.Scanner;

/* Codificacion*/
// Algoritmos de Ordenación:
//Ordenamiento por Inserción
public class Punto2 {
    public void insercion(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int valor = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > valor) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = valor;
        }
    }
    //Algoritmo de la burbuja
    public void burbuja(int[] A) {
        int n = A.length;
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++) {
                if (A[i - 1] > A[i]) {
                    int aux = A[i - 1];
                    A[i - 1] = A[i];
                    A[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
    }

    //Ordenamiento por selección
    public void seleccion(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minimo]) {
                    minimo = j;
                }
            }
            int aux = A[minimo];
            A[minimo] = A[i];
            A[i] = aux;
        }
    }
    // Búsqueda secuencial
    public static int busquedaSecuencial(int[] array, int clave) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == clave) {
                return i; // Retorna el índice si encuentra el elemento
            }
        }
        return -1; // Retorna -1 si el elemento no está en el arreglo
    }

    public static void main(String[] args) {
        int[] array = {10, 23, 45, 70, 11, 15};
        int clave = 45;
        int resultado = busquedaSecuencial(array, clave);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en el índice: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

}