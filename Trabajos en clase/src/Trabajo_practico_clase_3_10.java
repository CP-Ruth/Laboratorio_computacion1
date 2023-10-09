import java.util.Scanner;
public class Trabajo_practico_clase_3_10 {
    /*public static void main(String[] args) {
        int [] n = new int[10];
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
        inicializar(n);
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
    }

    public static void inicializar(int [] x){
        for(int i = 0; i < x.length; i++){
            x[i] = i+1;
        }*/
    public static void main(String[] args) {
        int limite = 100; // Cambia el límite según tus necesidades

        System.out.println("Números primos hasta " + limite + ":");
        for (int numero = 2; numero <= limite; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // 0 y 1 no son primos
        }
        if (numero <= 3) {
            return true; // 2 y 3 son primos
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false; // Los múltiplos de 2 y 3 no son primos
        }

        // Verificar divisibilidad por números mayores que 3
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}

