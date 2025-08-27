import java.util.Random;

abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int defense;

    Random rng = new Random();

    public Character() {}

    public int attack(){
        int aRng = rng.nextInt((10-5) + 1) + 5;
        int newAttackPower = (int)(attackPower * (1.0 / aRng));
        System.out.println(this.name + " attacked!");
        return newAttackPower;

    }

    public void takeDamage(int damage){
        this.health -= damage;
        if(this.health < 0){
            this.health = 0;
        }
        System.out.println(this.name + " takes " + damage + " damage! Remaining HP is " + this.health);
    }

    public boolean isAlive(){
        if (this.health <= 0){
            return false;
        } else  {
            return true;
        }
    }
}
