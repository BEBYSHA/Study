public class SP4 {
    public static void main(String[] args){
        int[][] a = {{2,4,3},{1,2,8},{3,4,7}}, b = {{1,5,2},{8,12,4},{11,6,6}}, kali = new int [3][3];
        System.out.println("Matrix 1 ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(a [i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(b [i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Perkalian Matrix 3x3");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                kali[i][j] = 0;
                for(int k = 0; k < 3; k++){
                    kali[i][j] = kali[i][j] + a[i][k]*b[k][j];
                }
                System.out.print(kali[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
