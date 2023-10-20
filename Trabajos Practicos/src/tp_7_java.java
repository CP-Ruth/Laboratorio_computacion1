import java.util.Scanner;
public class tp_7_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //un array de una dimensión de 20 elementos enteros
        int[] array = new int[20];
        System.out.println("Ingrese 20 elementos enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        //Solicitar como se desea ordenar el array ASCENDENTE O DESCENDENTE
        System.out.print("¿Cómo desea ordenar el array? (ASCENDENTE o DESCENDENTE): ");
        String tipoOrdenamiento = scanner.next();

        //Método de ordenamiento a aplicar(inserción, burbuja, selección)
        System.out.print("Seleccione el método de ordenamiento (inserción, burbuja, selección): ");
        String metodoOrdenamiento = scanner.next();

        if (tipoOrdenamiento=="ASCENDENTE") {
            if (metodoOrdenamiento=="inserción") {
                ordenarInsercionAscendente(array);
            } else if (metodoOrdenamiento=="burbuja") {
                ordenarBurbujaAscendente(array);
            } else if (metodoOrdenamiento=="selección") {
                ordenarSeleccionAscendente(array);
            } else {
                System.out.println("Método de ordenamiento no válido.");
                return;
            }
        } else if (tipoOrdenamiento=="DESCENDENTE") {
            if (metodoOrdenamiento=="inserción") {
                ordenarInsercionDescendente(array);
            } else if (metodoOrdenamiento=="burbuja") {
                ordenarBurbujaDescendente(array);
            } else if (metodoOrdenamiento=="selección") {
                ordenarSeleccionDescendente(array);
            } else {
                System.out.println("Método de ordenamiento no válido.");
                return;
            }
        } else {
            System.out.println("Tipo de ordenamiento no válido.");
            return;
        }

        // Mostrar el array original y el resultado ordenado
        System.out.println("Array original:");
        mostrarArray(array);
    }

    // Función para mostrar un array
    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Funciones para ordenar el array ascendente y descendente usando los tres métodos de ordenamiento
    public static void ordenarInsercionAscendente(int[] A) {
        // Implementar el algoritmo de inserción ascendente
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) { // desde el segundo elemento hasta
            aux = A[p];           // el final, guardamos el elemento y
            j = p - 1;            // empezamos a comprobar con el anterior
            while ((j >= 0) && (A[j]>aux)) { // mientras queden posiciones y el
                // valor de aux sea menor que los
                A[j + 1] = A[j];   // de la izquierda, se desplaza a
                j--;               // la derecha
            }
            A[j + 1] = aux;
        }
    }

    public static void ordenarInsercionDescendente(int[] A) {
        // Implementar el algoritmo de inserción descendente
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) { // desde el segundo elemento hasta
            aux = A[p];           // el final, guardamos el elemento y
            j = p - 1;            // empezamos a comprobar con el anterior
            while ((j >= 0) && (A[j]< aux)) { // mientras queden posiciones y el
                // valor de aux sea menor que los
                A[j + 1] = A[j];   // de la izquierda, se desplaza a
                j--;               // la derecha
            }
            A[j + 1] = aux;
        }
    }

    public static void ordenarBurbujaAscendente(int[] A) {
        // Implementar el algoritmo de burbuja ascendente
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void ordenarBurbujaDescendente(int[] A) {
        // Implementar el algoritmo de burbuja descendente
        int i, j, aux;
        for (i = 0; i < A.length-1 ; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] > A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void ordenarSeleccionAscendente(int[] A) {
        // Implementar el algoritmo de selección ascendente
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
            menor = A[i];                       // de los elementos que quedan por ordenar
            pos = i;                            // y guardamos su posición
            for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                if (A[j] < menor) {           // del array algún elemento
                    menor = A[j];             // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){                      // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    public static void ordenarSeleccionDescendente(int[] A) {
        // Implementar el algoritmo de selección descendente
        int i, j, mayor, pos, tmp;
        for (i = 0; i < A.length - 1 ; i++) {      // tomamos como menor el primero
            mayor = A[i];                       // de los elementos que quedan por ordenar
            pos = i;                            // y guardamos su posición
            for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                if (A[j] > mayor) {           // del array algún elemento
                    mayor = A[j];             // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){                      // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }
}
