public class Weapons {
    Hero hero = new Hero();

    private int silaAtaku;

    public Weapons(int silaAtaku) {
        this.silaAtaku = silaAtaku;
    }

    public Weapons(){

    }

    public int getSilaAtaku() {
        return silaAtaku;
    }

    public void setSilaAtaku(int silaAtaku) {
        this.silaAtaku = silaAtaku;
    }

    public int nowaBron(Hero hero){
        hero.setAttackPower(hero.getAttackPower()+silaAtaku);
        return hero.getAttackPower();
    }
}
