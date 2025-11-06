package interfaces;

import java.util.ArrayList;

import modelo.Contacto;

public interface IPersona {
	
	//Pre-Condición: 
	//Post-Condición: 
	public String getNombreCompleto();
	
	//Pre-Condición:
	//Post-Condición: 
	public void setNombreCompleto(String nombreCompleto);
	
	//Pre-Condición:
	//Post-Condición:
	public int getEdad();
	
	//Pre-Condición:
	//Post-Condición: 
	public void setEdad(int edad);
	
	//Pre-Condición:
	//Post-Condición:
	public String getDni();
	
	//Pre-Condición:
	//Post-Condición: 
	public void setDni(String dni);
	
	//Pre-Condición:
	//Post-Condición:
	public float getAltura();
	
	//Pre-Condición:
	//Post-Condición:
	public void setAltura(float altura);
	
	//Pre-Condición:
	//Post-Condición:
	public float getPeso();
	
	//Pre-Condición:
	//Post-Condición:
	public void setPeso(float peso);
	
	//Pre-Condición:
	//Post-Condición:
	public Contacto getContactos();
	
	//Pre-Condición:
	//Post-Condición:
	public void setContactos(Contacto contactos);
	
	//Pre-Condición:
	//Post-Condición:
	public String toString();

}
