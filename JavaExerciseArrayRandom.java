import java.util.Scanner;
import java.util.Random;

public class JavaExerciseArrayRandom {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        Random zFZGenerator = new Random();

        System.out.print("Bitte Länge des Arrays wählen: ");
        int l=eingabe.nextInt(); //oder eingabe.nextLine() mit Typumwandlung...

        int[] array = new int[l];
        for(int i=0; i<l; i++) {
            array[i]= zFZGenerator.nextInt(100);
        }

        for (int i=0; i<l; i++) {
            System.out.println(array[i]);
            }

        eingabe.close();
        }


}
