import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Formül : Kilo (kg) / Boy(m) * Boy(m)

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        double boy = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        int kilo = scan.nextInt();

        double index = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " +index );

    }
}
