package pc;

public class inicio {
    public static void main(String[] args) {
        cola cola =new cola();
        System.out.println(cola.estavacio());
        for (int i = 1; i <=5 ; i++) {
            cola.insertar(i);

        }
        cola.mostrar();
    }
}
