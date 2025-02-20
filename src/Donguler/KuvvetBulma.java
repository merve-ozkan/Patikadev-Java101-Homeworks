package Donguler;

import java.util.Scanner;
//döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program

public class KuvvetBulma {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Sınır Sayısını Giriniz: ");
        number =input.nextInt();

        System.out.println(number + " sayısına kadar 4'un kuvvetleri:");

        for(int i =1; i <= number; i*=4){
            System.out.print(i + " , ");
        }
        System.out.println();

        System.out.println(number + " sayısına kadar 5'in kuvvetleri:");
        for(int i =1; i <= number; i*=5){
            System.out.print(i + " , ");
        }
    }
}
