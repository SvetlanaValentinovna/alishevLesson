package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1");
        int a = scanner.nextInt();
        System.out.println("Введите число 2");
        int b = scanner.nextInt();

        int i = a +1;
        while (i < b){
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
                i++;
            }
        }



    }
}
