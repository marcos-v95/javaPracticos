/*Modifique los algoritmos de ordenamiento anteriores (inserción, burbuja, selección)
para que además de la lista a ordenar revisan como parámetro un “String orden”, cuyo
valor será “ASC” o “DESC”, que permita definir si la lista debe ordenarse de forma
ASCENDENTE o DESCENDENTE.*/
public class Punto3 {
    public void insercion(int[] A, String orden) {
        for (int i = 1; i < A.length; i++) {
            int valor = A[i];
            int j = i - 1;
            if (orden==("ASC")) {
                while (j >= 0 && A[j] > valor) {
                    A[j + 1] = A[j];
                    j--;
                }
            } else if (orden==("DESC")) {
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
                boolean debeIntercambiar = (orden==("ASC")) ? A[i - 1] > A[i] : A[i - 1] < A[i];
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
                boolean actualizar = (orden.equals("ASC")) ? A[j] < A[ind] : A[j] > A[ind];
                if (actualizar) {
                    ind = j;
                }
            }
            int aux = A[ind];
            A[ind] = A[i];
            A[i] = aux;
        }
    }

}