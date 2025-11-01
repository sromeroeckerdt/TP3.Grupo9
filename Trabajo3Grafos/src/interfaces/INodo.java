package interfaces;

public interface INodo<T> {
	
	//Pre-Condición:
	//Post-Condición:
    T getValor();
    
    //Pre-Condición:
  	//Post-Condición:
    void setValor(T valor);
    
    //Pre-Condición:
  	//Post-Condición:
    void agregarVecino(INodo vecino);
}
