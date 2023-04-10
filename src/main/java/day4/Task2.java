package day4;

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        //Затем, используя цикл for each вывести в консоль:
        //наибольший элемент массива
        //наименьший элемент массива
        //количество элементов массива, оканчивающихся на 0
        //сумму элементов массива, оканчивающихся на 0
        //
        //Использовать сортировку запрещено.
        //
        //Рекомендация:
        //Для поиска наибольшего и наименьшего элемента массива переменные,
        // которые будут хранить эти значения необходимо либо инициализировать уже после заполнения массива, первым элементом этого массива
        //max =arr[0]
        //min = arr{0]
        //либо до массива, но самым "крайним" числом в диапазоне, т.е.
        //max = Integer.MIN_VALUE
        //min = Integer.MAX_VALUE
        //Это максимально универсальный подход.

        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

       int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }


        int max = 0;
        for(int arr2 : array){
            if(arr2 > max){
                max = arr2;
            }
        }
        System.out.println("Наименьший элемент массива : " + max);

        int min = 10000;
        for(int arr3 : array){
            if(arr3 <= min){
                min = arr3;
            }
        }
        System.out.println("Наименьший элемент массива : " + min);

        int number0 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0){
                number0++;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + number0);

        int number0Sum = 0;
        for (int ellement : array) {
            if (ellement % 10 == 0){
                number0Sum += ellement;
                number0++;
            }
        }
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + number0);

    }
}
