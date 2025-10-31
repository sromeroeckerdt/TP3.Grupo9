package modelo;

import java.util.ArrayList;

import interfaces.IPersona;

public class Persona implements IPersona{
	
	
	private String nombreCompleto;
	private int edad;
	private String dni;
	private float altura;
	private float peso;
	private Contacto contactos;
	
	
	public Persona(String nombreCompleto, int edad, String dni, float altura, float peso,
			Contacto contactos) {
		this.nombreCompleto = nombreCompleto;
		this.edad = edad;
		this.dni = dni;
		this.altura = altura;
		this.peso = peso;
		this.contactos = contactos;
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Contacto getContactos() {
		return contactos;
	}
	@Override
	public void setContactos(Contacto contactos) {
		this.contactos = contactos;
	}
	
	
	
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto +
				", edad=" + edad + ", dni=" + dni +
				", altura=" + altura + ", peso=" + peso +
				", contactos=" + contactos + "]";
	}
	
	
	
	

}
