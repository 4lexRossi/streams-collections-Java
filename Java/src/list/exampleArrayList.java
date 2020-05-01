package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class exampleArrayList {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();

        nomes.add("Davi");
        nomes.add("Estevão");
        nomes.add("Elis");
        nomes.add("Alex");
        nomes.add("Maria");
        nomes.add("Anderson");

        System.out.println(nomes);

        nomes.set(4, "Maria");
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.remove(5);
        System.out.println(nomes);

        nomes.remove("Maria");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        int posicao = nomes.indexOf("Davi");
        System.out.println(posicao);

        int existePosicao = nomes.indexOf("Wesley");
        System.out.println(existePosicao);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temEstevao = nomes.contains("Estevão");
        boolean temCeni = nomes.contains("Ceni");
        System.out.println(temEstevao);
        System.out.println(temCeni);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes) {

            System.out.println("-->" + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()) {
            System.out.println("--->" + iterator.next());
        }

        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes) {

            System.out.println("-->" + nomeDoItem);
        }
    }
}
