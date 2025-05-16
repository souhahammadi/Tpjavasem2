package ExamenTP_hammadi_souha;

import java.util.*;
public class exercice2{
    public static String dimension(String[][] VOL){
        Scanner sc=new Scanner  (System.in);
        int  nl,nc;
        do{
            System.out.println("donner le nombre de ligne");
nl=sc.nextInt();
System.out.println("donner le nomber de colone ");
nc=sc.nextInt();
        }while(nl>50 || nc>50);
return dimension(VOL);
    }
    public static void aff(String [][] VOL){
        Scanner sc=new Scanner(System.in);
        String vl;
        char vil;
        System.out.println("donner une ville vl =");
        vl = sc.nextLine();
        System.out.println("donner le ville rechercher vil =");
        vil = sc.next().charAt(0);
        int Nbr_occur = 0;
        int nl = 0, nc=0;
        String num_ville;
        for (int i = 0; i < vl.length(); i++){
            if (vl.charAt(i) == vil){
System.out.println("voila la ville qui a rechercher");
            }else{
                System.out.println("erreur");
            }
        }
        for(int i=0;i<nl;i++){
            for(int j=0;j<nc;j++){
                System.out.println("donner VOL[" + i + "][" + j + "]=");
            }
        }
            }
            public static void remise(String [][] VOL,int nl,int nc){
                double prix=0;
for (int i=0; i<nl ; i++) {
for (int j=0 ;j<nc; j++) {
    prix=prix*0.8;
}
}
return ;
            }
             public static void afficherTab(String[][] VOL , int nl , int nc) {
                  Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nl; i++) {
             for (int j= 0; j<nc; j++){
            System.out.println("donner VOL[" + i + "," + j + "]= ");
            VOL[i][j] = sc.nextLine();
        }}
        System.out.println();
    }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int nl,nc;
                 System.out.println("donner le nombre de lignes");
            nl = sc.nextInt();
            System.out.println("donner le nombre de colonnes");
            nc = sc.nextInt();
int i ,j;
String[][] VOL = new String[50][50];
aff(VOL);
afficherTab(VOL, nl, nc);
String resul=dimension(VOL);
            }
        }
 
