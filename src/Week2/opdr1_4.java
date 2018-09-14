package Week2;

import java.util.Scanner;

public class opdr1_4 {

    public static void main (String[]args) {
        uitwerkingen intro = new uitwerkingen();
        intro.startup("Opdracht 1.4");

        double prijs;
        double btw;
        double xbtw;

        System.out.print("Vul een prijs in:\t");
        Scanner input = new Scanner(System.in);

        prijs = input.nextFloat();

        btw = prijs *  1.21;

        xbtw = btw-prijs;

        System.out.println("Prijs:"+"\t\t"+prijs);
        System.out.println("BTW:\t\t"+xbtw+" (21%)");
        System.out.println("Prijs+BTW:\t"+btw);



    }
}
