package Collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ImprimirDniMesa();
    }

    public static void ImprimirDniMesa()
    {
        Set treeSetDNI = (Set) new TreeSet<>();
        treeSetDNI.add(39742640);
        treeSetDNI.add(39742641);
        treeSetDNI.add(39742642);
        treeSetDNI.add(39742643);
        treeSetDNI.add(39742644);
        treeSetDNI.add(39742645);
        System.out.print(treeSetDNI);
    }

    public void GetListaCompras() {
        ArrayList<String> ListaCompras = new ArrayList<String>();
        ListaCompras.add("Pan");
        ListaCompras.add("Leche");
        ListaCompras.add("Harina");
        ListaCompras.add("Azucar");

        for (int i = 0; i < ListaCompras.size(); i++) {
            System.out.println(ListaCompras.get(i));
        }
    }

    public static void GetLibroPorISBN()
    {
        System.out.println("Ingrese codigo 'ISBN' A BUSCAR: ");
        Map<Long, String> catalogo = new HashMap<Long, String>();
        catalogo.put((long)1111111111, "Blanca Nieves");
        catalogo.put((long)222222222, "Caperucita Roja");
        catalogo.put((long)333333333, "100 Años de Soledad");
        catalogo.put((long)444444444, "El Codigo Da Vinci");
        Scanner reader = new Scanner(System.in);
        Long isbn = reader.nextLong();
        System.out.println("Pertenece al libro: "+catalogo.get((long)isbn));
    }

}

