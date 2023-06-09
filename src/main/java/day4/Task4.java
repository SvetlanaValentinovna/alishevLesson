package day4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        //Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
        //
        //Пример:
        //*Для простоты пример показан на массиве размера 10
        //[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
        //
        //Тройка с максимальной суммой: [8742, 1040, 3254]
        //
        //Вывод в консоль:
        //13036
        //7
        //
        //*Пояснение. Первое число - сумма тройки [8742, 1040, 3254]. Второе число - индекс первого элемента тройки, то есть индекс числа 8742.

        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        int[] array = new int[100];
        Random random = new Random(10000);

        for (int i = 0; i < array.length; i++) {
            random.nextInt();
        }

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > count1){
                count1 += count1;
            } else if (count2 > count1) {
                count2 += count2;
            } else if (count3 > count2) {
                count3 += count3;
            }
            System.out.println(count1 + " " + count2 + " " + count3);
        }

    }
}
