public class Rat extends Creature {

    int attack;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Rat(int health, int mana, String name, int attack) {
        super(health, mana, name);
        this.attack = attack;
    }

    public Rat(int health, int mana, String name) {
        super(health, mana, name);
    }


}
