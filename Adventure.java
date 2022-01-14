import java.util.*;
public class Adventure {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the name of your player");
		String playerName = scan.nextLine();
		Player player = new Player(playerName);
		Monster mons = new Monster("Goblin",100,10,100);
		System.out.println("You have encountered a goblin!");
		while(mons.getHealth() > 0 && player.getHealth() > 0) {
			System.out.println("What will you do? (Fight/Block)");
			String input = scan.nextLine();
			while(!input.equals("Fight")&&!input.equals("Block")) {
				System.out.println("Command not recognized. What will you do? (Fight/Block)");
				input = scan.nextLine();
			}
			if(input.equals("Block")) {
				if(player.getStamina()>10) {
					int newStamina = player.getStamina() - 10;
					player.setStamina(newStamina);
					System.out.println("You have succesfully blocked the " + mons.getName() + "'s attack!");
					System.out.println("You now have " + player.getStamina() + "stamina left.");
				}else {
					System.out.println("Failed to block.");
				}
			}else {
				int damage = player.attack();
				mons.setHealth(mons.getHealth()-damage);
				System.out.println("You do " + damage + " to the " + mons.getName() + "!");
			}
			int damage = mons.attack();
			player.setHealth(player.getHealth()-damage);
			System.out.println("You now have " + player.getHealth() + " health");
		}
		if(player.getHealth()>=0) {
			System.out.println("You lost. Game Over.");
		}else {
			int gold1 = mons.getGoldDrop();
			player.setGold(player.getGold() + gold1);
			System.out.println("You won! You won gold from defeating the " + mons.getName() + "! You now have " + player.getGold() + " Gold!");
		}
	}
}
