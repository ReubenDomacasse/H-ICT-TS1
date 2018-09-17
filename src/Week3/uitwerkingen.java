package Week3;

import java.util.Scanner;

public class uitwerkingen {

    private static void next(){
        int input;
        System.out.println("\nDruk op ENTER om verder te gaan");
        try{
            input = System.in.read();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    static void split(){
        String split = "\n#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#";
        System.out.println(split);
    }

    void startup(String naam_opdracht){
        split();
        System.out.println(naam_opdracht+"\n"+"-------------------------------------------------------------");

        switch (naam_opdracht){
            case "Opdracht 2.1":
                System.out.println("De gebruiker vult zijn of haar geslacht in. \nOok wordt de leeftijd ingevuld. \nSchrijf een programma naar welke kleedruimte je dient te gaan \nen of dat onder begeleiding moet (als je jonger dan 12 bent.)");
                break;
            case "Opdracht 2.2":
                System.out.println("");
                break;
            case "Opdracht 2.3":
                System.out.println("");
                break;
            case "Opdracht 2.4":
                System.out.println("");
                break;
            case "Opdracht 2.5":
                System.out.println("");
                break;
            case "Opdracht 2.6":
                System.out.println("");
                break;
            case "Opdracht 2.7":
                System.out.println("");
                break;
            case "Opdracht 2.8":
                System.out.println("");
                break;
            case "Opdracht 2.9":
                System.out.println("");
                break;
            case "Opdracht 2.10":
                System.out.println("");
                break;
            case "Opdracht 2.11":
                System.out.println("");
                break;
            case "Opdracht 2.12":
                System.out.println("");
                break;
            case "Opdracht 2.13":
                System.out.println("");
                break;
            default:
                System.out.println(" ");
        }
        System.out.println("-------------------------------------------------------------");
    }

    static void into(){
        System.out.println("HBO-ICT Huiswerkopdrachten Week 3\nAuthor:\t\tReuben Domacasse\nStud.no:\t15123804");
    }

    static void keuzemenu(){
        into();
        Scanner input = new Scanner(System.in);
        while(true) {
            split();
            for (int x = 1; x < 14; x++) {
                if (x == 3 || x ==10 || x == 11){
                    System.out.println(x + " = Challenge Opdracht 2." + x);
                }else if (x==12 || x==13){
                    System.out.println(x + " = Big Challenge Opdracht 2." + x);
                }else {
                    System.out.println(x + " = Opdracht 2." + x);
                }
            }
            System.out.println("Typ een getal in tussen 1-13 om opdracht uit te voeren");
            split();
            System.out.print("Typ \"S\" of STOP in om te stoppen\nWat ga je doen?\nJe besluit:\t");
            int keuze = 0;
            try {
                keuze = input.nextInt();
            } catch (Exception e) {
                System.out.println("Dat was geen getal!\nHet process wordt gestopt!");
                break;
            }


            switch (keuze) {
                case 1:
                    opdr2_1.main(null);
                    next();
                    break;
                case 2:
                    opdr2_2.main(null);
                    next();
                    break;
                case 3:
                    opdr2_3.main(null);
                    next();
                    break;
                case 4:
                    opdr2_4.main(null);
                    next();
                    break;
                case 5:
                    opdr2_5.main(null);
                    next();
                    break;
                case 6:
                    opdr2_6.main(null);
                    next();
                    break;
                case 7:
                    opdr2_7.main(null);
                    next();
                    break;
                case 8:
                    opdr2_8.main(null);
                    next();
                    break;
                case 9:
                    opdr2_9.main(null);
                    next();
                    break;
                case 10:
                    opdr2_10.main(null);
                    next();
                    break;
                case 11:
                    opdr2_11.main(null);
                    next();
                    break;
                case 12:
                    opdr2_12.main(null);
                    next();
                    break;
                case 13:
                    opdr2_12.main(null);
                    next();
                    break;
                default:
                    System.out.println("Dat is geen getal tussen 1-13!\n");
            }
        }

    }

    public static void main (String[]args){
        keuzemenu();
    }
}
