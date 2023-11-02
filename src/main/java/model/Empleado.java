package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the empleados database table.
 * 
 */
@Entity
@Table(name="empleados")
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empleados_ID;

	private String apeMaterno;

	private String apePaterno;

	private String direccion;

	private String dni;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date fecNacimiento;

	private String nombres;

	private String sexo;

	private String telefono;

	//bi-directional many-to-one association to Cargo
	@ManyToOne
	@JoinColumn(name="id_cargo")
	private Cargo cargo;

	public Empleado() {
	}

	public int getEmpleados_ID() {
		return this.empleados_ID;
	}

	public void setEmpleados_ID(int empleados_ID) {
		this.empleados_ID = empleados_ID;
	}

	public String getApeMaterno() {
		return this.apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getApePaterno() {
		return this.apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecNacimiento() {
		return this.fecNacimiento;
	}

	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}