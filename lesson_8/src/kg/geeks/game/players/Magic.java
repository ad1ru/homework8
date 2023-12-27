package kg.geeks.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getDamage() != 0) {
                hero.setDamage(hero.getDamage() + 5);
            }
        }
    }
}
