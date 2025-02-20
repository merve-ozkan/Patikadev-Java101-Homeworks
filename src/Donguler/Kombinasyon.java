package Donguler;

import java.util.Scanner;

//kombinasyon hesaplayan program
public class Kombinasyon {
    public static void main(String[] args) {

        int totalNumber, chosenNumber, combination,diff;
        int totalNumberFactorial = 1;
        int chosenNumberFactorial= 1;
        int diffFactorial = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("İşlem Yapacağınız Kümenin Eleman Sayısını Giriniz(n): " );
        totalNumber = input.nextInt();
        System.out.println("Seçim Yapılacak Eleman Sayısını Giriniz(r): ");
        chosenNumber = input.nextInt();
        diff = (totalNumber - chosenNumber);

        for(int i = 1; i<= totalNumber; i++){
            totalNumberFactorial = totalNumberFactorial*i;
        }

        for(int j =1; j <= chosenNumber; j++){
            chosenNumberFactorial = chosenNumberFactorial*j;

        }

        for(int k = 1; k<= diff; k++){
            diffFactorial = diffFactorial*k;
        }

        combination = totalNumberFactorial / (chosenNumberFactorial * diffFactorial);
        System.out.println("Kombinasyon Sayısı: " + combination);

    }
}
