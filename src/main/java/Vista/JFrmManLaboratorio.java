package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class JFrmManLaboratorio extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrmManLaboratorio frame = new JFrmManLaboratorio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrmManLaboratorio() {
		setBounds(100, 100, 1028, 801);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 1016, 157);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JFrmManLaboratorio.class.getResource("/img/laboratorio.png")));
		lblNewLabel.setBounds(324, 10, 69, 126);
		panel.add(lblNewLabel);
		
		JLabel lblLabora = new JLabel("Laboratorio");
		lblLabora.setForeground(Color.WHITE);
		lblLabora.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLabora.setBounds(413, 39, 202, 79);
		panel.add(lblLabora);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos Laboratorio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 167, 996, 595);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLaboratorio = new JLabel("ID Laboratorio:");
		lblLaboratorio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLaboratorio.setBounds(10, 26, 151, 13);
		panel_1.add(lblLaboratorio);
		
		textField = new JTextField();
		textField.setBounds(126, 24, 280, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(488, 27, 142, 13);
		panel_1.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(559, 24, 280, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDescrip = new JLabel("Descripcion:");
		lblDescrip.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescrip.setBounds(10, 62, 117, 13);
		panel_1.add(lblDescrip);
		
		textField_2 = new JTextField();
		textField_2.setBounds(107, 60, 732, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Operaciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 116, 976, 174);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnListar = new JButton("");
		btnListar.setIcon(new ImageIcon(JFrmManLaboratorio.class.getResource("/img/documento.png")));
		btnListar.setBounds(117, 26, 110, 105);
		panel_2.add(btnListar);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(JFrmManLaboratorio.class.getResource("/img/guardar 64.png")));
		btnGuardar.setBounds(237, 26, 108, 105);
		panel_2.add(btnGuardar);
		
		JButton btnModificar = new JButton("");
		btnModificar.setIcon(new ImageIcon(JFrmManLaboratorio.class.getResource("/img/modificar 64).png")));
		btnModificar.setBounds(349, 26, 108, 105);
		panel_2.add(btnModificar);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon(JFrmManLaboratorio.class.getResource("/img/registar 64.png")));
		btnRegistrar.setBounds(467, 26, 99, 105);
		panel_2.add(btnRegistrar);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon(JFrmManLaboratorio.class.getResource("/img/eliminar 64.png")));
		btnEliminar.setBounds(576, 26, 110, 105);
		panel_2.add(btnEliminar);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(JFrmManLaboratorio.class.getResource("/img/salida.png")));
		btnNewButton_1.setBounds(696, 26, 115, 110);
		panel_2.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 300, 976, 285);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"ID Laboratorio", "Nombre de laboratorio", "Descripcion"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(133);
		scrollPane.setViewportView(table);

	}

}
