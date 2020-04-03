package it.test.corso.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EsempioTabella {

	private JFrame frame;
	private JTable table;
	private JTextField txnome;
	private JTextField txcognome;
	private JTextField txmail;
	private JTextField txfisso;
	private JTextField txcellulare;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EsempioTabella window = new EsempioTabella();
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
	public EsempioTabella() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 51, 877, 457);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOME", "COGNOME", "E-MAIL", "TELEFONO FISSO", "TELEFONO CELLULARE"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setPreferredWidth(120);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Aggiungi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txcognome.getText().isEmpty() == true || txmail.getText().isEmpty() == true || txnome.getText().isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "NON HAI RIEMPITO TUTTI I CAMPI");
				} else {
					String nome = txnome.getText();
					String cognome = txcognome.getText();
					String mail = txmail.getText();
					String fisso = txfisso.getText();
					String cellulare = txcellulare.getText();
					if (txfisso.getText().isEmpty() == true) {
						fisso = Math.random() + "";
					}
					if (txcellulare.getText().isEmpty() == true) {
						cellulare = Math.random() + "";
					}
					DefaultTableModel m = (DefaultTableModel) table.getModel();					
//					m.addRow(new String[] {"Paolo", "Preite", "info@paolopreite.it", "061111111", "3801111111"});
					m.addRow(new String[] {nome, cognome, mail, fisso, cellulare});
				}
			}
		});
		btnNewButton.setBounds(318, 599, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		txnome = new JTextField();
		txnome.setBounds(37, 532, 86, 20);
		frame.getContentPane().add(txnome);
		txnome.setColumns(10);
		
		txcognome = new JTextField();
		txcognome.setBounds(182, 532, 86, 20);
		frame.getContentPane().add(txcognome);
		txcognome.setColumns(10);
		
		txmail = new JTextField();
		txmail.setBounds(321, 532, 86, 20);
		frame.getContentPane().add(txmail);
		txmail.setColumns(10);
		
		txfisso = new JTextField();
		txfisso.setBounds(443, 532, 86, 20);
		frame.getContentPane().add(txfisso);
		txfisso.setColumns(10);
		
		txcellulare = new JTextField();
		txcellulare.setBounds(561, 532, 86, 20);
		frame.getContentPane().add(txcellulare);
		txcellulare.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("nome");
		lblNewLabel.setBounds(58, 555, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("cognome");
		lblNewLabel_1.setBounds(205, 555, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("mail");
		lblNewLabel_2.setBounds(331, 555, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("fisso");
		lblNewLabel_3.setBounds(466, 555, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("cellulare");
		lblNewLabel_4.setBounds(585, 555, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnNewButton_1 = new JButton("Rimuovi");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel m = (DefaultTableModel) table.getModel();
				if (m.getRowCount() > 0 && table.getSelectedRow() > -1) {
					m.removeRow(table.getSelectedRow());
				}
			}
		});
		btnNewButton_1.setBounds(443, 599, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
