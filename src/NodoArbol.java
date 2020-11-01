
public class NodoArbol {
    int dato;
    NodoArbol hijoIzquierdo, hijoDerecho;
    
    public NodoArbol(int d){
        this.dato = d;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
    
    public String toString(){
        return ": " + dato;
    }
    
}
