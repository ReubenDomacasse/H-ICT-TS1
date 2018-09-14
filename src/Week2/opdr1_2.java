package Week2;

import java.util.Scanner;

public class opdr1_2 {

    public static void main (String[]args){
        uitwerkingen intro = new uitwerkingen();
        intro.startup("Opdracht 1.2");

        Scanner input = new Scanner(System.in);

            System.out.print("\nvul het eerste getal in (tussen 1-10):\t");
            int getal1 = input.nextInt();
            if (getal1 <= 10){
                System.out.print("vul het tweed1e getal in (tussen 1-10):\t");
                int getal2 = input.nextInt();
                if (getal2 <=10){
                    int uitkomst = getal1+getal2;
                    System.out.println("de berekening:\t"+getal1+" + "+getal2);
                    System.out.println("de uitkomst:\t"+uitkomst);
                }else {
                    System.out.println("Dat was geen getal onder de 10");
                }
            }else {
                System.out.println("Dat was geen getal onder de 10");
            }
    }
}
