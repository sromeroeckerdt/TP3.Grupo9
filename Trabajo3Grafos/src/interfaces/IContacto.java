package interfaces;

public interface IContacto {
	
	
	//Pre-Condición:  No requiere nada especial, alcanza con que el contacto exista
	//Post-Condición: Devuelve el texto actualmente guardado como mail, no modifica ningun dato del contacto
	public String getMail();
	//Pre-Condición: Se recibe un texto para usar como mail (puede venir vacío o con cualquier contenido)
	//Post-Condición: El mail del contacto queda actualizado con el texto recibido, no modifica el telefono ni direccion
	public void setMail(String mail);
	//Pre-Condición: Sin pre-Condicion requerida
	//Post-Condición: Devuelve el texto actualmente guardado como telefono, no modifica datos del contacto
	public String getTelefono();
	//Pre-Condición: Se recibe un texto para usar como telefono
	//Post-Condición: El telefono del contacto queda actualizado con el texto recibido
	public void setTelefono(String telefono);
	//Pre-Condición: Sin requerimientos anteriores
	//Post-Condición: Devuelve el texto actualmente guardado como direccion
	public String getDireccion();
	//Pre-Condición: Recibimos un texto que queda guardado como direccion
	//Post-Condición: La direccio del contacto queda actualizada con el texto recibido
	public void setDireccion(String direccion);
	//Pre-Condición: El contacto existe, no importa si aun no tiene datos cargados
	//Post-Condición: Devuelve un texto descriptivo con el sig formato:"Contacto [mail=<mail>, telefono=<telefono>, direccion=<direccion>]"
	public String toString();

}
