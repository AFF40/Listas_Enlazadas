package dobleenlace;

public class listadoblem {
    nodo inicio;

    public listadoblem() {
        inicio = null;
    }

    public boolean estavacio() {
        return inicio == null;
    }

    public void insertar(Object dato) {
        if (estavacio()) {
            nodo nuevo = new nodo(null, dato, null);
            inicio = nuevo;
        } else {
            nodo nuevo = new nodo(null, dato, inicio);
            inicio.setAnterio(nuevo);
            inicio = nuevo;
        }

    }

    public void eliminar() {
        if (!estavacio()) {
            if (inicio.getSiguiente() == null) {
                inicio=inicio.getSiguiente ();
            } else {

            inicio = inicio.getSiguiente();
            inicio.setAnterio(null);
            }

        }
    }

    public void mostraradelante(){
        if(!estavacio()){
            nodo temp=inicio;
            while(temp!=null){
                System.out.print(temp.getDato()+"    ");
                temp=temp.getSiguiente();
            }
            System.out.println();
        }
    }
    public void mostraratras(){
        if(!estavacio()){
            nodo ultimo=inicio;
            while(ultimo.getSiguiente()!=null){
                ultimo=ultimo.getSiguiente();
            }
            nodo temp= ultimo;
            while(temp!=null){
                System.out.print(temp.getDato()+ "    ");
                temp=temp.getAnterio();
            }
        }
    }
}

