package interfaces;

import java.util.Set;

import modelo.Nodo;

public interface IGrafo {
	
	//Pre-Condición: debe haber un nodo existente que agregar
	//Post-Condición: se debe agregar el nodo al grafo
	void agregarNodo (Object valor);
	
	//Pre-Condición: deben hacer nodos existentes para poder relacionarlos
	//Post-Condición: se debe crear la relación completa, con vertices (nodos) y sus relaciones (aristas) en tanto vertices que comienzan una relacion y decantan en otro vertice (Object inicio y Object destino)
	void agregarArista(Object origen, Object destino);
	
	//Pre-Condición: debe haber vertices relacionados para poder llevar esto a la representación matricial
	//Post-Condición: se debe lograr representar las relaciones entre los distintos vertices en formato de matriz de adyacencia
	void matrizDeAdyacencia();
	
	//Pre-Condición: deben haber relaciones entre vertices
	//Post-Condición: se debe lograr recorrer las relaciones en algoritmo bfs (recorrido de anchura)
	public void bfs(Object valorInicial);
	
	//Pre-Condición: deben haber relaciones entre vertices
	//Post-Condición: se debe lograr recorrer las relaciones en algoritmo dfs (recorrido en profundidad)
	public void dfs(Object valorInicial);
	
	//Pre-Condición:
	//Post-Condición:
	public void dfsRec(INodo actual, Set<Object> visitados);

}
