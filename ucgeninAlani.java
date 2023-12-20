import java.util.Scanner;

public class ucgeninAlani {
    public static void main(String[] args) {

        double a,b,c,u,alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. kenarı giriniz: ");
        a = inp.nextDouble();
        System.out.print("2. kenarı giriniz: ");
        b = inp.nextDouble();
        System.out.print("3. kenarı giriniz: ");
        c = inp.nextDouble();

        u = (a+b+c)/ 2;

        alan = Math.sqrt(u * (u -a)* (u-b) * (u-c));
        System.out.println("üçgenin alanı: " + alan);


    }
}
