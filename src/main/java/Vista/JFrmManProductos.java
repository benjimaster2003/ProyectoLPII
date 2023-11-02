package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;
import javax.swing.JMenu;
import java.awt.Panel;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import com.toedter.calendar.JDateChooser;

public class JFrmManProductos extends JInternalFrame {
	private JTextField txtBuscar;
	private JTable table;
	private JTextField txtProducto;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtStock;
	private JTextField txtDescripcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrmManProductos frame = new JFrmManProductos();
					
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
	public JFrmManProductos() {
		setTitle("Mantenimiento Productos");
		setBounds(100, 100, 955, 787);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Productos");
		lblNewLabel.setIcon(new ImageIcon(JFrmManProductos.class.getResource("/img/12617409_Kerfin7-NEA-2129.jpg")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(378, 0, 169, 56);
		getContentPane().add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 378, 923, 214);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ID Producto:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 23, 84, 13);
		panel_2.add(lblNewLabel_2);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(105, 21, 161, 19);
		panel_2.add(txtProducto);
		txtProducto.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(293, 24, 94, 13);
		panel_2.add(lblNewLabel_3);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(351, 21, 307, 19);
		panel_2.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio.setBounds(10, 57, 74, 13);
		panel_2.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(76, 55, 96, 19);
		panel_2.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblStock = new JLabel("Stock:");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStock.setBounds(221, 58, 45, 13);
		panel_2.add(lblStock);
		
		txtStock = new JTextField();
		txtStock.setBounds(276, 55, 96, 19);
		panel_2.add(txtStock);
		txtStock.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Descripcion:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(400, 57, 94, 13);
		panel_2.add(lblNewLabel_4);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(504, 55, 409, 19);
		panel_2.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JLabel lblLaboratorio = new JLabel("Laboratorio:");
		lblLaboratorio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLaboratorio.setBounds(10, 93, 102, 13);
		panel_2.add(lblLaboratorio);
		
		JComboBox cboLaboratorio = new JComboBox();
		cboLaboratorio.setModel(new DefaultComboBoxModel(new String[] {"Abbott Laboratories", "B. Braun Medical Perú S.A.", "Crespal S.A.", "DUBONP S.A.", "Grünenthal Peruana S.A."}));
		cboLaboratorio.setBounds(100, 90, 166, 21);
		panel_2.add(cboLaboratorio);
		
		JLabel lblFechaVenci = new JLabel("Fecha de Vencimiento:");
		lblFechaVenci.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFechaVenci.setBounds(380, 94, 147, 12);
		panel_2.add(lblFechaVenci);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(537, 92, 228, 19);
		panel_2.add(dateChooser);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTipo.setBounds(10, 125, 45, 13);
		panel_2.add(lblTipo);
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Analgésicos antiinflamatorios", "Antipiréticos", "Antialérgicos", "Antidiarreicos", "Antimicóticos"}));
		cboTipo.setBounds(55, 122, 199, 21);
		panel_2.add(cboTipo);
		
		JLabel lblUnidad = new JLabel("Unidad Medida:");
		lblUnidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUnidad.setBounds(383, 129, 111, 13);
		panel_2.add(lblUnidad);
		
		JComboBox cboUnidad = new JComboBox();
		cboUnidad.setModel(new DefaultComboBoxModel(new String[] {"Gramos (g) ", "Gramos por decilitro (g/dL) ", "Gramos por litro (g/L) ", "Microgramos (mcg) ", "Microgramos por decilitro (mcg/dL) ", "Microgramos por litro (mcg/L) "}));
		cboUnidad.setBounds(504, 126, 177, 21);
		panel_2.add(cboUnidad);
		
		JLabel lblProveedor = new JLabel("Proveedor:");
		lblProveedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProveedor.setBounds(10, 162, 118, 13);
		panel_2.add(lblProveedor);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(105, 159, 237, 21);
		panel_2.add(comboBox_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Buscar Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 57, 923, 309);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 27, 76, 13);
		panel.add(lblNewLabel_1);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(69, 25, 220, 19);
		panel.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JLabel lblFiltrar = new JLabel("Filtrar por:");
		lblFiltrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFiltrar.setBounds(316, 28, 76, 13);
		panel.add(lblFiltrar);
		
		JComboBox cboFiltrar = new JComboBox();
		cboFiltrar.setModel(new DefaultComboBoxModel(new String[] {"codigo", "nombre"}));
		cboFiltrar.setBounds(402, 24, 238, 21);
		panel.add(cboFiltrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(JFrmManProductos.class.getResource("/img/research.png")));
		btnBuscar.setBounds(689, 22, 156, 53);
		panel.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 88, 903, 211);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"IDProducto", "Nombre", "Descripcion", "Vencimiento", "Precio", "Stock", "Laboratorio", "Tipo", "Proveedor", "Unidad Medida"
			}
		));
		table.getColumnModel().getColumn(9).setPreferredWidth(102);
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Operaciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(65, 609, 836, 139);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon(JFrmManProductos.class.getResource("/img/registar 64.png")));
		btnRegistrar.setBounds(38, 26, 93, 86);
		panel_1.add(btnRegistrar);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(JFrmManProductos.class.getResource("/img/guardar 64.png")));
		btnGuardar.setBounds(156, 26, 101, 86);
		panel_1.add(btnGuardar);
		
		JButton btnModificar = new JButton("");
		btnModificar.setIcon(new ImageIcon(JFrmManProductos.class.getResource("/img/modificar 64).png")));
		btnModificar.setBounds(279, 26, 101, 86);
		panel_1.add(btnModificar);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon(JFrmManProductos.class.getResource("/img/eliminar 64.png")));
		btnEliminar.setBounds(402, 26, 101, 86);
		panel_1.add(btnEliminar);
		
		JButton btnSalida = new JButton("");
		btnSalida.setIcon(new ImageIcon(JFrmManProductos.class.getResource("/img/salida.png")));
		btnSalida.setBounds(664, 26, 110, 86);
		panel_1.add(btnSalida);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.setIcon(new ImageIcon(JFrmManProductos.class.getResource("/img/actualizar-flecha.png")));
		btnActualizar.setBounds(522, 26, 110, 86);
		panel_1.add(btnActualizar);

	}
}
