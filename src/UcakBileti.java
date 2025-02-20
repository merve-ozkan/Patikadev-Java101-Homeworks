import java.util.Scanner;


//mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan program

public class UcakBileti {
    public static void main(String[] args) {

        int age, typeTravel;
        double distance, totalPrice, normalPrice, reducedAge, reducedTravel;

        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();

        System.out.print("Mesafe Giriniz(km): ");
        distance = input.nextInt();

        System.out.print("Yolculuk Tipini Seçiniz [Tek Yön(1)/ Gidiş Donuş(2)]: ");
        typeTravel = input.nextInt();

        normalPrice = 0.10 * distance;

        if (distance <= 0 || age < 0 || (typeTravel != 1 && typeTravel != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            if (age < 12) {
                reducedAge = normalPrice * 0.5;
                totalPrice = normalPrice - reducedAge;
            } else if (age > 12 && age < 24) {
                reducedAge = normalPrice * 0.10;
                totalPrice = normalPrice - reducedAge;
            } else if (age > 65) {
                reducedAge = normalPrice * 0.3;
                totalPrice = normalPrice - reducedAge;
            } else {
                totalPrice = normalPrice;
            }

            if (typeTravel == 2) {
                reducedTravel = totalPrice * 0.20;
                totalPrice = (totalPrice - reducedTravel) * 2;
                System.out.println("Toplam Tutar: " + totalPrice + " TL");

            } else {
                System.out.println("Toplam Tutar: " + totalPrice + " TL");
            }
        }
    }
}
