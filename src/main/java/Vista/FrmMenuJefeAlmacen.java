package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FrmMenuJefeAlmacen extends JFrame {
	private JLabel escritorio;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMenuJefeAlmacen frame = new FrmMenuJefeAlmacen();
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
	public FrmMenuJefeAlmacen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 575);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmManProveedor = new JMenuItem("Mantenimiento Categoria");
		mnMantenimiento.add(mntmManProveedor);
		
		JMenuItem mntmProductos = new JMenuItem("Mantemiento Productos");
		mnMantenimiento.add(mntmProductos);
		
		JMenuItem mntmManEmpleado = new JMenuItem("Mantenimiento Laboratorio");
		mnMantenimiento.add(mntmManEmpleado);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		JMenuItem mntmReporte = new JMenuItem("Reporte de Productos");
		mnReportes.add(mntmReporte);
		
		JMenu mnNewMenu = new JMenu("Acerca de");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		escritorio = new JLabel("");
		escritorio.setIcon(new ImageIcon(FrmMenuJefeAlmacen.class.getResource("/img/farmacia.jpg")));
		contentPane.add(escritorio, BorderLayout.CENTER);
	}

}
