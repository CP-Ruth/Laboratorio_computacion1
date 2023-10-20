import java.util.Scanner;
public class tp_8_java {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Pedir al usuario el número de filas y columnas
//        System.out.print("Ingrese el número de filas: ");
//        int filas = scanner.nextInt();
//        System.out.print("Ingrese el número de columnas: ");
//        int columnas = scanner.nextInt();
//
//
//
//        // Imprimir la matriz
//        System.out.println("Matriz ingresada:");
//        for (int i = 0; i < filas; i++) {
//            for (int j = 0; j < columnas; j++) {
//                System.out.print(matriz[i][j] + "\t");
//            }
//            System.out.println(); // Nueva línea para la siguiente fila
//        }
//
//        // Sumar matrices.
//        //
//
//    }
//
//    public static void llenarMatriz(int a ,int b) {
//        // Crear la matriz
//        int[][] matriz = new int[a][b];
//
//        // Llenar la matriz
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                System.out.print("Ingrese el valor para la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
//                matriz[i][j] = scanner.nextInt();
//            }
//        }
//    }
//
//    public static void mostrarmatriz(int a ,int b) {
//        int [][] matriz = new int [a][b];
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                System.out.print(matriz[i][j] + "\t");
//            }
//            System.out.println(); // Nueva línea para la siguiente fila
//        }
//
//    }

    //Ejericio 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = {1, 2, 3, 4};
        System.out.println("Ingresa un valor:");
        double number = sc.nextDouble();

        double[] result = productScale(vector, number);

        // Imprimir el resultado
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static double[] productScale(int[] vector, double escalar) {
        int n = vector.length;
        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            result[i] = vector[i] * escalar;
        }
        return result;
    }

    public static int[][] diagonaMatrix(int[][] matriz) {
        boolean result;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; i < matriz.length; i++) {
                if () {

                }
            }
        }
        return result;
    }
    }

