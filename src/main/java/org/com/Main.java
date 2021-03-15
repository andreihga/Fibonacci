package org.com;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SimpleLogic logic = new SimpleLogic();
        long start = System.currentTimeMillis();
        BigInteger fibonacci = logic.startFibonacci(250);
        long end = System.currentTimeMillis();

        System.out.println("The result is " + fibonacci + " and it took " + (end - start) + " millis");

        Recursive recursive = new Recursive();
        long start1 = System.currentTimeMillis();
        long fibonacci1 = recursive.recursiveFibonacci(10);
        long end1 = System.currentTimeMillis();
        System.out.println("The result is " + fibonacci1 + " and it took " + (end1 - start1) + " millis");

        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
        long start2 = System.currentTimeMillis();
        long fibonacci2 = matrixMultiplication.getFib(20);
        long end2 = System.currentTimeMillis();
        System.out.println("The result is " + fibonacci2 + " and it took " + (end2 - start2) + " millis");
    }

}
