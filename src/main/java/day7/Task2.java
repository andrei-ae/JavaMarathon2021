package day7;

import java.util.Random;

public class Task2 {
    private static Random rand = new Random();
    private final static int MIN_START_STAMINA = 90;

    public static void main(String[] args) {

        Player player1 = createPlayer();
        Player player2 = createPlayer();
        Player player3 = createPlayer();
        Player player4 = createPlayer();
        Player player5 = createPlayer();
        Player player6 = createPlayer();

        while (player1.getStamina() > Player.MIN_STAMINA) {
            player1.run();
        }

        System.out.println(Player.getCountPlayers());
        Player.info();
    }

    private static Player createPlayer() {
        int stamina = rand.nextInt(Player.MAX_STAMINA + 1 - MIN_START_STAMINA) + MIN_START_STAMINA;

        return new Player(stamina);
    }
}
