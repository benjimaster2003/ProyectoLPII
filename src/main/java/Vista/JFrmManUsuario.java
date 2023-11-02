package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class JFrmManUsuario extends JInternalFrame {
	private JTextField txtUsuario;
	private JTextField txtNombreUsu;
	private JPasswordField contraseniaField;
	private JTextField txtBuscar;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrmManUsuario frame = new JFrmManUsuario();
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
	public JFrmManUsuario() {
		setBounds(100, 100, 977, 724);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(10, 10, 945, 163);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUsuario.setBounds(412, 38, 128, 67);
		panel.add(lblUsuario);
		
		JLabel lblUs = new JLabel("");
		lblUs.setIcon(new ImageIcon(JFrmManUsuario.class.getResource("/img/user.png")));
		lblUs.setBounds(285, 32, 72, 93);
		panel.add(lblUs);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Buscar Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 183, 945, 251);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBuscar.setBounds(10, 21, 70, 13);
		panel_1.add(lblBuscar);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(76, 19, 253, 19);
		panel_1.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JLabel lblFiltrar = new JLabel("Filtrar por:");
		lblFiltrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFiltrar.setBounds(469, 22, 93, 13);
		panel_1.add(lblFiltrar);
		
		JComboBox cboFiltrar = new JComboBox();
		cboFiltrar.setModel(new DefaultComboBoxModel(new String[] {"codigo", "nombre"}));
		cboFiltrar.setBounds(555, 18, 177, 21);
		panel_1.add(cboFiltrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 62, 925, 179);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID Usuario", "Tipo De Cargo", "Nombre Usuario", "Contrase\u00F1a"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(101);
		table.getColumnModel().getColumn(2).setPreferredWidth(113);
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Datos Del Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 444, 502, 241);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblUser = new JLabel("ID Usuario:");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUser.setBounds(10, 28, 86, 16);
		panel_2.add(lblUser);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(91, 28, 96, 19);
		panel_2.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblTipoCargo = new JLabel("Tipo de Cargo:");
		lblTipoCargo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTipoCargo.setBounds(10, 73, 105, 19);
		panel_2.add(lblTipoCargo);
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setBounds(125, 70, 162, 21);
		panel_2.add(cboTipo);
		
		JLabel lblNombre = new JLabel("Nombre del Usuario:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(10, 114, 141, 13);
		panel_2.add(lblNombre);
		
		txtNombreUsu = new JTextField();
		txtNombreUsu.setBounds(161, 112, 162, 19);
		panel_2.add(txtNombreUsu);
		txtNombreUsu.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContraseña.setBounds(10, 151, 105, 13);
		panel_2.add(lblContraseña);
		
		contraseniaField = new JPasswordField();
		contraseniaField.setBounds(108, 149, 215, 19);
		panel_2.add(contraseniaField);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Operaciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(522, 444, 433, 241);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(JFrmManUsuario.class.getResource("/img/guardar 64.png")));
		btnGuardar.setBounds(10, 22, 85, 94);
		panel_3.add(btnGuardar);
		
		JButton btnModificar = new JButton("");
		btnModificar.setIcon(new ImageIcon(JFrmManUsuario.class.getResource("/img/modificar 64).png")));
		btnModificar.setBounds(117, 22, 85, 94);
		panel_3.add(btnModificar);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(JFrmManUsuario.class.getResource("/img/registar 64.png")));
		btnNewButton_2.setBounds(221, 22, 94, 94);
		panel_3.add(btnNewButton_2);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon(JFrmManUsuario.class.getResource("/img/eliminar 64.png")));
		btnEliminar.setBounds(325, 22, 85, 94);
		panel_3.add(btnEliminar);
		
		JButton btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(JFrmManUsuario.class.getResource("/img/salida.png")));
		btnSalir.setBounds(167, 126, 102, 94);
		panel_3.add(btnSalir);

	}
}
