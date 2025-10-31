package interfaces;

public interface IGrafo {
	void agregarNodo (Object valor);
	void agregarArista(Object origen, Object destino);
	void matrizDeAdyacencia();
	public void bfs(Object inicio);
	public void dfs(Object inicio);

}
