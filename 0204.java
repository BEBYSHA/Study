import java.util.Random;
import java.util.Scanner;

public class No4 {

    static double jarak(int x1, int y1, int x2, int y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public static void main(String[] args ) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int x, y;
        System.out.print("Masukkan X : ");
        x = scan.nextInt();
        System.out.print("Masukkan Y : ");
        y = scan.nextInt();

        System.out.println("====================");

        int[][] dots = new int [10][3];
        for (int i = 0; i < dots.length; i++) {
            dots[i][2] = i+1;
            for (int j = 0; j < (dots[i].length-1); j++) {
                dots[i][j] = random.nextInt(-11, 11);
            }
        }

        double[][] result = new double[10][4];
        for (int i=0; i < dots.length; i++) {
            result[i][0] = jarak(dots[i][0], dots[i][1], x, y);
            result[i][1] = dots[i][2];
            result[i][2] = dots[i][0];
            result[i][3] = dots[i][1];
            System.out.println("x= " + dots[i][0] + ", y= " + dots[i][0] + "titik ke-" + dots[i][2]);
        }

        double[] temp;
        for (int i=0; i < result.length-1; i++) {
            for (int j=0; j < result.length-i-1; j++) {
                if (result[j][0] > result[j+1][0]) {
                    temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] =  temp;
                }
            }
        }

        System.out.println("\nUrutan dari titik (Xa, ya) (" + x + ", " + y + ") =\n");

        int i = 0;
        for (double[] res : result) {
            System.out.print((++i) + ". Titik no. "+ (int) res[1] + " (" + (int) res[2] + ", " + (int) res[3] + ") " + " dengan jarak = ");
            System.out.printf("%.2f", res[0]);
            System.out.println();
            System.out.println("=================");
        }

    }
    }
