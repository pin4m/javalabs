package lab2;

/**
 * Created by pin4m on 11.11.2020.
 */

import java.util.Scanner;

public class MatrixTwo {
    private static final int LOW = 0;
    private static final int HIGH = 15;

    /*
     * Create RANDOM Value for MATRIX
     */
    private static int[][] randomCreate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (HIGH - LOW) + LOW);
            }
        }

        return matrix;
    }

    /*
     * Create MANUAL Value for MATRIX
     */
    private static int[][] manualCreate(int[][] matrix) {
        Scanner scanManualCreateMatrix = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + i + ":" + j + "] - ");
                matrix[i][j] = scanManualCreateMatrix.nextInt();
            }
        }

        return matrix;
    }

    /*
     * PrintScreen for MATRIX
     */
    private static void printScreenMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    /*
     * Find MAX Value
     */
    private static int maxValue(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    /*
     * Find MIN Value
     */
    private static int minValue(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
    }

    /*
     * Find Arithmetic MEAN
     */
    private static double arithmeticMean(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        double count = matrix.length * matrix[0].length;
        double arithmeticMeanValue = sum / count;

        return arithmeticMeanValue;
    }

    /*
     * Find Geometric MEAN
     */
    private static double geometricMean(int[][] matrix) {
        int product = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                product *= matrix[i][j];
            }
        }

        double power = 1 / (double) (matrix.length * matrix[0].length);
        double geometricMeanValue = Math.pow(product, power);

        return geometricMeanValue;
    }

    /*
     * GO Point
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter height: ");
        int matrixHeight = scan.nextInt();

        System.out.print("\nEnter width: ");
        int matrixWidth = scan.nextInt();

        int[][] matrix = new int[matrixHeight][matrixWidth];

        System.out.print("What EnterVoid Do You Choose (RANDOM - 0 | HANDMADE - 1): ");
        int choose = scan.nextInt();

        switch (choose) {

            case 0:
                matrix = randomCreate(matrix);
                break;
            case 1:
                matrix = manualCreate(matrix);
                break;
            default:
                System.out.println("That is bad, buddy, try again");
        }

        printScreenMatrix(matrix);

        System.out.println("MAX Value: " + maxValue(matrix));
        System.out.println("MIN Value: " + minValue(matrix));
        System.out.println("MEAN Arithmetic: " + arithmeticMean(matrix));
        System.out.println("MEAN Geometric: " + geometricMean(matrix));
    }
}