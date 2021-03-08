package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private final int HEAL_SELF_AMOUNT = 50;
    private final int HEAL_MATE_AMOUNT = 30;

    private int magicAtt;

    public Shaman() {
        super(20, 20, 10);
        this.magicAtt = 15;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = magicAtt * (100 - hero.getMagicDef()) / 100;
        int newHealth = hero.getHealth() - damage;
        hero.setHealth(Math.max(newHealth, Hero.MIN_HEALTH));
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
