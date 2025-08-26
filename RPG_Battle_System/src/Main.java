import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Welcome to our new turn based PvP game!!");
        System.out.println("------------------------------------------");
        System.out.println();
        System.out.print("Please enter players name: ");
        name =  scanner.nextLine();
        System.out.println("Welcome player " + name);

        // Create new object for player
        Player player = new Player(name);

        scanner.close();
    }
}
