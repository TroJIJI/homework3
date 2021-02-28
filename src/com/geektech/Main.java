package com.geektech;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double mas1[] = {10.3, 11.2, -2.3, -4.4, 4.7, 5.3, -4.4, 1.3, 4.7, 3.5, -2.4, -6.7, 4.5};
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] < 0) {
                System.out.println("Первое отрицательное число = " + mas1[i]);
                break;
            }

        }
        for (int i = 2; i < mas1.length; i++) {
            if (mas1[i] > 0) {
                sum = sum + mas1[i];
                counter++;
            }
        }
        System.out.println("Положительные числа после первого отрицательного - " + counter);
        System.out.println("Среднее арифметическое " + sum / counter);



    }
}



