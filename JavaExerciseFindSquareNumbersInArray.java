import java.util.Scanner;
import java.util.Random;

public class JavaExerciseFindSquareNumbersInArray {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        Random zFZGenerator = new Random();

        System.out.print("Bitte Länge des Arrays wählen: ");
        int l=eingabe.nextInt(); //oder eingabe.nextLine() mit Typumwandlung...

        int[] array = new int[l];
        for(int i=0; i<l; i++) {
            array[i]= zFZGenerator.nextInt(100);
        }

        int anzahl = 0;
        int produkt = 0;
        for (int i=0; i<l; i++) {
            for (int z=0; z<=100; z++) {
                produkt = (z*z);
                if ((array[i]) == produkt) {
                anzahl = anzahl + 1;
                }
            }
        }
        System.out.println("Das Array enthält " + anzahl + " Quadratzahlen.");
        eingabe.close();
    }

}

