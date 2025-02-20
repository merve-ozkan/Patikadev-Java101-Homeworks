package Donguler;

import java.util.Scanner;
//tek sayı girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program

public class CiftSayiToplami {
    public static void main(String[] args) {
        int number;
        int total = 0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Sayı Giriniz: ");
            number = input.nextInt();

            if(number%2 == 0 && number%4 == 0){
                total += number;
            }
        }while(number%2 == 0);

        System.out.println("Toplam: " + total);
    }
}
