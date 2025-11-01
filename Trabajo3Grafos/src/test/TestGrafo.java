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
		
		
		IGrafo<Persona> grafo = new Grafo<Persona>();
		
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
		
		
		//---------------------------------------------------------------------------
		//PRUEBAS CON TIPO INTEGER
		
		/* IGrafo<Integer> grafo = new Grafo<Integer>();
		
		grafo.agregarNodo(1);
		grafo.agregarNodo(5);
		grafo.agregarNodo(4);
		grafo.agregarNodo(8);
		grafo.agregarNodo(7);
		grafo.agregarNodo(12);
		grafo.agregarNodo(11);
		grafo.agregarNodo(15);
		
		
		grafo.agregarArista(1, 5);
		grafo.agregarArista(1, 4);
		grafo.agregarArista(5, 8);
		grafo.agregarArista(5, 4);
		grafo.agregarArista(5, 7);
		grafo.agregarArista(4, 12);
		grafo.agregarArista(15, 8);
		grafo.agregarArista(11, 12);
		grafo.agregarArista(11, 15);
		
		
		
		grafo.toString();
		
		System.out.println("\nRecorrido BFS: "); 
		grafo.bfs(1);
		
		//Recorrido BFS: 
		//1 5 4 8 7 12 15 11 
		
		System.out.println("\n\nRecorrido DFS: ");
		grafo.dfs(1);
		
		//Recorrido DFS:
		//1 4 12 11 15 8 5 7
		
		*/
		
		
		//---------------------------------------------------------------------------
				//PRUEBAS CON TIPO STRING
				
			/* IGrafo<String> grafo = new Grafo<String>();
				
				grafo.agregarNodo("Uno");
				grafo.agregarNodo("Cinco");
				grafo.agregarNodo("Cuatro");
				grafo.agregarNodo("Ocho");
				grafo.agregarNodo("Siete");
				grafo.agregarNodo("Doce");
				grafo.agregarNodo("Once");
				grafo.agregarNodo("Quince");
				
				
				grafo.agregarArista("Uno", "Cinco");
				grafo.agregarArista("Uno", "Cuatro");
				grafo.agregarArista("Cinco", "Ocho");
				grafo.agregarArista("Cinco", "Cuatro");
				grafo.agregarArista("Cinco", "Siete");
				grafo.agregarArista("Cuatro", "Doce");
				grafo.agregarArista("Quince", "Ocho");
				grafo.agregarArista("Once", "Doce");
				grafo.agregarArista("Once", "Quince");
				
				
				
				grafo.toString();
				
				System.out.println("\nRecorrido BFS: "); 
				grafo.bfs("Uno");
				
				//Recorrido BFS: 
				//Uno Cinco Cuatro Ocho Siete Doce Quince Once
				
				System.out.println("\n\nRecorrido DFS: ");
				grafo.dfs("Uno");
				
				//Recorrido DFS:
				//Uno Cuatro Doce Once Quince Ocho Cinco Siete
				*/
		
		
	}
		

}
