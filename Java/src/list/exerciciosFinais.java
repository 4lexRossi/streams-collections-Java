package list;

import java.util.*;

public class exerciciosFinais {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Roberto");
        System.out.println(nomes);

        System.out.println(nomes.get(1));

        nomes.remove(4);
        nomes.remove("João");

        int tamanho = nomes.size();
        System.out.print(tamanho);

        boolean temJuliano = nomes.contains("Juliano");
        System.out.print(temJuliano);

        List<String> newNomes = new ArrayList<>();

        newNomes.add("Ismael");
        newNomes.add("Rodrigo");

        ArrayList mergeList = new ArrayList(nomes.size() + newNomes.size());
        mergeList.addAll(nomes);
        mergeList.addAll(newNomes);
        System.out.println("Merge listas = " + mergeList);

        boolean listaEstaVazia = mergeList.isEmpty();
        System.out.println(listaEstaVazia);

        mergeList.clear();
        boolean listaVazia = mergeList.isEmpty();
        System.out.println(listaVazia);


    }
}