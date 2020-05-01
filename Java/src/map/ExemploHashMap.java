package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.print(campeoesMundialFifa);

        //atualiza valor
        campeoesMundialFifa.put("Brasil", 6);
        System.out.print(campeoesMundialFifa);
//
        System.out.print(campeoesMundialFifa.get("Argentina"));
//
        System.out.print(campeoesMundialFifa.containsKey("França"));
//
        campeoesMundialFifa.remove("França");
//
        System.out.print(campeoesMundialFifa.containsKey("França"));
//
        System.out.println(campeoesMundialFifa.containsValue(6));
//
        System.out.print(campeoesMundialFifa.size());
//
        System.out.print(campeoesMundialFifa);
//
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
            System.out.print(entry.getKey() + "--" + entry.getValue());
        }
        for (String key : campeoesMundialFifa.keySet()) {
            System.out.print(key + " -- " + campeoesMundialFifa.get(key));
        }
        System.out.print(campeoesMundialFifa);
//


    }
}
