/**
 * 
 */
package com.programacion.funcional;

/**
 * @author 1829733
 *
 */
public class Cliente {
	
	public String fullname;
	public String nid;
	public String direccion;
	public String telefono;
	
	public Cliente(String fullname, String nid, String direccion, String telefono) {
		this.fullname = fullname;
		this.nid = nid;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}
