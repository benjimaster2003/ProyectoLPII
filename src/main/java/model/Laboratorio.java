package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the laboratorio database table.
 * 
 */
@Entity
@NamedQuery(name="Laboratorio.findAll", query="SELECT l FROM Laboratorio l")
public class Laboratorio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int laboratorioId;

	private String descLaboratorio;

	private String nomLaboratorio;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="laboratorio")
	private List<Producto> productos;

	public Laboratorio() {
	}

	public int getLaboratorioId() {
		return this.laboratorioId;
	}

	public void setLaboratorioId(int laboratorioId) {
		this.laboratorioId = laboratorioId;
	}

	public String getDescLaboratorio() {
		return this.descLaboratorio;
	}

	public void setDescLaboratorio(String descLaboratorio) {
		this.descLaboratorio = descLaboratorio;
	}

	public String getNomLaboratorio() {
		return this.nomLaboratorio;
	}

	public void setNomLaboratorio(String nomLaboratorio) {
		this.nomLaboratorio = nomLaboratorio;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setLaboratorio(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setLaboratorio(null);

		return producto;
	}

}