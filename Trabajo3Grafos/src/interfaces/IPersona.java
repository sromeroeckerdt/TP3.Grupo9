package interfaces;

import java.util.ArrayList;

import modelo.Contacto;

public interface IPersona {
	
	//Pre-Condición: debe estar instanciada la clase Persona teniendo nombreCompleto un valor tipo String ya asignado
	//Post-Condición: se debe retornar el valor del atributo nombreCompleto
	public String getNombreCompleto();
	
	//Pre-Condición:debe estar instanciada la clase Persona
	//Post-Condición: debe haber un valor tipo String en del atributo nombreCompleto
	public void setNombreCompleto(String nombreCompleto);
	
	//Pre-Condición:
	//Post-Condición:
	public int getEdad();
	
	//Pre-Condición:debe estar instanciada la clase Persona
	//Post-Condición: debe haber un valor tipo int en del atributo edad
	public void setEdad(int edad);
	
	//Pre-Condición:
	//Post-Condición:
	public String getDni();
	
	//Pre-Condición:debe estar instanciada la clase Persona
	//Post-Condición: debe haber un valor tipo String en del atributo dni
	public void setDni(String dni);
	
	//Pre-Condición:
	//Post-Condición:
	public float getAltura();
	
	//Pre-Condición:debe estar instanciada la clase Persona
	//Post-Condición: debe haber un valor tipo float en del atributo altura
	public void setAltura(float altura);
	
	//Pre-Condición:
	//Post-Condición:
	public float getPeso();
	
	//Pre-Condición:debe estar instanciada la clase Persona
	//Post-Condición: debe haber un valor tipo float en del atributo peso
	public void setPeso(float peso);
	
	//Pre-Condición:
	//Post-Condición:
	public Contacto getContactos();
	
	//Pre-Condición:debe estar instanciada la clase Persona
	//Post-Condición: debe haber un valor tipo Contacto en del atributo contacto
	public void setContactos(Contacto contactos);
	
	//Pre-Condición:
	//Post-Condición:
	public String toString();

}
