package com.company;
import java.util.Random;

public class N1 {
    public static void main(String[] args) {
        int[] num = new int[1000];
        Random random = new Random();

        int maxNum = 0;
        int maxNum2= 0;
        int maxNum7 = 0;
        int maxNum14 = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10000);

            if (num[i] > maxNum) {
                maxNum = num[i];
            }

            if (num[i] % 2 == 0) {
                if (num[i] > maxNum2) {
                    maxNum2 = num[i];
                }
                if (num[i] % 7 == 0) {
                    if (num[i] > maxNum7) {
                        maxNum7 = num[i];
                    }
                    if (num[i] % 14 == 0 && num[i] > maxNum14) {
                        maxNum14 = num[i];
                    }
                }
            }
        }

        int maxMultiple14 = maxNum * maxNum14;
        int MaxMultiple7 = maxNum2 * maxNum7;

        if (maxMultiple14 == 0 && MaxMultiple7 == 0) {
            System.out.println(-1);
        } else {
            System.out.println(Math.max(maxMultiple14,MaxMultiple7));
        }
    }
}