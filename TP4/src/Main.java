import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ejercicios = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ejercicio a realizar (1-20)"));
        Scanner sc = new Scanner(System.in);
        // Crea un programa que pida por pantalla cuatro países y a continuación tres ciudades de cada uno.
        // Las ciudades deben almacenarse en un arr multid cuyo primer índice sea el número asignado a cada país y
        // el segundo índice el número asignado a cada ciudad. Es decir el array deberá tener un tamaño de 4x4
        if (ejercicios == 1) {
            String[][] paises = new String[4][4];
            for (int filas = 0; filas < paises.length; filas++) {
                System.out.println("Ingrese Su pais");
                paises[filas][0] = sc.nextLine();
                for (int col = 1; col < paises.length; col++) {
                    System.out.println("Ingrese su ciudad");
                    paises[filas][col] = sc.nextLine();
                }
            }
            System.out.println("Países y ciudades ingresados:");
            for (int filas = 0; filas < paises.length; filas++) {
                for (int col = 0; col < paises[filas].length; col++) {
                    System.out.print(paises[filas][col] + " ");
                }
                System.out.println();
            }
        }
        // Crea un prog que pida por input 2 valores numéricos enteros X e Y.
        // Cree un primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor entero que deberá ser ingresado por el usuario.
        // Cree un segundo array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser ingresado por el usuario.
        // Cree un tercer array de tamaño [X,Y] que será el resultante de multiplicar cada una de las posiciones de las filas del array uno por cada una de las posiciones de las columnas del array 2. Muestre por pantalla cada uno de los arrays con sus valores
        if (ejercicios == 2) {
            System.out.println("Ingrese 2 numeros enteros");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[][] matriz1 = new int[x][y];
            int[][] matriz2 = new int[y][x];
            int[][] matriz3 = new int[x][y];
            System.out.println("Complete la primer matriz");

            for (int filas = 0; filas < x; filas++) {
                System.out.println("Ingrese la fila n°" + filas + " de numeros enteros");
                matriz1[filas][0] = sc.nextInt();
                for (int col = 1; col < y; col++) {
                    matriz1[filas][col] = sc.nextInt();
                }
            }
            System.out.println("Complete la segunda matriz");
            for (int filas = 0; filas < y; filas++) {
                System.out.println("Ingrese la fila n°" + filas + " de numeros enteros");
                matriz2[filas][0] = sc.nextInt();
                for (int col = 1; col < x; col++) {
                    matriz2[filas][col] = sc.nextInt();
                }
            }
            for (int filas = 0; filas < x; filas++) {
                for (int col = 0; col < y; col++) {
                    matriz3[filas][col] = matriz1[filas][col] * matriz2[col][filas];
                }
            }
            System.out.println("La primera matriz es:");
            for (int[] fila : matriz1) {
                for (int col : fila) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
            System.out.println("La segunda matriz es:");
            for (int[] fila : matriz2) {
                for (int col : fila) {
                    System.out.print(col + " ");
                }
                System.out.println();

            }
            System.out.println("La tercera matriz es:");
            for (int[] fila : matriz3) {
                for (int col : fila) {
                    System.out.print(col + " ");
                }
                System.out.println();

            }
        }
        // Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o igual a 10. Cree un arreglo de tamaño [X,X] de tipo int.
        // Posteriormente solicite los valores necesarios para cargar cada una de las celdas de la matriz. Muestre por pantalla la matriz resultante.
        //Al finalizar la carga sume cada una de las columnas del arr y asigne los resultados en una nueva matriz de una dimensión, finalmente sume los valores de esta última matriz y muestre el resultado por pantalla.
        if (ejercicios == 3) {
            int x = 0;
            while (x < 3 || x > 10) {
                System.out.println("Ingrese un numero mayor o igual a 3, y menor o igual que 10");
                x = sc.nextInt();
            }
            int[][] matriz1 = new int[x][x];
            for (int filas = 0; filas < x; filas++) {
                System.out.println("Ingrese la fila n°" + filas + " de numeros enteros");
                matriz1[filas][0] = sc.nextInt();
                for (int col = 1; col < x; col++) {
                    matriz1[filas][col] = sc.nextInt();
                }
            }
            int[] columnasum = new int[x];
            int sum1 = 0;
            for (int col = 0; col < x; col++) {
                for (int fila = 0; fila < x; fila++) {
                    sum1 += matriz1[fila][col];
                }
                columnasum[col] = sum1;
                sum1 = 0;


            }
            for (int i = 0; i < x; i++) {
                System.out.println("La suma de la columna " + (i + 1) + " es=" + columnasum[i]);
            }
        }
        // Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o igual a 10.
        // Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú con estas opciones:
        //a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
        //b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
        //c) Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
        //d) Sumar la diagonal principal
        //e) Sumar la diagonal inversa
        //f) La media de todos los valores de la matriz
        //IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se deberán de ejecutar, simplemente mostrar un mensaje que diga que debes rellenar la matriz.
        // Mostrar por pantalla el resultado de la ejecución de cada una de las opciones del menú.
        if (ejercicios == 4) {
            int x = 0;
            while (x < 4 || x > 10) {
                System.out.println("Ingrese un numero entero");
                x = sc.nextInt();
            }
            int[][] matriz = new int[x][x];
            int arealizar = 0;
            int ej = 0;
            while (ej != 8) {
                System.out.println("Ingrese la opcion que desee, recuerde que si no ha completado la matriz no podra acceder a las otras opciones");
                System.out.println("1) Rellenar matriz");
                System.out.println("2) sumar toda una fila");
                System.out.println("3) sumar toda una columna");
                System.out.println("4) Sumar la diagonal principal");
                System.out.println("5) Sumar la diagonal inversa");
                System.out.println("6) La media de todos los valores de la matriz");
                System.out.println("8) salir ");
                ej = sc.nextInt();
                if (ej == 1) {
                    for (int filas = 0; filas < x; filas++) {
                        System.out.println("Ingrese la fila n°" + (filas + 1) + " de numeros enteros");
                        matriz[filas][0] = sc.nextInt();
                        for (int col = 1; col < x; col++) {
                            matriz[filas][col] = sc.nextInt();
                        }
                    }
                    System.out.println("La matriz es:");
                    for (int[] fila : matriz) {
                        for (int col : fila) {
                            System.out.print(col + " ");
                        }
                        System.out.println();
                    }
                }
                if (ej == 2) {
                    int sum1 = 0;
                    int[] filasum = new int[x];
                    System.out.println("¿que fila desea sumar?:");
                    int fila = sc.nextInt();
                    fila += 1;
                    for (int col = 0; col < 2; col++) {
                        sum1 += matriz[fila][col];
                        filasum[fila] = sum1;
                    }
                    System.out.println("La suma de la fila n° " + (fila) + " es=" + filasum[fila]);

                }
                if (ej == 3) {
                    int[] columnasum = new int[x];
                    int sum1 = 0;
                    System.out.println("¿que columna desea sumar?:");
                    int col = sc.nextInt();
                    for (int fila = 0; fila < 2; fila++) {
                        sum1 += matriz[fila][col];
                        columnasum[col] = sum1;
                    }
                    System.out.println("La suma de la columna n° " + (col) + " es=" + columnasum[col]);
                }
                if (ej == 4) {
                    int sumadiag = 0;
                    for (int i = 0; i < x; i++) {
                        sumadiag += matriz[i][i];
                    }
                    System.out.println("la suma de la diagonal principal es " + sumadiag);
                }
                if (ej==5) {
                    int sumainv=0;
                    for (int i=0;i<x;i++){
                        sumainv += matriz[i][x-i-1];
                    }
                    System.out.println("la suma de la diagonal inversa es " + sumainv);
                }
                if (ej==6) {
                    float sumprin=0;
                    for (int col=0;col<x;col++){
                        for (int fil=0; fil<x;fil++){
                            sumprin+=matriz[fil][col];
                        }
                    }
                    int cantelementos= x*x;
                    float media= sumprin/cantelementos;
                    System.out.println("la media de todos los numeros de la matriz es " + media);

                }
            }
        }
        // Codifique la siguiente matriz de 2 dimensiones, que se corresponde a una máquina expendedora de golosinas donde la columna 1 es la golosina, la columna 2 el precio y la columna 3 la cantidad (stock) actual de golosinas
        // Tendremos un pequeño menú con las siguientes opciones:
        //a. Pedir golosina: pedirá la posición de la golosina que quiera. Al seleccionar una golosina debe disminuir la cantidad disponible de la
        //golosina. En caso de agotar el stock informar al cliente y solicitarle que seleccione otra golosina.
        //b. Mostrar golosinas: mostrara todas las golosinas con la cantidad actual disponible.
        //c. Rellenar golosinas: a traves de contraseña, se selecciona la golosina y se repone en el stock
        //d. Apagar maquina: sale del programa, antes de salir mostrara las ventas totales durante la ejecución del programa.
        if (ejercicios==5){
            String[][] golosinas = {
                    {"KitKat", "32", "10"},
                    {"Chicles", "2", "50"},
                    {"Caramelos de Menta", "2", "50"},
                    {"Huevo Kinder", "25", "10"},
                    {"Chetoos", "30", "10"},
                    {"Twix", "26", "10"},
                    {"M&M'S", "35", "10"},
                    {"Papas Lays", "40", "20"},
                    {"Milkybar", "30", "10"},
                    {"Alfajor Tofi", "20", "15"},
                    {"Lata Coca", "50", "20"},
                    {"Chitos", "45", "10"}
            };

            boolean encendida = true;
            while (encendida) {
                System.out.println("\n--- Menú Máquina Expendedora ---");
                System.out.println("a. Pedir golosina");
                System.out.println("b. Mostrar golosinas");
                System.out.println("c. Rellenar golosinas");
                System.out.println("d. Apagar máquina");
                System.out.print("Elija una opción: ");
                char opcion = sc.next().charAt(0);

                switch (opcion) {
                    case 'a':
                        MaquinaGolosinas.pedirGolosina(sc,golosinas);
                        break;
                    case 'b':
                        MaquinaGolosinas.mostrarGolosinas(golosinas);
                        break;
                    case 'c':
                        MaquinaGolosinas.rellenarGolosinas(sc, golosinas);
                        break;
                    case 'd':
                        MaquinaGolosinas.apagarMaquina();
                        encendida = false;
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            }
            sc.close();


        }
    }
}
