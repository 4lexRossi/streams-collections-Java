package optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivo {

    public static void main(String[] args) {

        System.out.println("***Valor inteiro opciona***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***Valor decimal opciona***");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("***Valor longo opciona***");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }

}
