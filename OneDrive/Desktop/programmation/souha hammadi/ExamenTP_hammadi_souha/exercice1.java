package ExamenTP_hammadi_souha;
import java.util.*;
public class exercice1{
    public static double convertir(String ch){
        return Double.parseDouble(ch);
    }
public static void Remplirtab(int[][] M,int nl,int nc) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <nl; i++) {
            for (int j= 0; j<nc; j++){
                    System.out.println("donner M[" + i + "," + j + "]= ");
                    M[i][j] = sc.nextInt();
        } 
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
String text = " ";
double ch=convertir(text);
    System.out.println("donner une chaine" + ch);
ch=sc.nextDouble();


int nl,nc,i ,j;
int[][] M = new int[50][50];
            System.out.println("donner le nombre de lignes");
            nl = sc.nextInt();
            System.out.println("donner le nombre de colonnes");
            nc = sc.nextInt();
Remplirtab(M,nl,nc);
}
}