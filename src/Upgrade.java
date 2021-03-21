
@SuppressWarnings("unused")
public class Upgrade {
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Kosten")
	private double cost;
	
	@JsonProperty("Level")
	private int level = 1;
	
	@JsonProperty("MaxLevel")
	private int maxLevel = 50;
	
	
	
	public Upgrade(String name, double cost) {
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
