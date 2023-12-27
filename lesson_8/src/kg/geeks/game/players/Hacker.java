package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Hacker extends Hero {

    public Hacker(int health, int damage, String name) {
        super(health, damage, SuperAbility.GET_BOSS_HP, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int indexOfHero = RPG_Game.random.nextInt(8);
        int bossHealth = 15;

        heroes[indexOfHero].setHealth(heroes[indexOfHero].getHealth() + bossHealth);
        boss.setHealth(boss.getHealth() - bossHealth);

        System.out.println("Hacker stole hp from Boss");
    }
}
