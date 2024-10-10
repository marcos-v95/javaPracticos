/*  Explique brevemente en qué consisten los siguientes Algoritmos Fundamentales.
    Algoritmos de Ordenación:
         Ordenamiento por Inserción
         Algoritmo de la burbuja
         Ordenamiento por selección
         Algoritmo Quick-Sort
    Algoritmos de Búsqueda:
         Búsqueda Secuencial
         Búsqueda Binaria
    Algoritmos de Recorrido:
         Recorrido de Profundidad
         Recorrido de Anchura*/

/*  Algoritmos de Ordenación:
     - Ordenamiento por Inserción: Construye una lista ordenada a medida que recorre los elementos de una lista desordenada. Funciona comparando el elemento actual con los anteriores y los va "insertando" en la posición correcta. Es eficiente para listas pequeñas o casi ordenadas, con una complejidad de O(n2) en el peor caso.
     - Algoritmo de la burbuja: se comparan pares adyacentes de elementos y se intercambian si están en el orden incorrecto. Este proceso se repite hasta que no se necesitan más intercambios, lo que significa que la lista está ordenada. Es poco eficiente para listas grandes.
     - Ordenamiento por selección: divide el arreglo en una parte ordenada y otra desordenada. Busca el elemento mínimo en la parte desordenada y lo intercambia con el primer elemento de esa parte. Este proceso se repite hasta que el arreglo esté completamente ordenado. Realiza menos intercambios que el algoritmo de la burbuja.
     - Algoritmo Quick-Sort: Selecciona un elemento "pivote" y reorganiza la lista de manera que los elementos menores al pivote se coloquen a su izquierda y los mayores a su derecha. Luego, aplica el mismo procedimiento recursivamente a los sub-arreglos.

    Algoritmos de Búsqueda
     - Búsqueda Secuencial: Busca un elemento en una lista recorriendo cada uno de los elementos de la misma. Se detiene cuando encuentra el elemento buscado o cuando ha revisado toda la lista. Es útil en listas no ordenadas.
     - Búsqueda Binaria: Requiere una lista ordenada. Divide la lista en mitades de manera repetitiva comparando el valor del medio con el elemento buscado. Dependiendo del resultado, sigue buscando en la mitad izquierda o derecha. Es muy eficiente en listas grandes.

    Algoritmos de Recorrido
     - Recorrido de Profundidad:Es un algoritmo utilizado para recorrer o buscar en estructuras de datos como grafos o árboles. Comienza desde un nodo inicial y explora tan lejos como sea posible a lo largo de cada rama antes de retroceder. Utiliza una pila (puede implementarse de manera recursiva).
     - Recorrido de Anchura:Recorre o busca en estructuras como grafos o árboles. A diferencia del recorrido en profundidad (DFS), el recorrido en anchura explora todos los nodos en el mismo nivel antes de pasar al siguiente nivel, utilizando una cola para recordar los nodos a visitar. Comienza desde un nodo inicial, visita sus vecinos, luego los vecinos de sus vecinos, y así sucesivamente. Es útil para encontrar la ruta más corta en un grafo no ponderado.
     */