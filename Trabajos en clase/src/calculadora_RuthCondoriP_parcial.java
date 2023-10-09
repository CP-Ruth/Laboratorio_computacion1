import java.util.Scanner;

public class calculadora_RuthCondoriP_parcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean calcu= true;
        while (calcu) {
            System.out.println("Ingrese la operacion que quiera realizar\n (1)suma (2)resta (3)multplicación (4)división ");
            int option= sc.nextInt();
            if (option==1){
                System.out.println("Ingrese dos números para hacer su suma.");
                int numbera = sc.nextInt() ;
                int numberb = sc.nextInt() ;
                int sum=numbera+numberb; //operación de suma
                System.out.println("La suma entre "+numbera+"+"+numberb+" = "+sum);
            } else if (option==2) {
                System.out.println("Ingrese dos números para hacer su resta.");
                int numberc = sc.nextInt() ;
                int numberd = sc.nextInt() ;
                int rest = numberc-numberd; //operación de resta
                System.out.println("La resta entre "+numberc+"-"+numberd+" = "+rest);
            } else if (option==3) {
                System.out.println("Ingrese dos números para hacer su multiplicación.");
                int numbere = sc.nextInt() ;
                int numberf = sc.nextInt() ;
                int multip = numbere*numberf; //operación de multiplicación
                System.out.println("El producto entre "+numbere+"*"+numberf+" = "+multip);
            } else if (option==4){
                System.out.println("Ingrese dos números para hacer su división.");
                int numbere = sc.nextInt() ;
                int numberf = 0 ;
                while (numberf==0){
                    System.out.println("Ingrese un número distinto de cero");
                    numberf = sc.nextInt() ;
                }
                double divi = numbere/numberf; //operación de división
                System.out.println("El producto entre "+numbere+"/"+numberf+" = "+divi);
            } else {
                System.out.println("No ingresaste una opción valida.");
            }
            System.out.println("¿Deseas hacer otra operación? (1)si/ (0)no");
            int resp = sc.nextInt();
            if (resp==0){
                calcu=false;
                System.out.println("Gracias por tu visita.");
            }
        }

    }
}

