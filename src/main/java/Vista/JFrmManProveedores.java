package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.table.DefaultTableModel;

public class JFrmManProveedores extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtBuscar;
	private JTable table;
	private JTextField txtProveedor;
	private JTextField txtRUC;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrmManProveedores frame = new JFrmManProveedores();
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
	public JFrmManProveedores() {
		setTitle("Mantenimiento de Proveedores");
		setBounds(100, 100, 1092, 841);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 1056, 210);
		panel.setBackground(SystemColor.info);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JFrmManProveedores.class.getResource("/img/logito.jpg")));
		lblNewLabel.setBounds(234, 10, 201, 188);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PROVEEDORES");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 50));
		lblNewLabel_1.setBounds(506, 47, 459, 111);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Buscar Proveedor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 249, 1056, 224);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Buscar : ");
		lblNewLabel_2.setBounds(22, 27, 63, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(lblNewLabel_2);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(95, 26, 193, 20);
		txtBuscar.setColumns(10);
		panel_1.add(txtBuscar);
		
		JLabel lblNewLabel_3 = new JLabel("Filtrar por : ");
		lblNewLabel_3.setBounds(402, 29, 71, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(lblNewLabel_3);
		
		JComboBox cboFiltrar = new JComboBox();
		cboFiltrar.setBounds(482, 27, 153, 22);
		cboFiltrar.setModel(new DefaultComboBoxModel(new String[] {"codigo", "RUC"}));
		cboFiltrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.add(cboFiltrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(806, 12, 138, 49);
		btnBuscar.setIcon(new ImageIcon(JFrmManProveedores.class.getResource("/img/research.png")));
		panel_1.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 72, 1004, 141);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "RUC", null, null, null, null, null, null},
			},
			new String[] {
				"idProveedor", "RUC", "Nombre", "Direccion", "Telefono1", "Telefono2", "Telefono3", "E-mail"
			}
		));
		scrollPane.setRowHeaderView(table);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del Proveedor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBounds(10, 484, 751, 224);
		getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("ID Proveedor :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(54, 29, 93, 14);
		panel_1_1.add(lblNewLabel_4);
		
		txtProveedor = new JTextField();
		txtProveedor.setColumns(10);
		txtProveedor.setBounds(157, 28, 164, 20);
		panel_1_1.add(txtProveedor);
		
		JLabel lblNewLabel_5 = new JLabel("RUC : ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(368, 31, 46, 14);
		panel_1_1.add(lblNewLabel_5);
		
		txtRUC = new JTextField();
		txtRUC.setColumns(10);
		txtRUC.setBounds(424, 28, 164, 20);
		panel_1_1.add(txtRUC);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre (s) :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(64, 66, 83, 14);
		panel_1_1.add(lblNewLabel_6);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(151, 65, 580, 20);
		panel_1_1.add(txtNombre);
		
		JLabel lblNewLabel_9 = new JLabel("Dirección : ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(76, 102, 72, 14);
		panel_1_1.add(lblNewLabel_9);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(151, 101, 580, 20);
		panel_1_1.add(txtDireccion);
		
		JLabel lblNewLabel_10 = new JLabel("Telefono : ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(75, 137, 72, 14);
		panel_1_1.add(lblNewLabel_10);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(151, 136, 299, 20);
		panel_1_1.add(txtTelefono);
		
		JLabel lblNewLabel_13 = new JLabel("e-mail :");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(89, 174, 46, 14);
		panel_1_1.add(lblNewLabel_13);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(151, 173, 590, 20);
		panel_1_1.add(txtEmail);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Operaciones", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1_1.setBounds(813, 484, 228, 315);
		getContentPane().add(panel_1_1_1);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon(JFrmManProveedores.class.getResource("/img/registar 64.png")));
		btnRegistrar.setBounds(10, 31, 96, 78);
		panel_1_1_1.add(btnRegistrar);
		
		JButton btnModificar = new JButton("");
		btnModificar.setIcon(new ImageIcon(JFrmManProveedores.class.getResource("/img/modificar 64).png")));
		btnModificar.setBounds(10, 133, 96, 78);
		panel_1_1_1.add(btnModificar);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setIcon(new ImageIcon(JFrmManProveedores.class.getResource("/img/cancelar 64.png")));
		btnCancelar.setBounds(10, 222, 96, 82);
		panel_1_1_1.add(btnCancelar);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(JFrmManProveedores.class.getResource("/img/guardar 64.png")));
		btnGuardar.setBounds(116, 31, 102, 78);
		panel_1_1_1.add(btnGuardar);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon(JFrmManProveedores.class.getResource("/img/eliminar 64.png")));
		btnEliminar.setBounds(116, 133, 102, 78);
		panel_1_1_1.add(btnEliminar);
		
		JButton btnSalida = new JButton("");
		btnSalida.setIcon(new ImageIcon(JFrmManProveedores.class.getResource("/img/salida.png")));
		btnSalida.setBounds(116, 222, 102, 82);
		panel_1_1_1.add(btnSalida);

	}
}
