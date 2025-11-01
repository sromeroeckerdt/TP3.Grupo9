package test;

import modelo.Contacto;
import modelo.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Contacto con1 = new Contacto("eckerdtsofia23@gmail.com", "1154410941", "Malvinas");
		Persona per1 = new Persona("Sofia Romero", 23, "44423506", 1.60f, 63.5f, con1);
		Persona per2 = new Persona();
		per2.setNombreCompleto("Sofia Eckerdt");
		per2.setEdad(22);
		per2.setDni("21040197");
		per2.setAltura(1.62f);
		per2.setPeso(80.3f);
		per2.setContactos(con1);
		
		
		System.out.println(per1.toString());
		System.out.println(per2.toString());
		

	}

}
