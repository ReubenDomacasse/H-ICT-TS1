package Week3;

import java.util.Objects;
import java.util.Scanner;

public class opdr2_1 {

    public static void main (String[]args){
        uitwerkingen intro = new uitwerkingen();
        intro.startup("Opdracht 2.1");

        Scanner input = new Scanner(System.in);

        String geslacht = null;
        int leeftijd;
        boolean info = false;
        while (info == false){
            System.out.print("\nVul uw gelacht in:\t");
            try{
                geslacht = input.nextLine();
                if (Objects.equals(geslacht, "man")) {
                    System.out.println("Hallo Meneer");
                    info = true;
                }else if (Objects.equals(geslacht, "vrouw")){
                    System.out.println("Hallo Mevrouw");
                    info = true;
                }else{
                    System.out.println("Dit geslacht komt niet voor in onze database probeer opnieuw!");
                    info = false;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        info = false;
        while (info == false){
            System.out.print("Vul uw leeftijd in:\t");
            leeftijd = input.nextInt();
            if(leeftijd <= 12 && Objects.equals(geslacht, "vrouw")){
                System.out.println("Hey jongedame, je hebt begeleiding nodig!\n ga na kleedkamer B1");
                info = true;
            }else if (leeftijd > 12 && Objects.equals(geslacht, "vrouw")){
                System.out.println("U heeft geen begeleiding nodig!\nU kunt na kleedkamer A1");
                info = true;
            }else if(leeftijd <= 12 && Objects.equals(geslacht, "man")){
                System.out.println("Hey jongeman, je hebt begeleiding nodig!\n ga na kleedkamer B2");
                info = true;
            }else if(leeftijd > 12 && Objects.equals(geslacht, "man")){
                System.out.println("U heeft geen begeleiding nodig!\nU kunt na kleedkamer A2");
                info = true;
            }else{
                System.out.println("Dat is geen leeftijd/getal!");
                info = false;
            }
        }

        System.out.println("Bedankt voor het kiezen voor onze service nog een prettige dag verder!");
    }
}
