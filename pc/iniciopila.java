import LCDE.LiCiDoEn;
import pilas.pilas;

public class iniciopila {
    public static void main(String[] args) {
        /*
        listasimplem listasimplem =new listasimplem();
        listasimplem.insertar(5);
        listasimplem.insertar(4);
        listasimplem.insertar(3);
        listasimplem.insertar(2);
        listasimplem.insertar(1);
        listasimplem.insertar(0);

        listasimplem.mostrar();
        listasimplem.eliminar();
        listasimplem.eliminar();
        listasimplem.mostrar();
        */
        /*
        listadoblem listadoblem=new listadoblem();
        System.out.println(listadoblem.estavacio());

        for (int i = 20 ;i > 0 ; i--) {
            listadoblem.insertar(i);

        }
        System.out.println(listadoblem.estavacio());
        listadoblem.mostraradelante();

        listadoblem.eliminar();
        listadoblem.eliminar();

        listadoblem.mostraradelante();
        listadoblem.mostraratras();


        LiciSiEn LiciSiEn= new LiciSiEn();
        System.out.println(LiciSiEn.estavacio());
        System.out.println(LiciSiEn.tamaño());
        for (int i = 1; i <=12 ; i++) {
            LiciSiEn.insertarFin(i);
        }
        LiciSiEn.mostra();
        System.out.println(LiciSiEn.tamaño());
        //LiciSiEn.eliminar();
        //LiciSiEn.eliminar();
        //LiciSiEn.mostra();
        LiciSiEn.mostraCir(2);
    }


        LiCiDoEn LiCiDoEn=new LiCiDoEn();
        System.out.println(LiCiDoEn.estavacio());
        for (int i = 1; i <=5 ; i++) {
            LiCiDoEn.insertarFin(i);

        }
        LiCiDoEn.mostrar();
        LiCiDoEn.eliminarFinal();
        LiCiDoEn.eliminarFinal();
        LiCiDoEn.mostrar();
        LiCiDoEn.mostrarAd(4);
        LiCiDoEn.mostrarAT(4);
    }

         */
        pilas pilas = new pilas();
        System.out.println(pilas.estavacio());

        for (int i = 1; i < 5; i++) {

            pilas.insertar(i);
            pilas.mostrar();
        }
        pilas.mostrar();

        pilas.eliminar();
        pilas.eliminar();
        pilas.eliminar();
        pilas.mostrar();
    }
}