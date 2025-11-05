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
	
	public Persona() { }

	@Override
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	@Override
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	@Override
	public int getEdad() {
		return edad;
	}
	
	@Override
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String getDni() {
		return dni;
	}
	
	@Override
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public float getAltura() {
		return altura;
	}
	
	@Override
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	@Override
	public float getPeso() {
		return peso;
	}
	
	@Override
	public void setPeso(float peso) {
		this.peso = peso;
	}
	@Override
	public Contacto getContactos() {
		return contactos;
	}
	@Override
	public void setContactos(Contacto contactos) {
		this.contactos = contactos;
	}
	
	
	
	public String toString() {
		return nombreCompleto;
	}
	
	
	
	

}
