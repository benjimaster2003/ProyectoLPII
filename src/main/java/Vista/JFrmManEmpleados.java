package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;

public class JFrmManEmpleados extends JInternalFrame {
	private JTextField txtBuscar;
	private JTable table;
	private JTextField txtId;
	private JTextField txtDni;
	private JTextField textField;
	private JTextField txtPaterno;
	private JTextField txtMaterno;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrmManEmpleados frame = new JFrmManEmpleados();
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
	public JFrmManEmpleados() {
		setTitle("Mantenimiento Empleado");
		setBounds(100, 100, 1134, 845);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 1122, 169);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmpleados = new JLabel("Empleados");
		lblEmpleados.setForeground(Color.WHITE);
		lblEmpleados.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblEmpleados.setBounds(409, 54, 261, 44);
		panel.add(lblEmpleados);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(JFrmManEmpleados.class.getResource("/img/logito.jpg")));
		lblNewLabel.setBounds(114, 10, 199, 149);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Buscar Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 189, 1102, 280);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBuscar.setBounds(22, 32, 87, 13);
		panel_1.add(lblBuscar);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(77, 30, 236, 19);
		panel_1.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JLabel lblFiltrar = new JLabel("Filtrar por:");
		lblFiltrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFiltrar.setBounds(392, 33, 87, 13);
		panel_1.add(lblFiltrar);
		
		JComboBox cboFiltrar = new JComboBox();
		cboFiltrar.setModel(new DefaultComboBoxModel(new String[] {"codigo", "nombre"}));
		cboFiltrar.setBounds(499, 30, 155, 21);
		panel_1.add(cboFiltrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(JFrmManEmpleados.class.getResource("/img/research.png")));
		btnBuscar.setBounds(745, 29, 320, 54);
		panel_1.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 104, 1055, 166);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "DNI", "Nombre", "Apellido Paterno", "Apellido Materno", "Direccion", "Fec Nacimiento", "Sexo", "Email", "Telefono1", "Cargo"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Datos del Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 479, 788, 327);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID Empleados:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(25, 27, 113, 13);
		panel_2.add(lblNewLabel_1);
		
		txtId = new JTextField();
		txtId.setBounds(134, 25, 68, 19);
		panel_2.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDni.setBounds(316, 28, 45, 13);
		panel_2.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(355, 25, 148, 19);
		panel_2.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre(s):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(25, 58, 80, 13);
		panel_2.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(115, 56, 397, 19);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblPaterno = new JLabel("Apellido Paterno:");
		lblPaterno.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPaterno.setBounds(25, 95, 80, 13);
		panel_2.add(lblPaterno);
		
		txtPaterno = new JTextField();
		txtPaterno.setBounds(125, 93, 273, 19);
		panel_2.add(txtPaterno);
		txtPaterno.setColumns(10);
		
		JLabel lblMaterno = new JLabel("Apellido Materno:");
		lblMaterno.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaterno.setBounds(408, 95, 159, 13);
		panel_2.add(lblMaterno);
		
		txtMaterno = new JTextField();
		txtMaterno.setBounds(527, 93, 247, 19);
		panel_2.add(txtMaterno);
		txtMaterno.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDireccion.setBounds(24, 126, 94, 13);
		panel_2.add(lblDireccion);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 124, 532, 19);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono(s):");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(25, 159, 94, 13);
		panel_2.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(134, 153, 200, 19);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblFecVenci = new JLabel("Fecha Nacimiento");
		lblFecVenci.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFecVenci.setBounds(25, 195, 99, 13);
		panel_2.add(lblFecVenci);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(132, 189, 190, 19);
		panel_2.add(dateChooser);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCargo.setBounds(355, 196, 61, 13);
		panel_2.add(lblCargo);
		
		JComboBox cboCargo = new JComboBox();
		cboCargo.setModel(new DefaultComboBoxModel(new String[] {"mantenimiento", "administrador"}));
		cboCargo.setBounds(414, 192, 136, 21);
		panel_2.add(cboCargo);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSexo.setBounds(578, 196, 45, 13);
		panel_2.add(lblSexo);
		
		JComboBox cboSexo = new JComboBox();
		cboSexo.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		cboSexo.setBounds(646, 192, 61, 21);
		panel_2.add(cboSexo);
		
		JLabel lblEmail = new JLabel("E - mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setBounds(25, 227, 93, 13);
		panel_2.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 225, 532, 19);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Operaciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(808, 479, 304, 327);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon(JFrmManEmpleados.class.getResource("/img/registar 64.png")));
		btnRegistrar.setBounds(10, 28, 90, 73);
		panel_3.add(btnRegistrar);
		
		JButton btnModificar = new JButton("");
		btnModificar.setIcon(new ImageIcon(JFrmManEmpleados.class.getResource("/img/modificar 64).png")));
		btnModificar.setBounds(15, 112, 85, 73);
		panel_3.add(btnModificar);
		
		JButton btnSalida = new JButton("");
		btnSalida.setIcon(new ImageIcon(JFrmManEmpleados.class.getResource("/img/salida.png")));
		btnSalida.setBounds(15, 195, 85, 73);
		panel_3.add(btnSalida);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(JFrmManEmpleados.class.getResource("/img/guardar 64.png")));
		btnGuardar.setBounds(123, 31, 107, 67);
		panel_3.add(btnGuardar);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon(JFrmManEmpleados.class.getResource("/img/eliminar 64.png")));
		btnEliminar.setBounds(123, 118, 107, 61);
		panel_3.add(btnEliminar);

	}
}
