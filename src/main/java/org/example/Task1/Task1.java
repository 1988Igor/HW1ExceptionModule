package org.example.Task1;

import java.util.Arrays;


/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

public class Task1 {
    public static void main(String[] args) {

        int[] array1 = {15, 8, 4, 2, 5, 9};
        int[] array2 = {3, 4, 4, 2, 5};

        try {
            int[] result = difference(array1, array2);
            System.out.println(Arrays.toString(result));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int[] difference(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new ArrayIndexOutOfBoundsException("The length of arrays are different.");
        }

        int[] result = new int[array2.length];
        for (int i = 0; i < array1.length; i++) {

            result[i] = array1[i] - array2[i];

        }
        return result;

    }
}