import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {


        System.out.println(plus(22,55));
        System.out.println(minus(10,6));
        System.out.println(gange(10,6));


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
    p


}
