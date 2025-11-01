package modelo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.List;

import interfaces.IGrafo;
import interfaces.INodo;

public class Grafo<T> implements IGrafo<T>{
	
	private Map<T, Nodo> nodos = new HashMap<>();



	@Override
	public void agregarNodo(T valor) { //se agrega un nodo (un vertice)
		if (!(nodos.containsKey(valor))){ //se chequea que el nodo que se quiere agregar no esté ya agregado 
			nodos.put(valor, new Nodo(valor)); //se agrega valor (tipo object en este caso), es valor es un identificador (id), y se crea el valor como nuevo nodo
		
		}
	}
	
	
	@Override
	public void agregarArista(T origen, T destino) { //relacion entre un nodo vertice donde comienza la relación y otro vertice donde decanta la relación
		if (nodos.containsKey(origen) && nodos.containsKey(destino)) { //se chequea si los dos vertices que se buscan relacionar ya existen, si es así entonces el condicional se ejecuta para poder relacionarlos
			INodo nodoOrigen = nodos.get(origen); //se le asigna el nodo de Map donde comienza la relacion a la variable nodoOrigen de tipo Nodo
			INodo nodoDestino = nodos.get(destino); //se le asigna el nodo de Map donde decanta la relación a la variable nodoDestino de tipo Nodo
			nodoOrigen.agregarVecino(nodoDestino); //origen se relaciona con destino-->no dirigido
			nodoDestino.agregarVecino(nodoOrigen); //destino se relaciona con origen-->no dirigido
		}
		
	}

	
	@Override
	public void matrizDeAdyacencia() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void bfs(T valorInicial) { //recorrido en anchura --> SE VISITAN TODOS LOS VECINOS DEL VERTICE,LUEGO SE VISITAN LOS VECINOS DE UN VECINO, CONTINÚA. . . (recorrido por grados)
		
		if (nodos.containsKey(valorInicial)) {  //se chequea que el vertice inicial exista
			Set<T> visitados = new HashSet<>(); //se crea visitados
			Queue<INodo> cola = new LinkedList<>(); //se crea cola
			Nodo nodoInicio = nodos.get(valorInicial); //se le asigna a nodoInicio de tipo Nodo el valor de ese nodo en el Map
			cola.add(nodoInicio); //como es el vertice con el que iniciamos el recorrido, ya lo agregamos a la cola
			visitados.add(valorInicial); //como es el vertice con el que iniciamos el recorrido, va a ser el primer vertice en ser visitado
			while (!(cola.isEmpty())) { //mientras la cola no esté vacía se va a seguir ejecutando el recorrido
				INodo actual = cola.poll(); //se quita el primer nodo ingresado de la cola y también se le asigna su valor a la variable actual de tipo Nodo
				System.out.print(actual.getValor() + " "); //se imprime el valor de actual (valor que sacamos de la cola)
				for (INodo vecino : ((Nodo) actual).getVecinos()) { //bucle for, por la cantidad de vertices relacionados que tiene el vertice (nodo) actual
					if (!(visitados.contains(vecino.getValor()))) { //si el vecino ya fue visitado no se entra al if, si no fue visitado si se entra
						visitados.add((T) vecino.getValor()); //ahora el vecino pasa a ser visitado, se lo agrega a visitados
						cola.add(vecino); //y se agrega un vecino pendiente a ser visitado a la cola
					}
				}
			}
		}
	}
		
	
	
	@Override
	public void dfs(T valorInicial) { //recorrido en profundidad --> primero va hacia el fondo de un camino de vecino y luego retrocede, hace lo mismo todo el recorrido 
		if (nodos.containsKey(valorInicial)) { //se chequea que el vertice inicial exista
		Set<T> visitados = new HashSet<>(); //se crea visitados
		dfsRec(nodos.get(valorInicial), visitados);
		}
	}
	
	public void dfsRec(INodo actual, Set<T> visitados) { //en este método dfsRec se lo vuelve a llamar otra vez al final de este --> recursividad, con otro vertice pasado como parametro y visitados actualizado
		visitados.add((T) actual.getValor()); //el nodo (vertice) que viene de parametro es visitado, se lo añade a visitados
		System.out.print(actual.getValor() + " "); //se imprime el vertice actual
		List<INodo> vecinos = ((Nodo) actual).getVecinos(); //se le asigna a la lista tipo INodo llamada vecinos los vecinos que tiene el vertice actual
		for (int i = vecinos.size() - 1; i >= 0; i--) { //recorrido como pila, el último que ingresa es el primero que "sale"
			INodo vecino = vecinos.get(i); //el último vecino que ingresó a la lista vecinos es el primero que tomamos
			if (!(visitados.contains(vecino.getValor()))) { //si el vecino no está en visitados se ejecuta el if
				dfsRec((Nodo) vecino, visitados); //llamada recursiva --> se vuelve a ejecutar el método ahora con otros valores en sus parametros, el vertice vecino que tomamos y los visitados, 
			}
		}
	}


	@Override
	public String toString() {
		return "Grafo [nodos=" + nodos + "]";
	}


	
	
}














