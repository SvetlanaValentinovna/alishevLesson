package day4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12,
        // n=8 (m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки,
        // сумма чисел в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
        //Пример сгенерированной матрицы (для простоты m=3, n=5):
        //
        //3 2 1 5 7 	// сумма - 18
        //1 2 5 6 2 	// сумма - 16
        //3 4 9 6 4	// сумма - 26
        //
        //Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        int [][] matrix = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
                //System.out.print(matrix[i][j] + " ");
            }
            //System.out.println();
        }

        int maxSum = 0; //максимальная сумма
        int maxSumIndx = 0;
        for (int i = 0; i < matrix.length; i++) { //идем по каждой строке, чтобы посчитать ее сумму
            int sum = 0; //это переменная для хранения суммы текущей строки, полученной в цикле  for (i)
            for (int j = 0; j < matrix[i].length; j++) { //идем по строкам, длина каждой строки = 8, т.к. мы такую задали в массиве
                sum += matrix[i][j]; // для каждой строки считаем сумму. Для текущей строки [i] для каждого столбца [j]
            }
            if (sum >= maxSum) { //знак >=, чтобы выводилось несколько сумм, если поставить только >, будет выводиться сумма одной строки
                maxSum = sum;
                maxSumIndx = i; //хранение индекса максимальной строки. [i] равено текущему индексу в for (int i = 0; i < matrix.length; i++)
            }
        }
            System.out.println("Сумма всех элементов вложенного массива: " + maxSumIndx);
















    }
}
