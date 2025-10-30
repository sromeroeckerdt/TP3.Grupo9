package modelo;

import java.util.ArrayList;
import java.util.List;
import interfaces.INodo;

public class Nodo implements INodo {

    private int valor;

    public Nodo(int valor) {
		this.valor = valor;
	}

	public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void agregarVecino(INodo vecino) {
       
    }
}

