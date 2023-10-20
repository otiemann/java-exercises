import java.util.Scanner;

public class JavaExerciseForArrays {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte die Anzahl der Indizes eingeben: ");
        int anzahl = sc.nextInt();

        int[] zahlen = new int[anzahl];
        int i = anzahl;
        for (i = 0; i < anzahl; i++) {
            System.out.print("Bitte " + (i+1) + ". Zahl eingeben: ");
            zahlen[i] = sc.nextInt();
        }
        for (i = anzahl; i>0; i--) {
            System.out.println(i + ". Zahl: " + zahlen[i-1]);
        }
        sc.close();
    }
    
}