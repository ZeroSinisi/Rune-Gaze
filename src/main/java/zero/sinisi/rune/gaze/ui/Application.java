package zero.sinisi.rune.gaze.ui;

import java.awt.BorderLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class Application extends JFrame {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -4788324551422914430L;

	public Application() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		getContentPane().add(panel);
		panel.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("default:grow"), }, new RowSpec[] {
				RowSpec.decode("default:grow"), RowSpec.decode("default:grow"), RowSpec.decode("default:grow"), }));
		JTextArea txtrEnterSummonerName = new JTextArea();
		txtrEnterSummonerName.setBackground(SystemColor.inactiveCaption);
		txtrEnterSummonerName.setText("Enter Summoner Name");
		txtrEnterSummonerName.setEditable(false);
		panel.add(txtrEnterSummonerName, "1, 1, center, bottom");
		JTextField textField = new JTextField();
		textField.setColumns(10);
		panel.add(textField, "1, 2, center, center");
		JButton btnNewButton = new JButton("View Match");
		panel.add(btnNewButton, "1, 3, center, center");
	}
}
