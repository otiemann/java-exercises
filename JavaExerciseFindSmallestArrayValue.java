import java.util.Scanner;
import java.util.Random;

public class JavaExerciseFindSmallestArrayValue {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        Random zFZGenerator = new Random();

        System.out.print("Bitte Länge des Arrays wählen: ");
        int l=eingabe.nextInt(); //oder eingabe.nextLine() mit Typumwandlung...

        int[] array = new int[l];
        for(int i=0; i<l; i++) {
            array[i]= zFZGenerator.nextInt(100);
        }

        int speicher = array[0];
        for (int i=0; i<l; i++) {
            if (array[i]<speicher) {
                speicher = array[i];
            }
        }

        System.out.println("Der kleinste Wert im Array lautet: " + speicher);

        eingabe.close();
    }

}
