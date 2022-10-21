public class SP3 {
    public static void main(String[] args) {
        int[][] no1 = {{2,3},{8,1}}, no2 = {{6,5},{7,9}}, kurang = new int [2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                kurang[i][j] = no1[i][j] - no2[i][j];
                System.out.print(kurang[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}