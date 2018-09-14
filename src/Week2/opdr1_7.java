package Week2;

import java.util.Scanner;

public class opdr1_7 {

    public static void main (String[]args) {
        uitwerkingen intro = new uitwerkingen();
        intro.startup("Opdracht 1.7");

        int secondes;
        int uur;
        int minuut;

        Scanner input = new Scanner(System.in);
        System.out.print("Vul het aantal secondes in:\t");
        secondes = input.nextInt();

        uur = secondes/3600;
        minuut = secondes/60;

        System.out.println("Secondes:\t"+secondes);
        System.out.println("Minuten:\t"+minuut);
        System.out.println("Uren:\t\t"+uur);

    }
}
