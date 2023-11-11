package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_proveedor database table.
 * 
 */
@Entity
@Table(name="tbl_proveedor")
@NamedQuery(name="TblProveedor.findAll", query="SELECT t FROM TblProveedor t")
public class TblProveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproveedor;

	private String direc;

	private String email;

	private String nomcomer;

	private String razonsocial;

	private String ruc;

	private String telef;

	public TblProveedor() {
	}

	public int getIdproveedor() {
		return this.idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getDirec() {
		return this.direc;
	}

	public void setDirec(String direc) {
		this.direc = direc;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomcomer() {
		return this.nomcomer;
	}

	public void setNomcomer(String nomcomer) {
		this.nomcomer = nomcomer;
	}

	public String getRazonsocial() {
		return this.razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelef() {
		return this.telef;
	}

	public void setTelef(String telef) {
		this.telef = telef;
	}

}