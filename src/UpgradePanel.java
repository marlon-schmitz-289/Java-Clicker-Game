import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JList;
import javax.swing.JPanel;

@SuppressWarnings({"serial", "unused"})
public class UpgradePanel extends JPanel {
	private Upgrade[] lst_Upgrades;
	private ClickerPanel cp;
	
	
	
	public UpgradePanel(ClickerPanel cp) {
		this.setBackground(Color.white);
		
		lst_Upgrades = new Upgrade[7];		// erstmal nur 7 Ideen
		this.cp = cp;
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawString("Test", 5, 15);
	}
	
	
	
	private void readUpgradeList() {
		// TODO
		// json Datei lesen und Upgrades in Liste einfügen
	}
}
