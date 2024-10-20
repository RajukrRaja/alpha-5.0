package TwoDArray;

public class SpiralMatrix {

    public static void PrintSpiral(int Matrix[][])
    {
        int StartRow = 0;
        int StartCol = 0;
        int endRow = Matrix.length - 1;
        int endCol = Matrix[0].length - 1;

        while (StartRow <= endRow && StartCol <= endCol) {
            // Print top row
            for (int j = StartCol; j <= endCol; j++) {
                System.out.print(Matrix[StartRow][j] + " ");
            }
            StartRow++;

            // Print right column
            for (int i = StartRow; i <= endRow; i++) {
                System.out.print(Matrix[i][endCol] + " ");
            }
            endCol--;

            // Print bottom row
            if (StartRow <= endRow) {
                for (int j = endCol; j >= StartCol; j--) {
                    System.out.print(Matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // Print left column
            if (StartCol <= endCol) {
                for (int i = endRow; i >= StartRow; i--) {
                    System.out.print(Matrix[i][StartCol] + " ");
                }
                StartCol++;
            }
        }
    }

    public static void main(String[] args) {
        int Matrix[][] = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };

        PrintSpiral(Matrix);
    }
}
