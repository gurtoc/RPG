public class Creature implements  IAttack
{
    private int health;
    private int mana;
    private String name;

    public Creature(int health, int mana, String name) {
        this.health = health;
        this.mana = mana;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("do ataku!!");
    }

    @Override
    public void retreat() {
        System.out.println("Wycofać!! Uciekac!!");
    }
}
