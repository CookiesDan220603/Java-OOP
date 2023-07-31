import java.util.*;

public class Lab3Ex2 {

    public static void multiplyMatrixwithNumber(int matrix[][], int row, int column, int number) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] *= number;
            }
        }
        outputMatrix(matrix, row, column);
    }

    public static void inputMatrix(Scanner sc, int matrix[][], int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter the [%d][%d] element: ", i + 1, j + 1);
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void outputMatrix(int matrix[][], int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addMatrix(int firstMatrix[][], int secondMatrix[][], int row, int column) {
        int[][] sumMatrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        outputMatrix(sumMatrix, row, column);
    }

    public static void main(String[] args) {
        int[][] firstMatrix = new int[30][30];
        int[][] secondMatrix = new int[30][30];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of matrix: ");
        int row = sc.nextInt();
        System.out.print("Enter the column of matrix: ");
        int column = sc.nextInt();
        System.out.println("Enter element of first matrix: ");
        inputMatrix(sc, firstMatrix, row, column);
        System.out.println("Enter element of second matrix: ");
        inputMatrix(sc, secondMatrix, row, column);
        System.out.println("First matrix add second matrix: ");
        addMatrix(firstMatrix, secondMatrix, row, column);
        System.out.println("Enter the third matrix: ");
        int[][] thirdMatrix = new int[30][30];
        inputMatrix(sc, thirdMatrix, row, column);
        System.out.print("Enter the number you want to multiply with matrix: ");
        int number = sc.nextInt();
        System.out.println("Third matrix after multiply with " + number + " :");
        multiplyMatrixwithNumber(thirdMatrix, row, column, number);
        sc.close();
    }
}
