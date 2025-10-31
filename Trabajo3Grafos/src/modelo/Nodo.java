package modelo;

import java.util.ArrayList;
import java.util.List;
import interfaces.INodo;

public class Nodo implements INodo {

    private Object valor;
    private ArrayList<INodo> vecinos;

    public Nodo(Object valor) {
		this.valor = valor;
		this.vecinos = new ArrayList<INodo>();
	}

    

    public Object getValor() {
		return valor;
	}



	public void setValor(Object valor) {
		this.valor = valor;
	}



	public ArrayList<INodo> getVecinos() {
		return vecinos;
	}

	public void setVecinos(ArrayList<INodo> vecinos) {
		this.vecinos = vecinos;
	}

	public void agregarVecino(INodo vecino) {
    	if (!(vecinos.contains(vecino))) {
    		vecinos.add(vecino);
    	}
       
    }

    
    
    
}

