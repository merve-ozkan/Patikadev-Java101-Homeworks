package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

//Java kosullu ifadeler ile kullanıcının burcunu bulan program

public class BurcBulma {
    public static void main(String[] args) {

        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Dogdugunuz ay: ");
        month = input.nextInt();

        System.out.println("Dogdugunuz gün: ");
        day = input.nextInt();

        switch (month){
            case 1:
                if(day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Oglak";
                    } else {
                        horoscope = "Kova";
                    }
                } else{
                    isError = true;
                }
                break;
            case 2:
                if(day >= 1 && day <= 28){
                    if(day < 20){
                        horoscope = "Kova";
                    } else{
                        horoscope = "Balık";
                    }
                } else{
                    isError = true;
                }
                break;
            case 3:
                if(day >= 1 && day <= 31){
                    if(day < 21){
                        horoscope = "Balık";
                    }else{
                        horoscope = "Koc";
                    }
                } else{
                    isError = true;
                }
                break;
            case 4:
                if(day >=1 && day <= 30){
                    if(day < 21){
                        horoscope = "Koc";
                    }else{
                        horoscope = "Boga";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if(day >= 1 && day <= 31){
                    if(day < 22){
                        horoscope = "Boga";
                    } else{
                        horoscope = "İkizler";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if(day >=1 && day <= 30){
                    if(day < 23){
                        horoscope = "İkizler";
                    } else{
                        horoscope = "Yengec";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        horoscope = "Yengec";
                    } else {
                        horoscope = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        horoscope = "Aslan";
                    }else {
                        horoscope = "Basak";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if(day >= 1 && day <= 30){
                    if(day < 23){
                        horoscope ="Basak";
                    } else{
                        horoscope = "Terazi";
                    }
                } else{
                    isError = true;
                }
                break;
            case 10:
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        horoscope = "Terazi";
                    } else {
                        horoscope = "Akrep";
                    }
                }else {
                    isError = true;
                }
                break;
            case 11:
                if(day >= 1 && day <=30){
                    if(day < 22){
                        horoscope = "Akrep";
                    } else {
                        horoscope = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if(day >=1 && day <= 31){
                    if(day < 22){
                        horoscope = "Yay";
                    } else {
                        horoscope = "Oglak";
                    }
                } else {
                    isError = true;
                }
                break;

            default:
                isError = true;
        }
        if(isError){
            System.out.println("Hatalı giris yaptınız, tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz: " + horoscope);
        }
    }
}
