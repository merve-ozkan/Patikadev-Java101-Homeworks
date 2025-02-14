import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {

        Scanner kg = new Scanner(System.in);
        System.out.print("kilonuzu giriniz (kg): ");
        double kilo = kg.nextDouble();
        Scanner metre = new Scanner(System.in);
        System.out.print("boyunuzu giriniz (metre): ");
        double boy = metre.nextDouble();
        double vucutKitleIndeksi = kilo/(boy*boy);
        System.out.println("vucut kitle indeksiniz: " + vucutKitleIndeksi);
    }
}