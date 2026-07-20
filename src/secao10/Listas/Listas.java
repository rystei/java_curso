package secao10.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Telles");
        list.add("Giovanne");
        list.add("Rafael");
        list.add("Gustavo");
        list.add("User");
        list.add(2, "Usuario");

        System.out.println(list.size());

        for (String lists : list) {
            System.out.println(lists);
        }

        System.out.println("---------------------------");

        list.removeIf( lists -> lists.charAt(0) == 'G');

        for (String lists : list) {
            System.out.println(lists);
        }

        System.out.println("---------------------------");

        System.out.println("indexOf Rafael: " + list.indexOf("Rafael"));
        System.out.println("indexOf Gustavo: " + list.indexOf("Gustavo"));

        System.out.println("---------------------------");
        List<String> resultado = list.stream().filter(lists -> lists.charAt(0) == 'U').collect(Collectors.toList());
        for (String lists : resultado) {
            System.out.println(lists);
        }

        System.out.println("---------------------------");
        String name = list.stream().filter(lists -> lists.charAt(3) == 'r').findFirst().orElse(null);
        System.out.println(name);
    }
}
