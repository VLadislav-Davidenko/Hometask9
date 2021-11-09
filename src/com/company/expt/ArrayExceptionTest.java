package com.company.expt;

public class ArrayExceptionTest {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};

        printArray(arr,1,5);
        System.out.println("=".repeat(20));
        printArray(arr, 3,9);
        System.out.println("=".repeat(20));
        printArray(arr, -1,4);

    }

    public static void printArray(int[] arr, int start, int end) {
        try {
            while (start <= end) {
                System.out.println(start + ") " + arr[start]);
                start++;

            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка. Попытка обращения к несуществующему индексу: текущий индекс = " + start +"; размер массива = " + arr.length + ";");
        }

    }
}
