import java.util.Scanner;
public class matrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] result = new int[2][2];

        System.out.println("Enter elements of Matrix A (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nChoose Operation:");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Multiplication");
        System.out.println("3. Transpose of Matrix A");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1: // Addition
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = A[i][j] + B[i][j];
                    }
                }
                System.out.println("Result of Matrix Addition:");
                printMatrix(result);
                break;

            case 2: // Multiplication
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            result[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
                System.out.println("Result of Matrix Multiplication:");
                printMatrix(result);
                break;

            case 3: // Transpose of A
                System.out.println("Transpose of Matrix A:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(A[j][i] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

    // Method to print matrix
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

