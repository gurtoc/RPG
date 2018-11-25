import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Hero shadya = new Hero();
        Story story = new Story(shadya);
        boolean wrongInput = false;
        Weapons weapons = new Weapons(5);

        Rat rat = new Rat(10, 0, "Szczurek", 1);

        story.begginingOfStory();


        System.out.println("Podaj swe imie bohaterze!");
        Scanner scanner = new Scanner(System.in);

        shadya.setName(scanner.next());

        System.out.println("Witaj " + shadya.getName() + " podaj swoją energię życiową");

        while (!wrongInput) {
            try {
                int kupa = scanner.nextInt();
                shadya.setHealth(kupa);
                wrongInput=true;
            } catch (InputMismatchException e) {
                // e.printStackTrace();
                System.out.println("Nieprawidłowa wartość");
                scanner.next();
            }
        }


        System.out.println("podaj swoją energię duchową");
        shadya.setMana(scanner.nextInt());
        System.out.println("podaj swoją siłę ataku");
        shadya.setAttackPower(scanner.nextInt());
        //scanner.close();

        System.out.println("A więc " + shadya.getName() + " twoje życia to " + shadya.getHealth() + " twoja mana to: " + shadya.getMana() + " a siła ataku to: " + shadya.getAttackPower());
        System.out.println();

        story.quest1();
        System.out.println();


        if (shadya.WeakAttack() > rat.getHealth()) {
            System.out.println(shadya.getName() + " zabiła szczura w spiżarni jednym ciosem");
        } else {
            System.out.println("Za słąby atak - szczur przeżył");
            double hpAfterAttack = rat.getHealth() - shadya.WeakAttack();
            double hpHeroAfterAttack = shadya.getHealth() - rat.getAttack();
            System.out.println("Szczur ma: " + hpAfterAttack + " hp");
            do {
                Thread.sleep(1000);
                hpAfterAttack = hpAfterAttack - shadya.WeakAttack();

                hpHeroAfterAttack = hpHeroAfterAttack - rat.getAttack();
                System.out.println(rat.getName() + " kontratakuje! " + shadya.getName() + " ma " + hpHeroAfterAttack + " hp");

                System.out.println(shadya.getName() + " ponawia atak! Szczur ma: " + hpAfterAttack + " hp");
                System.out.println();


            } while (hpHeroAfterAttack >= 0 && hpAfterAttack >= 0);

            System.out.println("szczur nie żyje!");
            System.out.println();

        }

        story.quest1Complete();
        story.quest1Reward();

        story.punktyDoRozdania(20);

    }
}
