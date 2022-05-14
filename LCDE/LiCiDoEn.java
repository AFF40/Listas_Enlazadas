package LCDE;

public class LiCiDoEn {
    Nodo inicio;
    public LiCiDoEn(){
        inicio=null;
    }
    public boolean estavacio(){
        return inicio==null;
    }
    public void insertarFin(Object dato){
        if (estavacio()){
            Nodo nuevo= new Nodo();
            nuevo.setAnterior(nuevo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);
            inicio=nuevo;
        }else{
            Nodo ultimo=inicio;
            while(ultimo.getSiguiente()!=inicio){
                ultimo=ultimo.getSiguiente();
            }
            Nodo nuevo= new Nodo();
            nuevo.setAnterior(ultimo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);
            ultimo.setSiguiente(nuevo);
            inicio.setAnterior(nuevo);
        }
    }
    public void eliminarFinal(){
        if (!estavacio()){
            Nodo ultimo=inicio;
            while(ultimo.getSiguiente()!=inicio){
                ultimo=ultimo.getSiguiente();
            }
            Nodo penultimo= ultimo.getAnterior();
            penultimo.setSiguiente(inicio);
            inicio.setAnterior(penultimo);

        }
    }
    public void mostrar(){
        if (!estavacio()){
            Nodo temp=inicio;
            while(temp.getSiguiente()!=inicio ){
                System.out.print(temp.getDato()+"     ");
                temp=temp.getSiguiente();

            }
            System.out.print(temp.getDato()+"     ");
        }
    }
    public void mostrarAd(int vueltas){
        if (!estavacio()){
            Nodo temp=inicio;
            int cont=0;
            while(cont<vueltas){
                if(temp.getSiguiente()==inicio){
                    cont++;
                }
                System.out.print(temp.getDato()+"     ");
                temp=temp.getSiguiente();

            }
            System.out.println();
        }
    }
    public void mostrarAT(int vueltas){
        if (!estavacio()){
            Nodo temp=inicio.getAnterior();
            int cont=0;
            while(cont<vueltas){
                if(temp.getAnterior()==inicio){
                    cont++;
                }
                System.out.print(temp.getDato()+"     ");
                temp=temp.getSiguiente() ;

            }
            System.out.println(temp.getDato());
        }
    }
}
