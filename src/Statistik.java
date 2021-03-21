
public class Statistik {
	private float gesCurrency;
	private int gesClicks;
	
	
	
	public float getGesCu() {
		return gesCurrency;
	}
	
	
	
	public int getGesCl() {
		return gesClicks;
	}
	
	
	
	public void calcGesCu(float currency) {
		this.gesCurrency += currency;
	}
	
	
	
	public void calcGesCl(int clicks) {
		this.gesClicks += clicks;
	}
}
