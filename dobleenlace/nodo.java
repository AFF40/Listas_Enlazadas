package dobleenlace;

public class nodo {
    private nodo anterio;
    private Object dato;
    private nodo siguiente;

    public nodo(nodo anterio, Object dato, nodo siguiente) {
        this.setAnterio(anterio);
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }

    public nodo getAnterio() {
        return anterio;
    }

    public void setAnterio(nodo anterio) {
        this.anterio = anterio;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}
