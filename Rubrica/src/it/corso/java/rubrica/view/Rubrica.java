package it.corso.java.rubrica.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import it.corso.java.rubrica.business.RubricaBusiness;
import it.corso.java.rubrica.model.Contatto;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;

public class Rubrica {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtCognome;
	private JTextField txtTelefono;
	private JTable listaContatti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rubrica window = new Rubrica();
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
	public Rubrica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1038, 709);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 29, 1002, 611);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Inserisci Contatto", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 46, 14);
		panel.add(lblNome);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setBounds(10, 36, 46, 14);
		panel.add(lblCognome);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 61, 46, 14);
		panel.add(lblTelefono);
		
		txtNome = new JTextField();
		txtNome.setBounds(66, 8, 86, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtCognome = new JTextField();
		txtCognome.setBounds(66, 33, 86, 20);
		panel.add(txtCognome);
		txtCognome.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(66, 58, 86, 20);
		panel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JButton btnAggiungi = new JButton("Aggiungi");
		btnAggiungi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* se c'è un campo vuoto compare il messaggio d'avviso */
				if (txtNome.getText().isEmpty() ||txtCognome.getText().isEmpty() ||txtTelefono.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "NON POSSONO ESSERCI CAMPI VUOTI");
				} else {
					/* altrimenti passa il contenuto delle textbox alla classe contatto */
					Contatto nuovoContatto = new Contatto();
					nuovoContatto.setNome(txtNome.getText());
					nuovoContatto.setCognome(txtCognome.getText());
					nuovoContatto.setTelefono(txtTelefono.getText());
					try {
						/* richiamo il metodo aggiungi contatto */
						int id = RubricaBusiness.getInstances().aggiungiContatto(nuovoContatto);
						if (id > 0) {
							JOptionPane.showMessageDialog(null, "Contatto aggiunto con successo!!!");
							txtNome.setText("");
							txtCognome.setText("");
							txtTelefono.setText("");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnAggiungi.setBounds(10, 86, 89, 23);
		panel.add(btnAggiungi);
		
		JButton btnAnnulla = new JButton("Annulla");
		btnAnnulla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				txtCognome.setText("");
				txtTelefono.setText("");
			}
		});
		btnAnnulla.setBounds(109, 86, 89, 23);
		panel.add(btnAnnulla);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Ricerca Contatti", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 977, 561);
		panel_1.add(scrollPane);
		
		listaContatti = new JTable();
		listaContatti.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NOME", "COGNOME", "TELEFONO"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		listaContatti.getColumnModel().getColumn(0).setResizable(false);
		listaContatti.getColumnModel().getColumn(1).setResizable(false);
		listaContatti.getColumnModel().getColumn(1).setPreferredWidth(150);
		listaContatti.getColumnModel().getColumn(2).setResizable(false);
		listaContatti.getColumnModel().getColumn(2).setPreferredWidth(150);
		listaContatti.getColumnModel().getColumn(3).setResizable(false);
		listaContatti.getColumnModel().getColumn(3).setPreferredWidth(150);
		
		DefaultTableModel dtm = (DefaultTableModel) listaContatti.getModel();
		try {
			List<Contatto> contatti = RubricaBusiness.getInstances().ricercaContatti();
			for (Contatto c : contatti) {
				Vector rowData = new Vector();
				rowData.add(c.getId());
				rowData.add(c.getNome());
				rowData.add(c.getCognome());
				rowData.add(c.getTelefono());
				dtm.addRow(rowData);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		scrollPane.setViewportView(listaContatti);
	}
}