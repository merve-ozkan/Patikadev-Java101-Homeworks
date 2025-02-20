import java.util.Scanner;

//kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program

public class CinZodyagiHesaplama {
    public static void main(String[] args) {

        int birthYear,zodiac;
        String animal = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz: ");
        birthYear = input.nextInt();

        zodiac = birthYear%12;

        switch (zodiac){
            case 0:{
               animal = "Maymun";
            }
            break;
            case 1:{
                animal ="Horoz";
            }
            break;
            case 2:{
                animal = "Kopek";
            }
            break;
            case 3:{
                animal = "Domuz";
            }
            break;
            case 4:{
                animal = "Fare";
            }
            break;
            case 5: {
                animal = "Okuz";
            }
            break;
            case 6:{
                animal = "Kaplan";
            }
            break;
            case 7:{
                animal ="Tavsan";
            }
            break;
            case 8:{
                animal = "Ejderha";
            }
            break;
            case 9:{
                animal = "Yılan";
            }
            break;
            case 10:{
                animal = "At";
            }
            break;
            case 11:{
                animal = "Koyun";
            }
            break;
            default:
                isError = true;
        }
        if(isError){
            System.out.println("Hatalı Giriş Yaptınız!");
        } else {
            System.out.println("Çin Zodyağı Burcunuz: " + animal);
        }
    }
}
