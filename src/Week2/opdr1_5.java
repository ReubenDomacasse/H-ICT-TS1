package Week2;

import java.util.Scanner;

public class opdr1_5 {

    public static void main (String[]args) {
        uitwerkingen intro = new uitwerkingen();
        intro.startup("Opdracht 1.5");

        double getal1;
        double getal2;
        double getal3;

        double gemiddelde;

        Scanner input = new Scanner(System.in);

        System.out.println("vul 3 comma getallen in");
        System.out.print("getal 1:\t");
        getal1 = input.nextDouble();
        System.out.print("getal 2:\t");
        getal2 = input.nextDouble();
        System.out.print("getal 3:\t");
        getal3 = input.nextDouble();

        gemiddelde = getal1+getal2+getal3;

        System.out.println("gemiddelde:\t"+(gemiddelde/3));

    }
}
