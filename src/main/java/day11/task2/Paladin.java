package day11.task2;

public class Paladin extends Hero implements Healer {
    private final int HEAL_SELF_AMOUNT = 25;
    private final int HEAL_MATE_AMOUNT = 10;

    public Paladin() {
        super(50, 20, 15);
    }

    @Override
    public void healHimself() {
        int newHealth = getHealth() + HEAL_SELF_AMOUNT;
        health = Math.min(newHealth, Hero.MAX_HEALTH);
    }

    @Override
    public void healTeammate(Hero hero) {
        int newHealth = hero.getHealth() + HEAL_MATE_AMOUNT;
        hero.setHealth(Math.min(newHealth, Hero.MAX_HEALTH));
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
