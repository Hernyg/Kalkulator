import java.lang.annotation.ElementType;
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("velkommen til terminal kalkulatoren, for å fortsette vennligst skriv 2 heltall");

        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        boolean tall1Loop = true;
        boolean tall2Loop = true;
        boolean gyldigInput = true;

        while(tall2Loop == true) {
            while (tall1Loop == true) {

                try {
                    String inputet = scanner.nextLine();
                    num1 = Double.parseDouble(inputet);
                    System.out.println("neste nummer");
                    tall1Loop = false;
                } catch (NumberFormatException e) {
                    System.out.println("FEIL skriv inn et gyldig nummer");
                }
            }

            try {
                String inputet = scanner.nextLine();
                num2 = Double.parseDouble(inputet);
                System.out.println("neste nummer");
                tall2Loop = false;
            }

            catch (NumberFormatException e) {
                System.out.println("FEIL skriv inn et gyldig nummer");
            }
        }
            System.out.println("nummer en er " + num1 + "nummer 2 er " + num2);

        System.out.println("For å fortsette vennligst velg ønsket regneopperasjon: +, - eller *");

        while (gyldigInput == true){
                String input = scanner.nextLine();
                //System.out.println(input);

                String regneopperasjon = input;
                //bestemmer regneopperasjonen brukeren ønsker å gjennomføre
                if (regneopperasjon.equals("+")){
                    System.out.println("du har valgt +");
                    System.out.println(num1 + " + " +  num2 + " = " + plus(num1,num2));
                }
                else if (regneopperasjon.equals("-")){
                    System.out.println("du har valgt -");
                    System.out.println(num1 + " - " +  num2 + " = " + minus(num1,num2));
                }
                else if (regneopperasjon.equals("*")){
                    System.out.println("du har valgt *");
                    System.out.println(num1 + " * " +  num2 + " = " + gange(num1,num2));
                }
                else{
                    System.out.println("vennligst skriv inn en gyldig regne opperasjon");
                }
                break;

            }

    }
    public static double plus (double tall1, double tall2){
        return (tall1 + tall2);
    }
    public static double minus (double tall1, double tall2){
        return (tall1 - tall2);
    }
    public static double gange (double tall1, double tall2){
        double x = tall1;
        double resultat = 0;
        for(double i =0; i < x; i++){
            resultat += tall2;
        }
        return resultat;
    }



}
