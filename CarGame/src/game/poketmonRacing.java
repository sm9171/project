package game;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class poketmonRacing implements ActionListener, KeyListener {

	private JFrame frame;
	private JTextField inputField;
	private String[] unit = { "��ī��", "���̸�", "���α�", "�̻��ؾ�" };
	private JTextField charTextField;
	private String input;
	private int x1 = 100;
	private JLabel label1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					poketmonRacing window = new poketmonRacing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public poketmonRacing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 673, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		label1 = new JLabel();
		label1.setIcon(new ImageIcon("��ī��.gif"));
		frame.getContentPane().add(label1);
		label1.setBounds(100, 0, 100, 100);

		JLabel bgLabel = new JLabel("");
		bgLabel.setIcon(new ImageIcon("�ٿ�ε�.gif"));
		bgLabel.setBounds(6, 6, 561, 269);
		frame.getContentPane().add(bgLabel);

		JButton btnStart = new JButton("Start!");
		btnStart.setBounds(489, 287, 129, 36);
		frame.getContentPane().add(btnStart);
		
		btnStart.addActionListener(this);
		
		

		inputField = new JTextField();
		inputField.setBounds(30, 324, 148, 25);
		frame.getContentPane().add(inputField);
		inputField.setColumns(10);

		JComboBox unitComboBox = new JComboBox();
		unitComboBox.setModel(new DefaultComboBoxModel(new String[] { "\uD30C\uC774\uB9AC", "\uAF2C\uBD80\uAE30",
				"\uC774\uC0C1\uD574\uC528", "\uD53C\uCE74\uCE04" }));
		unitComboBox.setBounds(340, 288, 139, 25);
		frame.getContentPane().add(unitComboBox);

		charTextField = new JTextField();
		charTextField.setEnabled(false);
		charTextField.setBounds(35, 286, 97, 26);
		frame.getContentPane().add(charTextField);
		charTextField.setColumns(10);
	}

	public void race() {
		Random r = new Random();
		int i = 0, count = 0;
		char chQuestion;
		while (true) {
			chQuestion = (char) (97 + r.nextInt(25));
			charTextField.setText(chQuestion + "");
			inputField.addKeyListener(this);

			

			if (count == 10){
				i++;
				charTextField.setText("������ �����ϼ̽��ϴ�.");
				break;
			}

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.race();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			input = inputField.getText();
			inputField.setText("");

		}

	}
}
