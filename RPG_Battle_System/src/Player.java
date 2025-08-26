public class Player extends Character{

    public Player(String pName, int pHealth, int pAttackPower, int pDefense) {
        this.name = pName;
        this.health = pHealth;
        this.attackPower = pAttackPower;
        this.defense = pDefense;
    }

    public Player(String pName) {
        this.name = pName;
    }

    public void heal(){

    }

    public char chooseAction(){
        return ('a');
    }
}
