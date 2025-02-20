package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int lesson =0, lessonNumber =0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if(0 <= mat && 100 >= mat){
            lesson += mat;
            lessonNumber++;
        }

        System.out.print("Turkce Notunuz: ");
        turkce = input.nextInt();
        if(0 <= turkce && 100 >= turkce){
            lesson += turkce;
            lessonNumber++;}

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if(0 <= fizik && 100 >= fizik) {
            lesson += fizik;
            lessonNumber++;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if(0 <= kimya && 100 >= kimya) {
            lesson += kimya;
            lessonNumber++;
        }


        System.out.print("Muzik Notunuz: ");
        muzik = input.nextInt();
        if(0 <= muzik && 100 >= muzik) {
            lesson += muzik;
            lessonNumber++;
        }

        double average = (double) lesson / lessonNumber;

        if(average <= 55){
            System.out.println("Sınıfta kaldınız!");

        }else{
            System.out.println("Tebrikler, Sınıfı Geçtiniz!");

        }
        System.out.println("Ortalamanız: " + average);
    }
}
