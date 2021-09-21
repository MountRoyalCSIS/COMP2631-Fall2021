import java.util.*;

public class ADTs {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("word");

        for(int i = 0; i < list.size(); i++) {
            System.out.println("list[" + i + "] = " + list.get(i));
        }
        System.out.println("========================");

        list.add(0, "first");

        for(int i = 0; i < list.size(); i++) {
            System.out.println("list[" + i + "] = " + list.get(i));
        }
        System.out.println("========================");

        Set<String> set = new HashSet<>();

        set.add("pig");
        set.add("aardvark");
        set.add("cow");
        set.add("zebra");
        set.add("SUV");

        for(String animal : set) {
            System.out.println("Found a " + animal);
        }
        System.out.println("========================");

        set.remove("cow");
        set.remove("duck");

        if (set.contains("pig")) {
            System.out.println("pig is in the set");
        } else {
            System.out.println("pig is not in the set");
        }

        if (set.contains("cow")) {
            System.out.println("cow is in the set");
        } else {
            System.out.println("cow is not in the set");
        }
        System.out.println("========================");

        Map<String, Integer> likability = new TreeMap<>();

        likability.put("aardvark", 42);
        likability.put("pig", 12);

        likability.put("pig", 23);

        System.out.println("pig has a likability of " + likability.get("pig"));
    }
}