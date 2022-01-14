import java.lang.Math;
public class Monster {
	private String name;
	private int health;
	private int strength;
	private int goldDrop;
	public Monster(String name, int health, int strength, int goldDrop) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.goldDrop = goldDrop;
	}
	public int getStrength() {
		return this.strength;
	}
	public int getHealth() {
		return this.health;
	}
	public int getGoldDrop() {
		return this.goldDrop;
	}
	public String getName() {
		return this.name;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int attack(){
		int damage = (int)(Math.random()*getStrength());
		System.out.println(getName() + " does " + damage + " damage.");
		return damage;
	}
}
