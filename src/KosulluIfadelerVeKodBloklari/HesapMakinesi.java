package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

//Java- kosullu ifadeler ile basit hesap makinesi yapimi
public class HesapMakinesi {

    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayiyi giriniz: ");
        n1 = input.nextInt();
        System.out.println("İkinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("toplam: " + (n1+n2));
                break;
            case 2:
                System.out.println("çıkarma: " + (n1-n2));
                break;
            case 3:
                System.out.println("çarpma: " + (n1*n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("bölme: " + (n1/n2));
                } else{
                    System.out.println("bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz!");

        }
    }
}
