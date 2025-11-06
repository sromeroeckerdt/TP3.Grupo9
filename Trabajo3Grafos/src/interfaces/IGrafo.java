package interfaces;

import java.util.Set;

import modelo.Nodo;

public interface IGrafo<T> {
	
	//Pre-Condición: Debe haber un nodo existente que agregar
	//Post-Condición: Se debe agregar el nodo al grafo
	void agregarNodo (T valor);
	
	//Pre-Condición: Deben hacer nodos existentes para poder relacionarlos
	//Post-Condición: Se debe crear la relación completa, con vertices (nodos) y sus relaciones (aristas) en tanto vertices que comienzan una relacion y decantan en otro vertice (Object inicio y Object destino)
	void agregarArista(T origen, T destino);
	
	//Pre-Condición: Debe haber vertices relacionados para poder llevar esto a la representación matricial
	//Post-Condición: Se debe lograr representar las relaciones entre los distintos vertices en formato de matriz de adyacencia
	void matrizDeAdyacencia();
	
	//Pre-Condición:Deben haber relaciones entre vertices
	//Post-Condición: Se debe lograr recorrer las relaciones en algoritmo bfs (recorrido de anchura)
	public void bfs(T valorInicial);
	
	//Pre-Condición: Deben haber relaciones entre vertices
	//Post-Condición: Se debe lograr recorrer las relaciones en algoritmo dfs (recorrido en profundidad)
	public void dfs(T valorInicial);
	
	//Pre-Condición: El nodo (vertice) debe existir en el grafo
	//Post-Condición: Se debe recorrer todo el grafo usando este método en recursividad
	public void dfsRec(INodo actual, Set<T> visitados);

}
