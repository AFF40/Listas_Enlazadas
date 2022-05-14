package lse;


public class listasimplem {
    nodo primero;
    public listasimplem(){
        primero = null;
    }

    public boolean estavacio(){
        return primero==null;

    }
    public void insertar (Object dato){
        if(estavacio()){
            nodo nuevo= new nodo(dato,null);
        primero=nuevo;
        }else {
        nodo nuevo=new nodo(dato,primero);
        primero=nuevo;
        }
    }
    public void eliminar(){
        if(!estavacio()){
            primero=primero.getSiguiente();
        }
    }
    public void mostrar(){
        nodo temp=primero;
        while(temp!=null){
            System.out.print(temp.getDato()+"   ");
            temp=temp.getSiguiente();

        }
        System.out.println("");
    }
}
