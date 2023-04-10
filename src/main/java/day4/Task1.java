package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10 (включительно).
        // Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
        //а) Длине массива
        //б) Количестве чисел больше 8
        //в) Количестве чисел равных 1
        //г) Количестве четных чисел
        //д) Количестве нечетных чисел
        //е) Сумме всех элементов массива
        //
        //Пример:
        //Введено число 10. Сгенерирован следующий массив:
        //[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
        //
        //Информация о массиве:
        //Длина массива: 10
        //Количество чисел больше 8: 1
        //Количество чисел равных 1: 0
        //Количество четных чисел: 6
        //Количество нечетных чисел: 4
        //Сумма всех элементов массива: 46

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrays = new int[n];
        Random random = new Random();

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10);
        }

        System.out.println("Длина массива : " + Arrays.toString(arrays));
        System.out.println(arrays.length);

        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] > 8){
                count++;
            }
        }
        System.out.println("Количестве чисел больше 8: " + count);

        int count1 = 0;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] == 1){
                count1++;
            }
        }
        System.out.println("Количество чисел равных 1:" + count1);

        int count2 = 0;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] % 2 == 0){
                count2++;
            }
        }
        System.out.println("Количество четных чисел:" + count2);

        int count3 = 0;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] % 2 != 0){
                count3++;
            }
        }
        System.out.println("Количество четных чисел:" + count3);


        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
            }
        System.out.println("Сумма всех элементов массива: " + sum);




    }
}
