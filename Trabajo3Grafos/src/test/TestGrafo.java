package test;

import interfaces.IGrafo;
import modelo.Contacto;
import modelo.Grafo;
import modelo.Nodo;
import modelo.Persona;

public class TestGrafo {

	public static void main(String[] args) {
		
		
		Contacto c1 = new Contacto("sofiaromeroeck@gmail.com", "1154140941", "Juan Recarte");
		Persona p1 = new Persona("Sofia", 23, "44423507", 1.60F , 69.0f , c1);
		Persona p2 = new Persona("Sofi", 23, "44423507", 1.60F , 69.0f , c1);
		Persona p3 = new Persona("Sof", 23, "44423507", 1.60F , 69.0f , c1);
		Persona p4 = new Persona("So", 23, "44423507", 1.60F , 69.0f , c1);
		Persona p5 = new Persona("S", 23, "44423507", 1.60F , 69.0f , c1);
		Persona p6 = new Persona("Yazmin", 23, "44423507", 1.60F , 69.0f , c1);
		Persona p7 = new Persona("Yaz", 23, "44423507", 1.60F , 69.0f , c1);
		Persona p8 = new Persona("Yazi", 23, "44423507", 1.60F , 69.0f , c1);
		
		
		IGrafo grafo = new Grafo();
		
		grafo.agregarNodo(p1);
		grafo.agregarNodo(p2);
		grafo.agregarNodo(p3);
		grafo.agregarNodo(p4);
		grafo.agregarNodo(p5);
		grafo.agregarNodo(p6);
		grafo.agregarNodo(p7);
		grafo.agregarNodo(p8);
		
		
		grafo.agregarArista(p1, p2);
		grafo.agregarArista(p1, p3);
		grafo.agregarArista(p2, p4);
		grafo.agregarArista(p2, p3);
		grafo.agregarArista(p2, p5);
		grafo.agregarArista(p3, p6);
		grafo.agregarArista(p8, p4);
		grafo.agregarArista(p7, p6);
		grafo.agregarArista(p7, p8);
		
		
		
		grafo.toString();
		
		System.out.println("\nRecorrido BFS: ");
		grafo.bfs(p1);
		
		System.out.println("\n\nRecorrido DFS: ");
		grafo.dfs(p1);
		
		
		

		
		
		
		
		
	}
		

}
