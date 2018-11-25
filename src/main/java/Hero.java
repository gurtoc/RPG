public class Hero implements IAttacOfHero {

    private int health;
    private int mana;
    private String name;
    private int attackPower;
    private String typAtaku;

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public Hero(int health, int mana, String name, int attackPower) {
        this.attackPower = attackPower;
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



    public Hero() {
    }

    public void getNameofObject(){
        System.out.println(getClass().getName());

    }

    public void CreatHero(){
        System.out.println("Jak masz na imię bohaterze?");
    }

    @Override
    public int StrongAttack() {
        System.out.println("Potężny atak!");
        return attackPower +20;
    }

    @Override
    public int WeakAttack() {
        System.out.println("Użycie slabego attacku");
        return attackPower/2;
    }




}
