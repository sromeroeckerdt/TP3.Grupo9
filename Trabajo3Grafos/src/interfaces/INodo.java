package interfaces;

public interface INodo<T> {
	
	//Pre-Condición: No requiere nada, basta con que el nodo exista en el grafo
	//Post-Condición: Devuelve el valor actualmente almacenado en el nodo
    T getValor();
    
    //Pre-Condición: Se recibe un nuevo valor que se desea guardar dentro del nodo, no es necesario que cumpla un formato específico
  	//Post-Condición: El nodo actualiza su valor interno con el dato recibido, no se altera la lista de vecinos del nodo
    void setValor(T valor);
    
    //Pre-Condición: Se recibe un nodo vecino que se desea asociar con este nodo, debe existir un nodo válido como parametro (no nulo)
  	//Post-Condición: Si el vecino no estaba en la lista, se agrega como nuevo vecino del nodo actual, si ya existia, la lista de vecinos permanece igual
    void agregarVecino(INodo vecino);
}
