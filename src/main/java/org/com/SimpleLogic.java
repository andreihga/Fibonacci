package org.com;

import java.math.BigInteger;

public class SimpleLogic {
    public BigInteger startFibonacci(int n) {
        BigInteger[] numbers = new BigInteger[n + 1];
        numbers[0] = BigInteger.ZERO;
        numbers[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            numbers[i] = numbers[i - 1].add(numbers[i - 2]) ;
        }
        return numbers[n];
    }
}
