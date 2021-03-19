import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JList;
import javax.swing.JPanel;

@SuppressWarnings({"serial", "unused"})
public class UpgradePanel extends JPanel {
	private JList<Upgrade> lst_Upgrades;
	
	
	
	public UpgradePanel() {
		this.setBackground(Color.white);
		
		lst_Upgrades = new JList<Upgrade>();
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawString("Test", (this.getWidth() / 2) - 10, (this.getHeight() / 2) - 10);
	}
}
