package com.example.first_level_task1;

import java.util.Arrays;

public class masala_1 {
    public static void main(String[] args) {
        short[][] array = new short[7][7];

        short x = (short) (Math.random() * (7 + 1));
        short y = (short) (Math.random() * (7 + 1));

//        System.out.println(x);
//        System.out.println(y);
        array[x][y] = 1;

//        System.out.println(Arrays.deepToString(array));

        findCenter(array);
    }

    private static void findCenter(short[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] == 1) {
                    System.out.println(Math.abs(3 - i) + Math.abs(3 - j));
                }
    }
}
