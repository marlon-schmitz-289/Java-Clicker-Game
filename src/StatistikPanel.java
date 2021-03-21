import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings({"serial", "unused"})
public class StatistikPanel extends JPanel {
	private ClickerPanel cp;
	private UpgradePanel up;
	private Statistik st;
	
	
	
	public StatistikPanel(ClickerPanel cp, UpgradePanel up) {
		this.setBackground(Color.white);
		
		st = new Statistik();
		this.cp = cp;
		this.up = up;
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawString("Gesamtes " + cp.getCName() + ":", 5, 15);
		g.drawString(st.getGesCu() + "", 5, 30);
		
		g.drawString("Gesamte Clicks:", 5, 55);
		g.drawString(st.getGesCl() + "", 5, 70);
	}
	
	
	
	public void addStats(int clicks, double currency) {
		st.addGesCu(currency);
		st.addGesCl(clicks);
		
		this.repaint();
	}
}
