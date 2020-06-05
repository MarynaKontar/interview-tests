package com.example.interviewtests;

// Написати програму для обчислення формули: S = 1 + 1/2! + 1/3! + ... + 1/n!
public class InverseFactorial {

    public static void main(String[] args) {
        System.out.println(getInverseFactorial2(20)); // 1 + 1/2 + 1/3 + 1/4 + 1/5
        System.out.println(getInverseFactorial3(20, 0)); // 1 + 1/2 + 1/3 + 1/4 + 1/5
        System.out.println(getInverseFactorial4(20)); // 1 + 1/2 + 1/3 + 1/4 + 1/5
    }

    // S = 1 + 1/2! + 1/3! + ... + 1/n!
    private static double getInverseFactorial(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException(n + "must be positive integer");
        }

        double sum = 0;
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial = factorial * i; // 1*1, 1*2, 1*2*3, 1*2*3*4, 1*1*2*3*4*5
//            System.out.println("fact: " + factorial);
//            System.out.println("1/fact: " + 1/factorial);
//            System.out.println("(double)1/fact: " + (double)1/factorial);
            sum = sum + (double) 1/factorial; // 0 + 1/1 + 1/(1*2) + 1/(1*2*3) + 1/(1*2*3*4) + 1/(1*2*3*4*5)
//            System.out.println("sum: " + sum);
        }
        return 1+ sum;
    }

    private static double getInverseFactorial2(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException(n + "must be positive integer");
        }

        double sum = 0;
        double inverseFactorial = 1;
        for (int i = 1; i < n; i++) {
            inverseFactorial = inverseFactorial * (double) 1/i; // 1*1/1, 1*1/2, 1*/1/2*1/3, 1*1/2*1/3*1/4, 1*1/2*1/3*1/4*1/5
            System.out.println("1/fact: " + inverseFactorial);
            sum = sum + inverseFactorial; // 0 + 1/1 + 1/(1*2) + 1/(1*2*3) + 1/(1*2*3*4) + 1/(1*2*3*4*5)
            System.out.println("sum: " + sum);
        }
        return 1 + sum;
    }

    private static double getInverseFactorial3(int n, double sum) { // 0 + (4, 1/5) +  (3, 1/4) + (2, 1/3) + (1, 1/2) + (0, 1/1)
        if (n <= 0) {
            throw new IllegalArgumentException(n + "must be positive integer");
        }
        System.out.println("n: " + n);
//        double inverseFactorial = 1;
        while (n > 0) {
            sum = sum * 1/n;
            System.out.println("1/n!: " + sum + "; sum: " + sum);
            return getInverseFactorial3(n-1, sum + (double) 1/n);
        }
        return 1+ sum;
    }


    public static double getInverseFactorial4(int n){  // n >= 1
        if (n <= 0) {
            throw new IllegalArgumentException(n + "must be positive integer");
        }

        int fact=1;  double sum=0;

        for (int i=1; i<=n; i++){

            fact = fact * i;

            sum += (double) 1/fact;

        }
        System.out.println("aaaaa " + sum  + "jjj " + Math.E);
        return sum+1;   // add the 1/0! into the sum to create natural exponential e

    }
}
