package zero.sinisi.rune.gaze.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import zero.sinisi.rune.gaze.Gaze;

public class Main {
	private static JTextField textField_1_a;
	private static JTextField textField_1_b;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;
	private static JTextField textField_12;
	private static JTextField textField_13;
	private static JTextField textField_14;
	private static JTextField textField_15;
	private static JTextField textField_16;
	private static JTextField textField_17;
	private static JTextField textField_18;
	private static JTextField textField_19;

	public static void main(String[] args) {
		Gaze gaze = new Gaze("34816116");
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField_1_a = new JTextField();
		panel_1.add(textField_1_a);
		textField_1_a.setColumns(10);
		
		textField_1_b = new JTextField();
		panel_1.add(textField_1_b);
		textField_1_b.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField_4 = new JTextField();
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField_6 = new JTextField();
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		panel_4.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField_8 = new JTextField();
		panel_5.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		panel_5.add(textField_9);
		textField_9.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField_10 = new JTextField();
		panel_6.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		panel_6.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField_12 = new JTextField();
		panel_7.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		panel_7.add(textField_13);
		textField_13.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField_14 = new JTextField();
		panel_8.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		panel_8.add(textField_15);
		textField_15.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		
		textField_16 = new JTextField();
		panel_9.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		panel_9.add(textField_17);
		textField_17.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField_18 = new JTextField();
		panel_10.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		panel_10.add(textField_19);
		textField_19.setColumns(10);
		
		HashMap<String, ArrayList<String>> data = gaze.getData();
		Set<String> keys = data.keySet();
		String[] keyArray = new String[keys.size()];
		int i = 0;
		for(String s: keys) {
			keyArray[0] = s;
		}
		textField_1_a.setText(keyArray[0]);
		textField_1_b.setText(data.get(keyArray[0]).toString());
		frame.setSize(600,600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}
