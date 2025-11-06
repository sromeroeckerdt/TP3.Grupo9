package interfaces;

import java.util.ArrayList;

import modelo.Contacto;

public interface IPersona {
	
	//Pre-Condición: No requiere nada especial
	//Post-Condición: Devuelve el nombre completo actualmente guardado en la persona
	public String getNombreCompleto();
	
	//Pre-Condición:  Se recibe un texto para usar como nombre completo (puede venir vacío o con cualquier contenido)
	//Post-Condición: El nombre de la persona queda actualizado con el texto recibido
	public void setNombreCompleto(String nombreCompleto);
	
	//Pre-Condición:No requiere nada especial
	//Post-Condición: Devuelve la edad actualmente almacenada en la persona
	public int getEdad();
	
	//Pre-Condición: Se recibe un número entero que representa la edad de la persona, debe ser mayor o igual a 0 (no se admiten edades negativas)
	//Post-Condición: La edad de la persona queda actualizada con elv alor recibido
	public void setEdad(int edad);
	
	//Pre-Condición: No requiere nada especial
	//Post-Condición: Devuelve el número de documento (DNI) actualmente guardado en la person
	public String getDni();
	
	//Pre-Condición: Se recibe un texto representando el DNI (puede incluir letras o números)
	//Post-Condición: El DNI de la persona queda actualizado con el valor recibido
	public void setDni(String dni);
	
	//Pre-Condición: No requiere nada especial
	//Post-Condición: Devuelve la altura actualmente almacenada en la persona (en metros o centimetros, segun el caso)
	public float getAltura();
	
	//Pre-Condición: Se recibe un valor decimal que representa la altura de la persona, debe ser un número positivo.
	//Post-Condición: La altura de la persona queda actualizada con el valor recibido
	public void setAltura(float altura);
	
	//Pre-Condición: No requiere nada
	//Post-Condición: Devuelve el peso actualmente almacenado en la persona (en kg)
	public float getPeso();
	
	//Pre-Condición: Se recibe un valor decimal positivo que representa el peso de la persona
	//Post-Condición:El peso de la persona queda actualizado con el valor recibido
	public void setPeso(float peso);
	
	//Pre-Condición: No requiere nada
	//Post-Condición:Devuelve el objeto Contacto asociado a la persona (puede ser null si aún no fue asignado)
	public Contacto getContactos();
	
	//Pre-Condición: Se recibe un objeto Contacto válido que se desea asociar a la persona
	//Post-Condición: El contacto de la persona queda actualizado con el objeto recibido
	public void setContactos(Contacto contactos);
	
	//Pre-Condición: Sin requerimentos
	//Post-Condición: Devuelve una representación en texto de la persona, mostrando sus datos en un formato legible: nombre, edad, DNI, altura, peso y contacto
	public String toString();

}
