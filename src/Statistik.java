
public class Statistik {
	private double gesCurrency;
	private int gesClicks;
	
	
	
	public double getGesCu() {
		return gesCurrency;
	}
	
	
	
	public int getGesCl() {
		return gesClicks;
	}
	
	
	
	public void addGesCu(double currency) {
		this.gesCurrency += currency;
	}
	
	
	
	public void addGesCl(int clicks) {
		this.gesClicks += clicks;
	}
}
