package day7;

public class Player {
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    final static int FULL_COUNT = 6;

    private int stamina;

    private static int countPlayers = 0;

    public Player(int stamina) {
        if (countPlayers < FULL_COUNT) {
            this.stamina = stamina;
            countPlayers++;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;

            if (stamina == MIN_STAMINA && countPlayers > 0) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers < FULL_COUNT) {
            int nFree = FULL_COUNT - countPlayers;
            String freePlacesTxt;

            switch (nFree) {
                case 1:
                    freePlacesTxt = "свободное место";
                    break;
                case 5:
                    freePlacesTxt = "свободных мест";
                    break;
                default:
                    freePlacesTxt = "свободных места";
            }

            System.out.printf("Команды неполные. На поле еще есть %d %s", nFree, freePlacesTxt);
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
