package streamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");
        //contagem dos elementos
        System.out.println("Contagem: " + estudantes.stream().count());

        //elemento mais letras
        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //elemento menos letras
        System.out.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //elementos com a letra R
        System.out.println("Com a letra r: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //nova coleção - nomes concatenados a quantidade de letras
        System.out.println("Nova coleção concat letras: " + estudantes.stream().map((estudante) ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //retorna 3 primeiros elementos
        System.out.println("3 primeiros: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //exibe e retorna
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //exibe sem retornar
        System.out.println("Retorna os elementos apenas: ");
        estudantes.stream().forEach(System.out::println);

        //retorna true se tiver letra W
        System.out.println("Todos os elementos contem letra W? " + estudantes.stream().allMatch((elemento) ->
                elemento.contains("W")));

        //retorna true se conter letra minuscula
        System.out.println("Existe elementos com letra 'a' minuscula? " + estudantes.stream().anyMatch((elemento) ->
                elemento.contains("a")));

        //retorna true se não conter letra minuscula
        System.out.println("Não existe elementos com letra 'a' minuscula? " + estudantes.stream().noneMatch((elemento) ->
                elemento.contains("a")));

        //retorna 1º elemento
        System.out.println("Retorna 1º elemento: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
            //    .collect(Collectors.toList()));
             //        .collect(Collectors.joining(", ")));
            //       .collect(Collectors.toSet()));
                   .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));
    }

}
