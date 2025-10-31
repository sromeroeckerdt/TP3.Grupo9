package modelo;

import java.util.HashMap;
import java.util.Map;

import interfaces.IGrafo;

public class Grafo implements IGrafo{
	
	private Map<Object, Nodo> nodos = new HashMap<>();



	public void agregarNodo(Object valor) {
		if (!nodos.containsKey(valor)){
			nodos.put(valor, new Nodo(valor));
		
		}
	}
	
	
	public void agregarArista(Object origen, Object destino) {
		if (nodos.containsKey(origen) && nodos.containsKey(destino)) {
			Nodo nodoOrigen = nodos.get(origen);
			Nodo nodoDestino = nodos.get(destino);
			nodoOrigen.agregarVecino(nodoDestino);
		}
	}

	public void matrizDeAdyacencia() {
		// TODO Auto-generated method stub
		
	}
	
	public void bfs(Object inicio) {
		
	}
	
	public void dfs(Object inicio) {
		
		
	}


	@Override
	public String toString() {
		return "Grafo [nodos=" + nodos + "]";
	}
	
	
}














