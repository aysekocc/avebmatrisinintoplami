
package avebmatrisinintoplami;

public class Avebmatrisinintoplami {
    public static int dizitoplam (int[][] a,int [][] b ){
        int toplam=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                toplam=a[i][j]+b[i][j]+toplam;
            }
        }
   return toplam;
    }

    public static void main(String[] args) {
        // kendisine parametre olarak gelen 3x3lük a ve b matrisinin toplamını geri döndüren metod
    int a [][]= {{2,6,4},{5,6,9},{8,9,6}};
    int b[][]= {{2,6,4},{5,6,9},{8,9,6}};
    int d ;
    d = dizitoplam(a,b);
        System.out.println(d);
    
    
    
    
    
    }
    
}
