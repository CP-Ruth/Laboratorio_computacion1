import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa c1 y c2:");
        double cat1 = scanner.nextDouble();
        double cat2 = scanner.nextDouble();
        double hip=Math.sqrt(Math.pow(cat1, 2)+Math.pow(cat2, 2));
        System.out.println("Hipotenusa = "+ hip );
    }
}
