package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomCount  = random.nextInt(100) + 90;

        Player player;
        Player.info();

        while (Player.countPlayers < 5){
                player = new Player(randomCount);
        }

        player = new Player(randomCount);
        player.run();





    }
}
