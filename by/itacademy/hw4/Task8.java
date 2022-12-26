package by.itacademy.hw4;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {11, 3, 14, 16, 7, 7, 4, 8, 10};
        System.out.println("Изначальный массив: ");
        System.out.println(Arrays.toString(array));
        sortChoice(array);
    }
        private static void sortBubble(int[] array){
            boolean isSorted = false;
            int bubble;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;
                        bubble = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = bubble;
                    }
                }
            }
            System.out.println("сортированный: ");
            System.out.println(Arrays.toString(array));
        }
        private static void sortInsert(int[] array){
            for (int left = 0; left < array.length; left++) {
                int value = array[left];
                int i = left - 1;
                for (; i >= 0; i--) {
                    if (value < array[i]) {
                        array[i + 1] = array[i];
                    } else {
                        break;
                    }
                }
                array[i + 1] = value;
            }
            System.out.println("сортированный: ");
            System.out.println(Arrays.toString(array));
        }
        private static void sortChoice(int[] array){
            for (int i = 0; i < array.length; i++) {
                int pos = i;
                int min = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        pos = j;
                        min = array[j];
                    }
                }
                array[pos] = array[i];
                array[i] = min;
            }
            System.out.println("сортированный: ");
            System.out.println(Arrays.toString(array));
        }

    }


