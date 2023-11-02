package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the productos database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int producto_ID;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fechaVenci;

	private String nombre;

	private BigDecimal precio;

	private int stock;

	private String uniMedida;

	//bi-directional many-to-one association to Detalleventa
	@OneToMany(mappedBy="producto")
	private List<Detalleventa> detalleventas;

	//bi-directional many-to-one association to Laboratorio
	@ManyToOne
	@JoinColumn(name="laboratorioId")
	private Laboratorio laboratorio;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="Categoria_ID")
	private Categoria categoria;

	//bi-directional many-to-one association to Proveedore
	@ManyToOne
	@JoinColumn(name="Proveedor_ID")
	private Proveedore proveedore;

	public Producto() {
	}

	public int getProducto_ID() {
		return this.producto_ID;
	}

	public void setProducto_ID(int producto_ID) {
		this.producto_ID = producto_ID;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaVenci() {
		return this.fechaVenci;
	}

	public void setFechaVenci(Date fechaVenci) {
		this.fechaVenci = fechaVenci;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getUniMedida() {
		return this.uniMedida;
	}

	public void setUniMedida(String uniMedida) {
		this.uniMedida = uniMedida;
	}

	public List<Detalleventa> getDetalleventas() {
		return this.detalleventas;
	}

	public void setDetalleventas(List<Detalleventa> detalleventas) {
		this.detalleventas = detalleventas;
	}

	public Detalleventa addDetalleventa(Detalleventa detalleventa) {
		getDetalleventas().add(detalleventa);
		detalleventa.setProducto(this);

		return detalleventa;
	}

	public Detalleventa removeDetalleventa(Detalleventa detalleventa) {
		getDetalleventas().remove(detalleventa);
		detalleventa.setProducto(null);

		return detalleventa;
	}

	public Laboratorio getLaboratorio() {
		return this.laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Proveedore getProveedore() {
		return this.proveedore;
	}

	public void setProveedore(Proveedore proveedore) {
		this.proveedore = proveedore;
	}

}