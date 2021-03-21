import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

@SuppressWarnings({"unused", "serial"})
public class ClickerPanel extends JPanel {
	private String cName = "Testos"; 	// Name der Währung kommt noch
	private float currency;
	private ClickObject co;
	//private Image img = new Image();
	
	
	
	public ClickerPanel() {
		this.setBackground(new Color(255, 255, 255));
		this.setForeground(new Color(0, 0, 0));
		
		this.co = new ClickObject();
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawRect(1, 1, this.getWidth() - 2, this.getHeight() - 2);
		g.drawImage(null /*Image*/, 1, 1, this.getWidth() - 2, this.getHeight() - 2, null);
	}
	
	
	
	public void addCurrency() {
		this.currency += co.getValue();
	}
	
	
	
	public float getCurrency() {
		return this.currency;
	}
	
	
	
	public String getCName() {
		return this.cName;
	}
}
