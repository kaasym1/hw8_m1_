package kg.geeks.game.players;

public class Magic extends Hero {
    private int boostDamage = 25;

    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            hero.setHealth(hero.getHealth() + this.boostDamage);
        }
    }
}