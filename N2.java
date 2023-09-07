package com.company;
import java.util.Random;
public class N2 {
    public static void main(String[] args) {
        int[] num = new int[2];
        Random random = new Random();

        int minNum = 10001;
        int minNum3 = 10001;
        int minNum7 = 10001;
        int minNum21 = 10001;

        int Num_min = 0;
        int Num_min_2 = 0;

        for(int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10000);
            if (num[i] < minNum) {
                minNum21 = minNum;
                minNum = num[i];
            } else if (num[i] < minNum21) {
                minNum21 = num[i];
            }

            if (num[i] % 3 == 0 && num[i] < minNum3) {
                minNum3 = num[i];
            }

            if (num[i] % 7 == 0 && num[i] < minNum7) {
                minNum7 = num[i];
            }
        }

        if (minNum != 10001 && minNum21 != 10001) {
            Num_min = minNum * minNum21;
        }

        if (minNum3 != 10001 && minNum7 != 10001) {
            Num_min_2 = minNum3 * minNum7;
        }

        int res = Math.max(Num_min, Num_min_2);

        if (res == 0) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }
    }
}