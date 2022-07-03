package com.example.first_level_task1;

public class masala_2 {
    public static void main(String[] args) {

        // PROBLEM INFINITY
        int N = (int) (Math.random() * ((1018 - 1) + 1)) + 1;
        System.out.println(N);

        float number = primesMultiply(N);
//        System.out.println(number);

        countZeros(number);
    }

    private static void countZeros(float x) {
        int counter = 0;
        while (x % 10 == 0) {
            counter++;
            x /= 10;
        }
        System.out.println("nollar soni: " + counter);
    }

    private static float primesMultiply(int num) {
        float s = 6;

        if (num < 5) return 1;

        for (int j = 5; j <= num; j++) {

            boolean flag = false;
            for (int i = 2; i <= j / 2; ++i) {
                if (j % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
//                System.out.println(j);
                s = s * j;
            }
        }
        System.out.println("s = " + s);
        return s;
    }
}

