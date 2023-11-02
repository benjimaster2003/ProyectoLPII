package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class JFrmManCategoria extends JInternalFrame {
	private JTextField txtBuscar;
	private JTable table;
	private JTextField txtCategoria;
	private JTextField txtNombre;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrmManCategoria frame = new JFrmManCategoria();
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
	public JFrmManCategoria() {
		setBounds(100, 100, 895, 950);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 883, 164);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCategoria.setBounds(382, 44, 147, 56);
		panel.add(lblCategoria);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JFrmManCategoria.class.getResource("/img/categorias.png")));
		lblNewLabel.setBounds(173, 0, 139, 154);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Buscar Categoria", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 188, 863, 331);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 29, 89, 13);
		panel_1.add(lblNewLabel_1);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(71, 27, 275, 19);
		panel_1.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Filtrar por:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(385, 30, 109, 13);
		panel_1.add(lblNewLabel_2);
		
		JComboBox cboFiltrar = new JComboBox();
		cboFiltrar.setModel(new DefaultComboBoxModel(new String[] {"codigo", "nombre"}));
		cboFiltrar.setBounds(470, 26, 165, 21);
		panel_1.add(cboFiltrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(JFrmManCategoria.class.getResource("/img/research.png")));
		btnBuscar.setBounds(673, 25, 142, 69);
		panel_1.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 108, 843, 213);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"ID Categoria", "Nombre", "Descripcion"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Datos de Categoria", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 529, 444, 277);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCate = new JLabel("ID Categoria:");
		lblCate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCate.setBounds(10, 30, 118, 13);
		panel_2.add(lblCate);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(106, 28, 96, 19);
		panel_2.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(10, 78, 101, 13);
		panel_2.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(74, 76, 360, 19);
		panel_2.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDescrip = new JLabel("Descripcion:");
		lblDescrip.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescrip.setBounds(10, 115, 79, 13);
		panel_2.add(lblDescrip);
		
		textField = new JTextField();
		textField.setBounds(99, 113, 335, 19);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Operaciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(464, 529, 409, 277);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon(JFrmManCategoria.class.getResource("/img/registar 64.png")));
		btnRegistrar.setBounds(10, 28, 100, 78);
		panel_3.add(btnRegistrar);
		
		JButton btnModificar = new JButton("");
		btnModificar.setIcon(new ImageIcon(JFrmManCategoria.class.getResource("/img/modificar 64).png")));
		btnModificar.setBounds(240, 28, 121, 78);
		panel_3.add(btnModificar);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon(JFrmManCategoria.class.getResource("/img/eliminar 64.png")));
		btnEliminar.setBounds(10, 116, 110, 102);
		panel_3.add(btnEliminar);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(JFrmManCategoria.class.getResource("/img/actualizar-flecha.png")));
		btnNewButton_4.setBounds(130, 116, 100, 102);
		panel_3.add(btnNewButton_4);
		
		JButton btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(JFrmManCategoria.class.getResource("/img/salida.png")));
		btnSalir.setBounds(240, 116, 121, 102);
		panel_3.add(btnSalir);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(JFrmManCategoria.class.getResource("/img/guardar 64.png")));
		btnGuardar.setBounds(120, 28, 110, 78);
		panel_3.add(btnGuardar);

	}

}
