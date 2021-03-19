
@SuppressWarnings("unused")
public class Upgrade {
	private String name;
	private float cost;
	private int level = 1;
	private int maxLevel = 50;
	
	
	
	public Upgrade(String name, float cost) {
		this.name = name;
		this.cost = cost;
	}
	
	
	
	public void addLevel() {
		if (this.level < this.maxLevel) {
			this.level += 1;
			this.cost *= 1.4;			
		}
	}
}
