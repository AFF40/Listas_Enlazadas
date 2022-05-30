package pilas;
public class pilas extends cola{
    @Override
    public void eliminar() {
        if (!estavacio()){
            nodo ultimo=primero;
            nodo penultimo=null;
            while(ultimo.getSiguiente()!=null){
                penultimo=ultimo;
                ultimo=ultimo.getSiguiente();
            }
            penultimo.setSiguiente(null);
        }
    }
}
