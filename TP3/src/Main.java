import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ejercicios = 0;
        while(ejercicios>10  || ejercicios<1){
            ejercicios = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un ejercicio a realizar"));
            if(ejercicios>10 || ejercicios<1){
                JOptionPane.showMessageDialog(null, "No es un ejercicio valido, ingrese un ejercicio del 1-10");
            }
        }
        // ¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?
        if(ejercicios==1){
            System.out.println("Cuando intentas acceder a un elemento con un índice menor que 0 o mayor o igual que la longitud de la array, se lanza la excepción Index Out of Bounds. Esta excepción sirve para que el programa Java indique que estás intentando una operación inválida en la array.");
        }
        //Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores numéricos manualmente y muestralos por pantalla.
        // Solicite los números mediante un bucle.
        if (ejercicios==2){
            int [] numeros = new int[5];
            for (int i = 0; i < 5; i++){
                System.out.print("Ingreses el numero " + (i+1) + " de la lista: ");
                numeros[i] = Integer.parseInt(sc.nextLine());
            }
            System.out.println("Los numeros de la lista son: " + Arrays.toString(numeros));

        }
        // Crea un array unidim con tamaño ingresado por teclado y crear una función que lo rellene con múltiplos de un numero pedido por teclado.
            // Por ejemplo, si es de tamaño 5 y elijo un 3, contendra 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.
        if (ejercicios==3){
            multiplosEnLista ml = new multiplosEnLista();
            System.out.print("Ingrese el tamaño de la lista: ");
            int tamanio = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese un numero a guardar sus multiplos en la lista: ");
            int num = Integer.parseInt(sc.nextLine());
            int [] multiplos = ml.lista(num, tamanio);
            System.out.println("Los multiplos de " + num + " en la lista son: ");
            System.out.print((ml.resultados(multiplos)));

        }
        // Escriba una aplicación que:
            // a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un arr unidim.
            // b) determine y muestre el mayor de los números en el arreglo
            // c) determine y muestre el menor de los números del arreglo calcule y muestre el rango (diferencia entre el mayor y el menor) de los elementos en el arreglo
        if(ejercicios==4){
            maxMinDeLista mml = new maxMinDeLista();
            int [] numeros = new int[20];
            for (int i = 0; i < 20; i++){
                System.out.print("Ingrese el numero " + (i+1) + " de la lista: ");
                numeros[i] = Integer.parseInt(sc.nextLine());
            }
            int max = mml.maximo(numeros);
            int min = mml.minimo(numeros);
            int diferencia = mml.diferencia(max, min);
            System.out.println("El mayor numero de la lista es: " + max);
            System.out.println("El menor numero de la lista es: " + min);
            System.out.println("La diferencia entre el mayor y menor de la lista es: " + diferencia);
        }
        // Escriba una aplicación para almacenar al azar 20 núm enteros positivos pares (del 1 al 100), de los cuales se desea saber:
            //a) su promedio aritmético
            //b) cuántos de los números son iguales al promedio aritmético
            //c) cuántos de los números son mayores que el promedio aritmético
            //d) cuántos de los números son menores que el promedio aritmético
        if (ejercicios==5){
            paresLista lp = new paresLista();
            int [] pares = lp.pares();
            String listaPares = Arrays.toString(pares);
            int promedio = lp.promedio(pares);
            int mayorPromedio = lp.mayorPromedio(pares);
            int menorPromedio = lp.menorPromedio(pares);
            int iguales = lp.igualesPromedio(pares);
            System.out.println("La lista de pares enteros es: " + listaPares);
            System.out.println("El promedio de los numeros de la lista es: " + promedio);
            System.out.println("La cantidad de numeros iguales al promedio es de: " + iguales);
            System.out.println("La cantidad de numeros mayores al promedio es de: " + mayorPromedio);
            System.out.println("La cantidad de numeros menores al promedio es de: " + menorPromedio);
        }
        // Realice una búsqueda secuencial en un arr unid de tamaño 50 generado aleatoriamente mediante la función java random.
        //Realice una búsqueda secuencial de la siguiente forma:
        //- se lee el valor que se desea buscar,
        //- se compara la primera posición;
        //- si son iguales, fin de la búsqueda.
        //- De lo contrario, compararlo con la segunda posición, y así sucesivamente.
        //- Si se llega al final y no se encontró el valor, indicarlo con un mensaje apropiado.
        //- Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por primera vez.
        if (ejercicios==6){
            System.out.println("Ingrese un  numero a buscar en una lista");
            int numBuscar = Integer.parseInt(sc.nextLine());
            int [] listaRandom = new int[50];
            for (int i = 0; i < 50; i++){
                listaRandom[i] = (int)(Math.random()*100+1);
            }
            busquedaEnLista bn = new busquedaEnLista();
            String[] conclusion = bn.conclusion(listaRandom,numBuscar);
            if (conclusion[0].equals("true")){
                System.out.println(conclusion[1] + ", en posicion: " + conclusion[2]);
            }else if (conclusion[0].equals("false")){
                System.out.print(conclusion[1]);
            }
        }
        // Crea un programa que permita al usuario ingresar un conjunto de 20 números enteros aleatorios en un array unidimensional.
        // El programa debe calcular la suma de los números pares y la suma de los números impares por separado, y luego mostrar los resultados.
        if (ejercicios==7){
            int[] lista = new int [20];
            for (int i = 0 ;i < 20; i++){
                lista[i]=(int)(Math.random()*100+1);

            }
            sumaParesImpares spi = new sumaParesImpares();
            String listaString = Arrays.toString(lista);

            int suma=spi.suma(lista);
            int sumaImpares=spi.sumaImpares(lista);
            System.out.println("La lista generada es: " + listaString);
            System.out.println("la suma de los numeros pares de la lista es: " + suma );
            System.out.println("la suma de los numeros impares de la lista es: "+ sumaImpares);
        }
        // Escriba una aplicación que solicite y cargue en un arr 10 enteros, luego cree dos nuevos arr y asigne al primero los números ingresados por el usuario de forma ascendente y en el segundo de forma descendente. Muestre los 2 arreglos por pantalla.
        if (ejercicios==8){
            int[] lista = new int [10];
            for (int i = 0 ;i < 10; i++){
                System.out.print("Ingrese el numero "+ (i+1) + " a la lista:");
                lista[i]=Integer.parseInt(sc.nextLine());
            }
            listaOrdenada lad = new listaOrdenada();
            System.out.println("La lista generada fue: " + Arrays.toString(lista));
            System.out.println("la lista ordenada ascendentemente es: " + Arrays.toString(lad.ascendente(lista)));
            System.out.println("la lista ordenada descendentemente es: " + Arrays.toString(lad.descendente(lista)));
        }
        // Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por ejemplo: 45-9-8-6-45-23-21-74-96-32-45-25
        // Posteriormente aplique el métodoo SPLIT de los String de Java para convertir la cadena enun arr, y calcular la suma total de los elementos y el valor promedio calculado.
        if (ejercicios==9){
            String string = "45-9-8-6-45-23-21-74-96-32-45-25";
            String[] numeros = string.split("-");
            int sumaTotal=0;
            for (int i = 0; i < numeros.length; i++){
                sumaTotal += Integer.parseInt(numeros[i]);

            }
            System.out.println("La suma total es: " + sumaTotal);
        }
        if (ejercicios==10){
            System.out.println("Ingrese un dni: ");
            String dni = sc.nextLine();
            int dniInt = Integer.parseInt(dni);
            int resto = dniInt/23;

            obtenerLetra dnil= new obtenerLetra();
            System.out.println(dnil.dniLetra(resto));
        }
    }
}


