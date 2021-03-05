package com.geektech;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double mas1[] = {10.3, -11.2, 2.3, -4.4, 4.7, 5.3, -4.4, 1.3, 4.7, };
        double sum = 0;
        double counter = 0;
        boolean isFirstNegativeNumber = false;
        for (double num : mas1) {
            if (num < 0) {
                isFirstNegativeNumber = true;
            } else if (num > 0 && isFirstNegativeNumber) {
                sum+=num;
                counter++;
            }

        }
        System.out.println("Количество положительных чисел после первого отрицательного - " + counter);
        System.out.println("Среднее арифметическое " + sum / counter);


    }
}



