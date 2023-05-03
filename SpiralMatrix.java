import java.util.Scanner;

class SpiralMatrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input your rows and columns size");
        int row = obj.nextInt();
        int col = obj.nextInt();
        System.out.println("Input Arrays Elements");
        int array[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = obj.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Convert into Spiral Matrix");

        int toprow = 0;
        int botrow = row - 1;
        int rightC = 0;     
        int leftC = col - 1;
        while (toprow <= botrow && rightC <= leftC) {
            for (int i = rightC; i <= leftC; i++) {
                System.out.print(array[toprow][i] + " ");
            }

            toprow++;
            for (int i = toprow; i <= botrow; i++) {
                System.out.print(array[i][leftC] + " ");
            }

            leftC--;
            for (int i = leftC; i >= rightC; i--) {
                System.out.print(array[botrow][i] + " ");
            }

            botrow--;
            for (int i = botrow; i >= toprow; i--) {
                System.out.print(array[i][rightC] + " ");
            }

            rightC++;
            System.out.println();

        }
    }
}