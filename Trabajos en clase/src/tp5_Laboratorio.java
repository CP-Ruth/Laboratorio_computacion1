import java.util.Scanner;
public class tp5_Laboratorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número N:");
        int number1 = sc.nextInt();

        System.out.println("bucle for");
        for(int i=1; i<=number1 ;i++){
            System.out.println(i);
        }
        System.out.println("bucle  while");
        int i=1;
        while (i<=number1){
            System.out.println(i);
            i++;
        }
        System.out.println("bucle  do while");
        i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<=number1);
    }
}