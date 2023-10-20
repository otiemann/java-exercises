import java.util.Scanner;

public class JavaGeneratePowerOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Anzahl eingeben: ");
        int anzahl = sc.nextInt();
        int[] array1 = new int[anzahl];
        int[] array2 = new int[anzahl];
        int[] array3 = new int[anzahl*2];
        int zweierpotenz = 1;
        int zahl = 1;
        int zahl2 = 1;

        for (int i=0; i<anzahl; i++) {
            array1[i] = zahl*zahl;
            zahl = zahl+1;
            }

        for (int i=0; i<anzahl; i++) {
            zweierpotenz = (int)Math.pow(2, zahl2);
            zahl2 = zahl2 + 1;
            array2[i] = zweierpotenz;
        }

        for (int i=0; i<anzahl; i++) {
            int schritt1 = i*2;
            int schritt2 = schritt1+1;
            array3[schritt1] = array1[i];
            array3[schritt2] = array2[i];
        }

        for (int i=0; i<anzahl; i++) {
            System.out.print(array3[i] + " ");
        }
        sc.close();
    }

}

