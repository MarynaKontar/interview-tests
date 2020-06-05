package com.example.interviewtests;

// Є матриця розміру n x n, є n людей, якщо елемент матриці (i, j) = 1 ((i, j) == (j, i)), то людина i знайома з людиною j,
// чи можна розділити людей на 2 групи так, щоб в кожній з них були тільки незнайомі люди. Написати алгоритм розвязку.
public class SeparateMatrix {
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = new int[4][4];
        //    0  1  2  3

      // 0    0  5  5  1
      // 1    3  0  1  5
      // 2    3  1  0  5
      // 3    1  3  1  0

        matrix[0][0]=0;
        matrix[0][1]=5;
        matrix[0][2]=5;
        matrix[0][3]=1;
        matrix[1][0]=3;
        matrix[1][1]=0;
        matrix[1][2]=1;
        matrix[1][3]=5;
        matrix[2][0]=3;
        matrix[2][1]=1;
        matrix[2][2]=0;
        matrix[2][3]=5;
        matrix[3][0]=1;
        matrix[3][1]=3;
        matrix[3][2]=1;
        matrix[3][3]=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
                if(j==3) {
                    System.out.println("");
                }
            }
        }
        System.out.println("matrix length: " + matrix.length);
        System.out.println("square matrix size: " + matrix.length*matrix.length);
        System.out.println("upper matrix length: " + (matrix.length*matrix.length / 2 + matrix.length/2));
        System.out.println("bottom matrix length: " + (matrix.length*matrix.length / 2 - matrix.length/2));
        SeparatedMatrix separatedMatrix = separateUpperAndDownPartsOfMatrix(matrix);
        System.out.println("");
        System.out.println("upper matrix elements: ");
        for (int i = 0; i < separatedMatrix.getTopTriangleOfMatrix().length; i++) {
            System.out.print(separatedMatrix.getTopTriangleOfMatrix()[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("bottom matrix elements: ");
        for (int i = 0; i < separatedMatrix.getBottomTriangleOfMatrix().length; i++) {
            System.out.print(separatedMatrix.getBottomTriangleOfMatrix()[i] + " ");
        }
    }

    private static SeparatedMatrix separateUpperAndDownPartsOfMatrix(int[][] matrix) {
        SeparatedMatrix separatedMatrix = new SeparatedMatrix();
        int n = 0;
        int[] topTriangleOfMatrix = new int[matrix.length*matrix.length / 2 + matrix.length/2];
        int k = 0;
        int[] bottomTriangleOfMatrix = new int[matrix.length*matrix.length / 2 - matrix.length/2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i <= j) {
                    topTriangleOfMatrix[n] = matrix[i][j];
                    n+=1;
                } else {
                    bottomTriangleOfMatrix[k] = matrix[i][j];
                    k+=1;
                }
            }
        }
        separatedMatrix.setBottomTriangleOfMatrix(bottomTriangleOfMatrix);
        separatedMatrix.setTopTriangleOfMatrix(topTriangleOfMatrix);
        return separatedMatrix;
    }

    private static class SeparatedMatrix {
        int[] topTriangleOfMatrix;
        int[] bottomTriangleOfMatrix;

        int[] getTopTriangleOfMatrix() {
            return topTriangleOfMatrix;
        }

        void setTopTriangleOfMatrix(int[] topTriangleOfMatrix) {
            this.topTriangleOfMatrix = topTriangleOfMatrix;
        }

        int[] getBottomTriangleOfMatrix() {
            return bottomTriangleOfMatrix;
        }

        void setBottomTriangleOfMatrix(int[] bottomTriangleOfMatrix) {
            this.bottomTriangleOfMatrix = bottomTriangleOfMatrix;
        }
    }
}
