import java.util.Scanner;

public class JavaExerciseNotenverwaltung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte die Anzahl der Schüler/innen eingeben: ");
        int note1 = 0;
        int note2 = 0;
        int note3 = 0;
        int note4 = 0;
        int note5 = 0;
        int note6 = 0;
        double summe = 0;
        int unter_schnitt = 0;
        int anzahl_schueler = sc.nextInt();
        int noten[] = new int[anzahl_schueler];
        for (int i=0; i<anzahl_schueler; i++) {
            System.out.print("Bitte die Note für den/die " + (i+1) + ". Schüler/in eingeben: ");
            noten[i] = sc.nextInt();
            summe = summe + noten[i];
            if (noten[i] > 4) {
                unter_schnitt = unter_schnitt + 1;
            }
            if (noten[i] == 1) {
                note1 = note1 + 1;
            }
            if (noten[i] == 2) {
                note2 = note2 + 1;
            }
            if (noten[i] == 3) {
                note3 = note3 + 1;
            }
            if (noten[i] == 4) {
                note4 = note4 + 1;
            }
            if (noten[i] == 5) {
                note5 = note5 + 1;
            }
            if (noten[i] == 6) {
                note6 = note6 + 1;
            }
        }
        double durchschnitt = summe / anzahl_schueler;
        System.out.println("Anzahl der Note 1: " + note1);
        System.out.println("Anzahl der Note 2: " + note2);
        System.out.println("Anzahl der Note 3: " + note3);
        System.out.println("Anzahl der Note 4: " + note4);
        System.out.println("Anzahl der Note 5: " + note5);
        System.out.println("Anzahl der Note 6: " + note6);
        System.out.println("Der Durchschnitt ist: " + durchschnitt);
        if (unter_schnitt > (anzahl_schueler/2)) {
            System.out.print("ACHTUNG: Mehr als die Hälfte der Schüler/innen ist unter dem Schnitt!");
        }
        sc.close();
    }
}
