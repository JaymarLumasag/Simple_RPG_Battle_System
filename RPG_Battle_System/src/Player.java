import java.util.Scanner;

public class Player extends Character{
    Scanner input = new Scanner(System.in);
    public Player(String pName, int pHealth, int pAttackPower, int pDefense) {
        this.name = pName;
        this.health = pHealth;
        this.attackPower = pAttackPower;
        this.defense = pDefense;
    }

    public void heal(){
        this.health = health + 10;
        System.out.println(this.name + " healed! Your HP is: " + this.health);
    }

    public char chooseAction(){
        System.out.println("Choose Player Action (a) attack, (h) heal: ");
        char playerAction = input.next().charAt(0);
        return (playerAction);
    }
}
