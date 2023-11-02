package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the proveedores database table.
 * 
 */
@Entity
@Table(name="proveedores")
@NamedQuery(name="Proveedore.findAll", query="SELECT p FROM Proveedore p")
public class Proveedore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int proveedor_ID;

	private String direccion;

	private String email;

	private String nombreProveedor;

	private String ruc;

	private String telefono;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="proveedore")
	private List<Producto> productos;

	public Proveedore() {
	}

	public int getProveedor_ID() {
		return this.proveedor_ID;
	}

	public void setProveedor_ID(int proveedor_ID) {
		this.proveedor_ID = proveedor_ID;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreProveedor() {
		return this.nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setProveedore(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setProveedore(null);

		return producto;
	}

}