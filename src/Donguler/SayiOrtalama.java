package Donguler;

import java.util.Scanner;

//kullanıcın girdiği sayıya kadar 3 ve 4e bölünen sayıların ortalaması
public class SayiOrtalama {
    public static void main(String[] args) {
        int number ,sum = 0, piece = 0;
        double average = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi Giriniz: ");
        number = input.nextInt();

        for(int i =0; i <= number; i++){
            if(i%3 == 0 && i%4 == 0){
                sum += i;
                piece++;
                average = ((double) sum /piece);

            }
        }
        System.out.println("ortalama: " + average);
    }
}
