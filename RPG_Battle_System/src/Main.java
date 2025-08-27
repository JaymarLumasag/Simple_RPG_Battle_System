import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean gameStatus = true;
        char playerAction;

        Player player1 = new Player("Jaymar", 100, 90, 50);
        Enemy enemy1 = new Enemy("Jorge", 200, 45, 25);

        while(gameStatus){
           playerAction = player1.chooseAction();
           if('a' ==  playerAction){
                enemy1.takeDamage(player1.attack());
           } else if('h' ==  playerAction){
               player1.heal();
           }

           player1.takeDamage(enemy1.attack());
           if(!player1.isAlive() || !enemy1.isAlive()){
               gameStatus = false;
               if(player1.isAlive()) {
                   System.out.println(player1.name + " is the Winner!");
               } else if(enemy1.isAlive()) {
                   System.out.println(enemy1.name + " is the Winner!");
               }
           }
        }
    }
}