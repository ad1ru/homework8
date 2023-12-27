package kg.geeks.game.players;

public class Witcher extends Hero {
    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.RELIVING, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() == 0 && this != hero) {
                hero.setHealth(hero.getHealth() + getHealth());
                setHealth(0);
                System.out.println("Witcher relived: " + hero.getName());
            }
        }
    }
}
