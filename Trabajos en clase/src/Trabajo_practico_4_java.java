import java.util.Arrays;
import java.util.Scanner;

public class Trabajo_practico_4_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //Ejercico 1
        int [] numbers= new int[10];
        int evenNum, oddNum, even, odd;
        evenNum=0;
        oddNum=0;
        even=0;
        odd=0;
        System.out.println("Ingresa 10 números");
        for(int i = 1; i <= 10; i++ ){
            numbers[i-1]= sc.nextInt();
            if(numbers[i-1]>0){
                evenNum+=numbers[i-1];
                even+=1;
            } else if(numbers[i-1]>0){
                oddNum+=numbers[i-1];
                odd+=1;
            }
        }
        System.out.println("Los números ingresados fueron: "+ Arrays.toString(numbers));
        System.out.println("El promedio de los números positivos: "+ evenNum/even);
        System.out.println("El promedio de los números negativos: "+ oddNum/odd);
    }
}
