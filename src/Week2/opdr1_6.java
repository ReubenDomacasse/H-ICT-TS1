package Week2;

import java.util.Scanner;

public class opdr1_6 {

    public static void main (String[]args) {
        uitwerkingen intro = new uitwerkingen();
        intro.startup("Opdracht 1.6");

        double euro;
        double dollar;

        double koers = 1.160544;

        Scanner input = new Scanner(System.in);

        System.out.print("Vul het aantal euro's in:\t");
        euro = input.nextDouble();

        dollar = euro * koers;

        System.out.println("€"+euro+" = $"+(int)dollar);
    }
}
