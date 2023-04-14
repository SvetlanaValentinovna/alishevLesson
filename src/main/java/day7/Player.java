package day7;

public class Player {
    private int stamina; //выносливость

    public Player(int stamina) {
        this.stamina = stamina;


    }

    private static final int MAX_STAMINA = 100; //мах выносливость
    private static final int MIN_STAMINA = 0;  //мин выносливость

    public static int countPlayers; //считает количество игроков

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        this.stamina--;
        for (int i = MAX_STAMINA; i > MIN_STAMINA; i--) {
            countPlayers--;
        }

    }

    public static void info(){
        if(countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть " + (6 -countPlayers) + " свободных мест");
        }else {
            System.out.println("На поле нет свободных мест");
        }
    }


}
