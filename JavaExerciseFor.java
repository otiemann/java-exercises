import java.util.Scanner;

public class JavaExerciseFor {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] zahlen = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Bitte " + (i+1) + ". Zahl eingeben: ");
            zahlen[i] = sc.nextInt();
        }
        for (int i = 9; i>-1; i--) {
            System.out.println(i+1 + ". Zahl: " + zahlen[i]);
        }
        sc.close();
    }

}
