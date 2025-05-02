import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = methodeEx2.lectureN();
        int nbr = methodeEx2.compterchiff(n);
        System.out.println("l'entier " + n + " contient " + nbr + " chiffres ");

    }
}
