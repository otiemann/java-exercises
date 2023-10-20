import java.util.Scanner;
import java.util.Random;

public class JavaExerciseArrayFindItemsInRange {

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
        for (int i=0; i<l; i++) {
            if (array[i] >= 10 && array[i] <= 20) {
                anzahl = anzahl + 1;
            }
        }
        System.out.println("Das Array enthält " + anzahl + " Werte zwischen 10 und 20.");
        eingabe.close();
    }


}

