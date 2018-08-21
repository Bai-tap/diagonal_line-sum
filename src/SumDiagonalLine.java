import java.util.Random;
import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        int[][] array = getSquareMatrix(getHeight(), getWidth());
        displayArray(array);
        System.out.println(getSumDiagonalLine(array));
    }

    private static int[][] getSquareMatrix(int height, int width) {
        int[][] array = new int[height][width];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rd.nextInt(100) + 1;
            }
        }
        return array;
    }

    private static int getHeight() {
        System.out.print("Nhập vào chiều rộng: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int getWidth() {
        System.out.print("Nhập vào chiều dài: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getSumDiagonalLine(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
