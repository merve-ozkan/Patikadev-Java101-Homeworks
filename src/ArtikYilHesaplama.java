import java.util.Scanner;

//kullanıcının girdiği yılın artık olup olmadığını bulan program
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz: ");
        year = input.nextInt();

        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println(year + " artık yıldır!");
            }else{
                System.out.println(year + " artık yıl değildir!");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " artık yıldır!");
        }else {
            System.out.println(year + " artık yıl değildir!");
        }
    }
}
