package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

//Kullanici adi ve sifreyi kontrol eden program

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, newPassword, choice;
        Scanner input =new Scanner(System.in);

        System.out.print("Kullanici Adiniz: ");
        userName = input.nextLine();

        System.out.print("Sifreniz: ");
        password = input.nextLine();

        if(userName.equals("admin") && password.equals("java123")){
            System.out.println("Giris Basarili!");
        } else{

            System.out.println("Bilgileriniz Yanlış!");
            System.out.print("Sifrenizi sifirlamak ister misiniz?(E/H) : ");
            choice = input.nextLine();

            if(choice.equals("E")){
                System.out.println("Yeni sifrenizi giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.print("Sifre olusturulamadı, lütfen baska sifre giriniz!");
                } else{
                    password = newPassword;
                    System.out.println("Sifreniz basarili bir sekilde degistirildi.");
                }
                }else if (choice.equals("H")){
                System.out.println("Sifre sifirlama iptal edildi.");
            } else{
                System.out.println("Hata!!");
            }

        }
    }
}
