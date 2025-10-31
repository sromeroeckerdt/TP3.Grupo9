package interfaces;

import java.util.ArrayList;

import modelo.Contacto;

public interface IPersona {
	
	public String getNombreCompleto();
	public void setNombreCompleto(String nombreCompleto);
	public int getEdad();
	public void setEdad(int edad);
	public String getDni();
	public void setDni(String dni);
	public float getAltura();
	public void setAltura(float altura);
	public float getPeso();
	public void setPeso(float peso);
	public Contacto getContactos();
	public void setContactos(Contacto contactos);
	public String toString();

}
