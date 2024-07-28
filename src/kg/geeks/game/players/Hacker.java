package kg.geeks.game.players;

public class Hacker extends Hero {
    private int stealHealth = 20;

    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STEAL);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            boss.setHealth(boss.getHealth() + this.stealHealth);
            heroes[i].setHealth(heroes[i].getHealth() + this.stealHealth);
        }
        System.out.println("Hacker hacked the system");
    }
}
