package modelo;

import java.util.HashMap;
import java.util.Map;

import interfaces.IGrafo;

public class Grafo implements IGrafo{
	
	private Map<Integer, Nodo> nodos = new HashMap<>();



	public void agregarNodo(int valor) {
		if (!nodos.containsKey(valor)){
			nodos.put(valor, new Nodo(valor));
		
		}
	}
	
	
	public void agregarArista(int origen, int destino) {
		if (nodos.containsKey(origen) && nodos.containsKey(destino)) {
			Nodo nodoOrigen = nodos.get(origen);
			Nodo nodoDestino = nodos.get(destino);
			nodoOrigen.agregarVecino(nodoDestino);
		}
	}

	public void matrizDeAdyacencia() {
		// TODO Auto-generated method stub
		
	}
}














