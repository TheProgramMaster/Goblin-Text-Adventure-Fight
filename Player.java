public class Player {
	private String name;
	private int health;
	private int strength;
	private int stamina;
	private int gold;
	public Player(String name) {
		this.name = name;
		health = 100;
		strength = 10;
		stamina = 100;
		gold = 0;
	}
	public String getName() {
		return this.name;
	}
	public int getHealth() {
		return this.health;
	}
	public int getStrength() {
		return this.strength;
	}
	public int getStamina() {
		return this.stamina;
	}
	public int getGold() {
		return this.gold;
	}
	public void setHealth(int h) {
		this.health = h;
	}
	public void setStrength(int s) {
		this.strength = s;
	}
	public void setStamina(int s) {
		this.stamina = s;
	}
	public void setGold(int g) {
		this.gold = g;
	}
	public int attack() {
		int damage = (int)(Math.random()*getStrength());
		return damage;
	}
}
