package Tugas_Modul_2;
public class no3 {
    public static void main(String[] args){
        int[][] matriks_b = {
            {11, 12, 13},
            {14, 15, 16}
        };
        int[][] matriks_c = {
            {17, 18},
            {19, 20},
            {21, 22}   
        };
        int baris_a = matriks_b.length;
        int kolom_a = matriks_b[0].length;
        int baris_b = matriks_c.length;
        int kolom_b = matriks_c[0].length;
        int[][] hasilKali = new int[baris_a][kolom_b];
             for (int i=0; i<baris_a; i++){
                 for (int j=0; j<kolom_b; j++){
                    for (int k=0; k<kolom_a; k++){
                        hasilKali[i][j] = matriks_b[i][j]*matriks_c[k][j];
                    }
                }
            }
            for(int[]x: hasilKali){
                for (int y: x){
                    System.out.print(y+" ");
                }
                System.out.println();
            }
        }    
    }
