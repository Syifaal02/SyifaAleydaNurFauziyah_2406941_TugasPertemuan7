/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas7;

import java.util.Scanner;

public class TestStopWatch {
    
    public static void main(String[] args) {

        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }
 
        StopWatch stopwatch = new StopWatch();
 
        stopwatch.start();

        selectionSort(numbers);

        stopwatch.stop();

        System.out.println("Waktu eksekusi pengurutan 100.000 angka: " 
                           + stopwatch.getElapsedTime() + " milidetik");
        System.out.println("Waktu eksekusi pengurutan 100.000 angka: " 
                           + (stopwatch.getElapsedTime() / 1000.0) + " detik");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            // Mencari indeks elemen minimum dalam sisa array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
