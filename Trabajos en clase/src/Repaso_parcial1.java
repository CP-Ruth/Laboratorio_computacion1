import java.util.Scanner;
public class Repaso_parcial1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*Ejercicio-A
        System.out.println("Ingresa dos números:");
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        if(number2%10==number1%10){
            System.out.println("Los dos números acsf misma cifra");
        }else{
            System.out.println("Los dos números acaban con la misma cifra");
        }
        */
//Ejercicio-B
        System.out.println("Ingresa un número de tres cifras:");
        int number= sc.nextInt();
        while (number>=1000 || number<=99){
            System.out.println("El numero ingresado tiene mas de 3 cifras.\nIngresa un número de tres cifras:");
            number= sc.nextInt();
        }
        int digUno = number/100;
        int digTres = number/10;
        if (digUno==digTres){
            System.out.println("El número ingresado es capicúa.");
        } else{
            System.out.println("El numero ingresado no es capicúa.");
        }
    }
}
