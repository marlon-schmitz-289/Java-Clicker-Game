import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings({"unused", "serial"})
public class ClickerPanel extends JPanel {
	private String cName = "Testos"; 	// Name der Währung kommt noch
	private float currency;
	private ClickObject co;
	
	
	
	public ClickerPanel() {
		this.setBackground(new Color(255, 255, 255));
		this.setForeground(new Color(0, 0, 0));
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawString(currency + " ", (this.getWidth() / 2) - 20, this.getHeight() / 2 - 70);
		g.drawString(cName, (this.getWidth() / 2) - 25, this.getHeight() / 2 - 55);
		g.drawRect((this.getWidth() / 2) - 50, (this.getHeight() / 2) - 50, 100, 100);
	}
}
