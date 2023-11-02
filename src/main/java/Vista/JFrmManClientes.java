package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;

public class JFrmManClientes extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrmManClientes frame = new JFrmManClientes();
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
	public JFrmManClientes() {
		setClosable(true);
		setTitle("Mantenimiento clientes");
		setBounds(100, 100, 1060, 829);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 1024, 216);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JFrmManClientes.class.getResource("/img/logito.jpg")));
		lblNewLabel.setBounds(100, 11, 200, 194);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CLIENTES");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblNewLabel_1.setBounds(463, 51, 288, 105);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Buscar Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 238, 1024, 224);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Buscar : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(22, 27, 63, 14);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(95, 26, 193, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Filtrar por : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(402, 29, 71, 14);
		panel_1.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Codigo", "DNI", "Apellidos"}));
		comboBox.setBounds(482, 27, 153, 22);
		panel_1.add(comboBox);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(JFrmManClientes.class.getResource("/img/research.png")));
		btnBuscar.setBounds(806, 12, 138, 49);
		panel_1.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 72, 1004, 141);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"idCliente", "DNI", "Nombre", "Apellido Paterno", "Apellido Materno", "Direcci\u00F3n", "Fecha Nacimiento", "Sexo", "Email", "Telefono "
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBounds(10, 473, 747, 315);
		getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("ID Cliente :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(64, 29, 83, 14);
		panel_1_1.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 28, 164, 20);
		panel_1_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("DNI : ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(378, 31, 36, 14);
		panel_1_1.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(424, 28, 164, 20);
		panel_1_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre (s) :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(54, 54, 83, 14);
		panel_1_1.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(157, 53, 580, 20);
		panel_1_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Apellido Paterno : ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(23, 94, 114, 17);
		panel_1_1.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(157, 94, 189, 20);
		panel_1_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Apellido Materno :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(383, 95, 114, 14);
		panel_1_1.add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setBounds(506, 94, 231, 20);
		panel_1_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Dirección : ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(65, 140, 72, 14);
		panel_1_1.add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setBounds(157, 139, 580, 20);
		panel_1_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Telefono : ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(65, 185, 72, 14);
		panel_1_1.add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(157, 184, 299, 20);
		panel_1_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Fecha Nacimiento : ");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(20, 230, 127, 14);
		panel_1_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Sexo : ");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(383, 230, 46, 14);
		panel_1_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("e-mail :");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(91, 266, 46, 14);
		panel_1_1.add(lblNewLabel_13);
		
		textField_10 = new JTextField();
		textField_10.setBounds(147, 263, 590, 20);
		panel_1_1.add(textField_10);
		textField_10.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(157, 232, 152, 20);
		panel_1_1.add(dateChooser);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Masculino ", "Femenino"}));
		comboBox_1.setBounds(439, 228, 105, 22);
		panel_1_1.add(comboBox_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Operaciones", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1_1.setBounds(783, 473, 228, 315);
		getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon(JFrmManClientes.class.getResource("/img/registar 64.png")));
		btnRegistrar.setBounds(10, 31, 96, 78);
		panel_1_1_1.add(btnRegistrar);
		
		JButton btnModificar = new JButton("");
		btnModificar.setIcon(new ImageIcon(JFrmManClientes.class.getResource("/img/modificar 64).png")));
		btnModificar.setBounds(10, 133, 96, 78);
		panel_1_1_1.add(btnModificar);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setIcon(new ImageIcon(JFrmManClientes.class.getResource("/img/cancelar 64.png")));
		btnCancelar.setBounds(10, 222, 96, 82);
		panel_1_1_1.add(btnCancelar);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(JFrmManClientes.class.getResource("/img/guardar 64.png")));
		btnGuardar.setBounds(116, 31, 102, 78);
		panel_1_1_1.add(btnGuardar);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon(JFrmManClientes.class.getResource("/img/eliminar 64.png")));
		btnEliminar.setBounds(116, 133, 102, 78);
		panel_1_1_1.add(btnEliminar);
		
		JButton btnSalida = new JButton("");
		btnSalida.setIcon(new ImageIcon(JFrmManClientes.class.getResource("/img/salida.png")));
		btnSalida.setBounds(116, 222, 102, 82);
		panel_1_1_1.add(btnSalida);

	}
}
