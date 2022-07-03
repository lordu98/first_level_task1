package com.example.first_level_task1;

public class masala_2 {
    public static void main(String[] args) {

        int N = (int)(Math.random() * ((1018 - 1) + 1)) + 1;
        System.out.println(N);

        long number = primesMultiply(N);
//        System.out.println(number);

        countZeros(number);
    }

    private static void countZeros(long x) {
        int counter = 0;
        while (x % 10 == 0) {
            counter++;
            x /= 10;
        }
        System.out.println("nollar soni: " + counter);
    }

    private static long primesMultiply(int num) {
        long s = 1;

        for (int j = 2; j <= num; j++) {

            boolean flag = false;
            for (int i = 2; i <= j / 2; ++i) {
                if (j % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                s = s * j;
        }
        System.out.println("s = " + s);
        return s;
    }
}

