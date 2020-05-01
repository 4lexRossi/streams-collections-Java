package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String proximoCliente = filaBanco.poll(); //mostra e remove 1elemento
        System.out.println(proximoCliente);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek(); //mostra e não remove 1 elemento
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element(); //mostra e não remove 1 elemento se não tem mostra erro
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String client: filaBanco) {
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.print("---->" + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("wesley");
    }

}
