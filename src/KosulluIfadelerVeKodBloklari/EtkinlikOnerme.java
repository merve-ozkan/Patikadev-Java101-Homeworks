package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

//Hava sıcaklıgına gore etkinlik oneren program
public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat = input.nextInt();

        if(heat <5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if(heat <= 25){
            if(heat <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if(heat >= 10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else {
            System.out.println("Yuzmeye gidebilirsiniz.");
        }
    }
}
