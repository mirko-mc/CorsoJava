package it.test.corso.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RubricaComponents {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RubricaComponents window = new RubricaComponents();
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
	public RubricaComponents() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 991, 711);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("etichetta non cliccabile");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(38, 120, 181, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("pulsante jbutton");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("CIAOOOOO");
			}
		});
		btnNewButton.setBounds(38, 183, 181, 23);
		frame.getContentPane().add(btnNewButton);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("pulsante jtoggle button");
		tglbtnNewToggleButton.setBounds(38, 227, 181, 23);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setToolTipText("text tooltip");
		textField.setBounds(38, 274, 181, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("check 1");
		chckbxNewCheckBox.setBounds(38, 321, 181, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(38, 366, 114, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(154, 366, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(265, 366, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setBounds(43, 409, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_4.setBounds(154, 409, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_5.setBounds(265, 409, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtnNewRadioButton_3);
		group1.add(rdbtnNewRadioButton_4);
		group1.add(rdbtnNewRadioButton_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(38, 464, 329, 177);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(411, 465, 66, 55);
		frame.getContentPane().add(textArea_1);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"elemento 1", "elemento 2", "elemento 3", "elemento 4", "elemento 5", "elemento 6"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(305, 124, 134, 126);
		frame.getContentPane().add(list);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(list, popupMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Men\u00F9 1");
		popupMenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_3 = new JMenu("Men\u00F9 1.1");
		mnNewMenu_1.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Men\u00F9 1.1.1");
		mnNewMenu_3.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Men\u00F9 2");
		popupMenu.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Men\u00F9 2.1");
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(307, 289, 132, 29);
		frame.getContentPane().add(passwordField);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Gestione Prodotti");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Aggiungi");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("ho clickato sul menù");
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ricera");
		mnNewMenu.add(mntmNewMenuItem_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}