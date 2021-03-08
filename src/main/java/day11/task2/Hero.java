package day11.task2;

public abstract class Hero implements PhysAttack {
    protected final static int MIN_HEALTH = 0;
    protected final static int MAX_HEALTH = 100;
    protected int health = MAX_HEALTH;

    /**
     * процент поглощения физического урона
     */
    protected int physDef;

    /**
     * процент поглощения магического урона
     */
    protected int magicDef;

    /**
     * физическая атака, кол-во единиц
     */
    protected int physAtt;

    public Hero(int physDef, int magicDef, int physAtt) {
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage = physAtt * (100 - hero.getPhysDef()) / 100;
        int newHealth = hero.getHealth() - damage;
        hero.setHealth(Math.max(newHealth, MIN_HEALTH));
    }
}
