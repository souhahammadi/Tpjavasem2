import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = methodeEx5.lectureN();
        double x = methodeEx5.lectureX();
        double p = methodeEx5.puissance(n, x);
        System.out.println("la puissance de " + x + " à la puissance " + n + " est " + p);
    }
}
