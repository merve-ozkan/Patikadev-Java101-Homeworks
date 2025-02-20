package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

//kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran program
public class KdvHesaplama {
    public static void main(String[] args) {

        double girilenTutar, kdvOran, kdvTutari, kdvliTutar;

        Scanner tutar = new Scanner(System.in);
        System.out.print("Tutari Giriniz:");
        girilenTutar = tutar.nextDouble();

        kdvOran = (girilenTutar >= 1000) ? 0.08 : 0.18;

        kdvTutari = girilenTutar * kdvOran;
        System.out.println("KDV Tutari: " + kdvTutari);
        kdvliTutar = kdvTutari + girilenTutar;
        System.out.println("KDV'li Tutar: " + kdvliTutar);
    }
}