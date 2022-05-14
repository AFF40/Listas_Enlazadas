package LCSE;

public class LiciSiEn {
    private Nodo inicio;
    public LiciSiEn(){
        inicio=null;
    }

    public boolean estavacio(){
        return inicio==null;
    }
    public int tamaño(){
        int cont=0;
        if(!estavacio()){
            Nodo ultimo=inicio;
            while (ultimo.getSiguiente()!=inicio){
                ultimo=ultimo.getSiguiente();
                cont++;
            }
            cont++;
        }
        return cont;
    }
    public void insertarFin(Object dato){
        if(estavacio()){
            Nodo nuevo=new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);
            inicio = nuevo;
        }else{
            Nodo nuevo=new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            Nodo ultimo=inicio;
            while (ultimo.getSiguiente()!=inicio){
                ultimo=ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nuevo);
        }
    }
    public void eliminar(){
        if (!estavacio()){
            Nodo penultimo=inicio;
            while (penultimo.getSiguiente().getSiguiente()!=inicio){
                penultimo=penultimo.getSiguiente();
            }
            penultimo.setSiguiente(inicio);
        }
    }
    public void mostra(){
        if(!estavacio()){
            Nodo ultimo=inicio;
            while (ultimo.getSiguiente()!=inicio){
                System.out.print(ultimo.getDato()+"    ");
                ultimo=ultimo.getSiguiente();
            }
            System.out.print(ultimo.getDato()+"    ");
            System.out.println();
        }
    }
    public void mostraCir(int vueltas){
        if(!estavacio()){
            int cont2=0;
            Nodo temp=inicio;
            while (temp.getSiguiente()!=null && cont2<tamaño()){
                System.out.print(temp.getDato()+"    ");
                temp=temp.getSiguiente();
            cont2++;
            }

            System.out.println();
        }
    }
}
