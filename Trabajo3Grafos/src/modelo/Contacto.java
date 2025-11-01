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
	

	@Override
	public String getMail() {
		return mail;
	}
	
	@Override
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	@Override
	public String getTelefono() {
		return telefono;
	}
	
	@Override
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String getDireccion() {
		return direccion;
	}
	@Override
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
