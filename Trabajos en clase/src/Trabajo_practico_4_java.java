import java.util.Arrays;
import java.util.Scanner;

public class Trabajo_practico_4_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercico 1
//        int [] numbers= new int[10];
//        int evenNum, oddNum, even, odd;
//        evenNum=0;
//        oddNum=0;
//        even=0;
//        odd=0;
//        System.out.println("Ingresa 10 números");
//        for(int i = 1; i <= 10; i++ ){
//            numbers[i-1]= sc.nextInt();
//            if(numbers[i-1]>0){
//                evenNum+=numbers[i-1];
//                even+=1;
//            } else if(numbers[i-1]>0){
//                oddNum+=numbers[i-1];
//                odd+=1;
//            }
//        }
//        System.out.println("Los números ingresados fueron: "+ Arrays.toString(numbers));
//        System.out.println("El promedio de los números positivos: "+ evenNum/even);
//        System.out.println("El promedio de los números negativos: "+ oddNum/odd);
        // Ejercicio 2
//        int [] numbers= new int[10];
//        int evenNum = 0;  //Sumatoria de los numeros en posición par(0,2,4,6,8)
//        System.out.println("Ingresa 10 números");
//        for(int i = 1; i <= 10; i++ ){
//            numbers[i-1]= sc.nextInt();
//        }
//        for(int i = 0; i < 10; i += 2) {
//            evenNum += numbers[i];
//        }
//        System.out.println("La media de los numeros en posisiones pares del array es: " + evenNum/5);
        // Ejercicio 3
//        System.out.println("Ingresa el número de estudiantes de la clase:");
//        int numberStudent = sc.nextInt();
//        double [] notes= new double[numberStudent];
//        double sumNotes = 0;  //Sumatoria de las notas
//        System.out.println("Debes ingresar "+ numberStudent + " notas: " );
//        for(int i = 1; i <= numberStudent; i++ ){
//            notes[i-1]= sc.nextInt();
//            sumNotes += notes[i-1];
//        }
//        double media = sumNotes/numberStudent;
//        System.out.println("La media de las notas de la clase con "+ notes.length + " alumnos es: " + media);
//        System.out.println("Las notas superiores a la media son: ");
//        for(int i = 1; i <= numberStudent; i++ ){
//            if(notes[i-1] >= media){
//                System.out.println(notes[i-1]);
//            }
//        }
        // Ejercicio 4
//        int[] pares = new int[20];
//        int valor = 0; //valor inicial de los pares
//        int index = 0;  //el valor de los indices
//
//        while (index < pares.length) {
//            pares[index] = valor;
//            index++;
//            valor += 2;
//        }
//        System.out.println("Los elementos del array Pares:");
//        for (int i = 0; i < pares.length; i++){
//            System.out.print(pares[i]+ " ");
//        }

        // Ejercicio 5
//        int [] myArray = new int[10];
//        int possitive = 0;
//        int negative = 0;
//        int cero = 0;
//        for(int i =0; i< 10; i++){
//            System.out.print((i+1) +": ");
//            // Comprueba si la entrada es un número
//            while (!sc.hasNextDouble()) {
//                System.out.println("Entrada no válida. Ingrese un número.");
//                sc.next(); // Descarta la entrada incorrecta
//            }
//            myArray[i] = sc.nextInt(); // Lee el número
//        }
//        for(int i =0; i< 10; i++){
//            if(myArray[i]>0){
//                possitive += 1;
//            } else if (myArray[i]<0) {
//                negative += 1;
//            }else {
//                cero += 1;
//            }
//        }
//        System.out.println("Cantidad de numeros positivos: "+possitive);
//        System.out.println("Cantidad de numeros negativos: "+negative);
//        System.out.println("Cantidad de ceros: "+cero);

    // Ejercicio 6
//        int [] myArray = new int[10];
//        int possitive = 0;
//        int numerPossitive = 0;
//        int negative = 0;
//        int numberNegative = 0;
//
//        for(int i =0; i< 10; i++) {
//            System.out.print((i + 1) + ": ");
//            // Comprueba si la entrada es un número
//            while (!sc.hasNextDouble()) {
//                System.out.println("Entrada no válida. Ingrese un número.");
//                sc.next(); // Descarta la entrada incorrecta
//            }
//            myArray[i] = sc.nextInt(); // Lee el número
//            if(myArray[i]>0){
//                possitive += 1;
//                numerPossitive += myArray[i];
//            } else if (myArray[i]<0) {
//                negative += 1;
//                numberNegative += myArray[i];
//            }
//        }
//        int mediaPossitive = numerPossitive/possitive;
//        int mediaNegative = numberNegative/negative;
//        System.out.println("Media de los valores positivos: "+ mediaPossitive);
//        System.out.println("Media de los valores negativos: "+ mediaNegative);

    // Ejercicio 7
        System.out.println("Ingresa la cantidad de personas:");
        int numberPeople = sc.nextInt();
        double [] people = new double[numberPeople];
        









    // Ejercicio 7
    // Ejercicio 8
    // Ejercicio 9
    }

}
