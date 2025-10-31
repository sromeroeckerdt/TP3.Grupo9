package modelo;

import interfaces.IContacto;

public class Contacto implements IContacto{
	
	private String mail;
	private String telefono;
	private String direccion;
	
	
	
	
	
	public Contacto(String mail, String telefono, String direccion) {
		this.mail = mail;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	@Override
	public String toString() {
		return "Contacto [mail=" + mail 
				+ ", telefono=" + telefono +
				", direccion=" + direccion + "]";
	}
	
	
	
	

}
