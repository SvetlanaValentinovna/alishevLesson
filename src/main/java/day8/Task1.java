package day8;

public class Task1 {
    public static void main(String[] args) {


        String countString = "";


        long startTime = System.currentTimeMillis();
            for (int i = 0; i <= 20000; i++) {
                countString += i + " ";
        }

       long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы String, в мс.: " + (stopTime-startTime));

        System.out.println(countString);



        StringBuilder sb = new StringBuilder("");

        startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }

        stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы StringBuilder, в мс.: " + (stopTime-startTime));

        System.out.println(sb);



    }
}
