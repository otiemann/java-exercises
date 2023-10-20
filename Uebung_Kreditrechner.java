import java.util.Scanner;
import java.lang.Math;

public class Uebung_Kreditrechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Kreditbetrag eingeben: ");
        double kreditbetrag = scanner.nextFloat();
        System.out.println(kreditrechner(kreditbetrag));
        scanner.close();
    }

    private static double round(double value, int decimalPoints) {
        double d = Math.pow(10, decimalPoints);
        return Math.round(value * d) / d;
    }
    public static double kreditrechner(double p_kreditbetrag) {
        double kreditbetrag = p_kreditbetrag;
        if (kreditbetrag >= 1000) {
            double tilgung = kreditbetrag * 0.20;
            System.out.print("Restlicher Kreditbetrag: " + round(kreditbetrag, 2));
            System.out.println(", Tilgung: " + round(tilgung, 2));
            kreditbetrag = kreditbetrag - tilgung;
            return kreditrechner(kreditbetrag);
        }
            return 0;
        
    }
        
    }

