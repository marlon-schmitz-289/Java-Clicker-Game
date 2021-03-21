
public class Statistik {
	private float gesCurrency;
	private int gesClicks;
	
	
	
	public float getGesCu() {
		return gesCurrency;
	}
	
	
	
	public int getGesCl() {
		return gesClicks;
	}
	
	
	
	public void addGesCu(float currency) {
		this.gesCurrency += currency;
	}
	
	
	
	public void addGesCl(int clicks) {
		this.gesClicks += clicks;
	}
}
