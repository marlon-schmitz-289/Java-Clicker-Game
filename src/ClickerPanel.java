import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings({"unused", "serial"})
public class ClickerPanel extends JPanel {
	private String cName = "Judengold"; 	// Name der Währung kommt noch
	private int currency;
	private ClickObject co;
	private Image img;
	
	
	
	public ClickerPanel() {
		this.setBackground(new Color(255, 255, 255));
		this.setForeground(new Color(0, 0, 0));
		
		this.co = new ClickObject();
		
		try {
			File f = new File("./img/currency.png");
			this.img = ImageIO.read(f);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawRect(1, 1, this.getWidth() - 2, this.getHeight() - 2);
		g.drawImage(img, 1, 1, this.getWidth() - 2, this.getHeight() - 2, null);
	}
	
	
	
	public void addCurrency() {
		this.currency += co.getValue();
	}
	
	
	
	public int getCurrency() {
		return this.currency;
	}
	
	
	
	public String getCName() {
		return this.cName;
	}
	
	
	
	public int getCValue() {
		return this.co.getValue();
	}
}
