import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({"serial"})
public class MainWindow extends JFrame {
	private JPanel _contentPane;


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				}
				
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	public MainWindow() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		_contentPane = new JPanel();
		_contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(_contentPane);
		_contentPane.setLayout(null);
		
		
		ClickerPanel clicker = new ClickerPanel();
		clicker.setBounds(10, 11, 270, 239);
		_contentPane.add(clicker);
		
		
		UpgradePanel upgrades = new UpgradePanel();
		upgrades.setBounds(290, 11, 134, 198);
		_contentPane.add(upgrades);
		
		
		StatistikPanel statistik = new StatistikPanel(clicker, upgrades);
		statistik.setBounds(290, 11, 134, 198);
		_contentPane.add(statistik);
		statistik.setVisible(false);
		
		
		JToggleButton tgbtn_Upgrades = new JToggleButton("Upgrades");
		tgbtn_Upgrades.setBounds(290, 220, 134, 30);
		_contentPane.add(tgbtn_Upgrades);
		
		
		// Listener
		tgbtn_Upgrades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tgbtn_Upgrades.isSelected() == true) {
					tgbtn_Upgrades.setText("Statistik");
					upgrades.setVisible(false);
					statistik.setVisible(true);
				}
				
				
				else {
					tgbtn_Upgrades.setText("Upgrades");
					statistik.setVisible(false);
					upgrades.setVisible(true);
				}
			}
		});
	}
}
