package pc;

import lse.listaSimple;
import lse.nodo;

public class cola extends listaSimple {
    @Override
    public void insertar(Object dato) {
        if (estavacio()){
            nodo nuevo=new nodo(dato,null);
            primero=nuevo;
        }else {
            nodo ultimo = primero;
            while (ultimo.getSiguiente()!=null){
                ultimo=ultimo.getSiguiente();
            }
            nodo nuevo =new nodo(dato,null);
            ultimo.setSiguiente(nuevo);
        }

    }
}
