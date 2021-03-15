package org.com;

import java.util.Arrays;

public class MatrixMultiplication {

    public long getFib(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
        }

        long[][] matrix = new long[2][2];
        long[][] multipliedMatrix = matrix;

        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 0;

        int count = 3;

        while (count != n) {
            long[][] thirdMatrix = new long[2][2];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < multipliedMatrix.length; j++) {
                    for (int k = 0; k < multipliedMatrix.length; k++) {
                        thirdMatrix[i][j] += multipliedMatrix[i][k] * matrix[k][j];
                    }
                }
            }
            count++;
            multipliedMatrix = thirdMatrix;
//            System.out.println(Arrays.toString(thirdMatrix[0]) + " " + Arrays.toString(thirdMatrix[1]));
        }
        return multipliedMatrix[0][0];
    }
}
