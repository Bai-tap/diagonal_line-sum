import java.util.Random;
import java.util.Scanner;


public class SumDiagonalLine {
    public static void main(String[] args) {
        for (int i = 0; i < getArray().length; i++) {
            for (int j = 0; j < getArray(i).length; j++) {
                System.out.println(getArray()[i][j]) + "/t");
            }
            System.out.println();
        }
    }

    private static int[][] getArray() {
        int[][] array = new int[getSize()][getSize()];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rd.nextInt(100);
            }
        }
        return array;
    }

    private static int getSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 cạnh của hình vuông: ");
        return sc.nextInt();
    }

    private static int getSumDionalLine(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum +=array[i][j];
            }
        }
        return sum;
    }
}
