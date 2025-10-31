package interfaces;

public interface INodo {
    Object getValor();
    void setValor(Object valor);
    void agregarVecino(INodo vecino);
}
