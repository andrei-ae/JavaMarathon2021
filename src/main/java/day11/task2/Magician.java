package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt;

    public Magician() {
        super(0, 80, 5);
        this.magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = magicAtt * (100 - hero.getMagicDef()) / 100;
        int newHealth = hero.getHealth() - damage;
        hero.setHealth(Math.max(newHealth, Hero.MIN_HEALTH));
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
