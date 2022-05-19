package org.example.javaproblem.chapter5.p109_unmodified_immutable_collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static final List<Integer> LIST = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5));
    // OR
    private static final List<Integer> INTEGER_LIST = List.of(1, 2, 3, 4, 5);

    private final MutableMelon melon1 = new MutableMelon("Crenshaw", 2000);
    private final MutableMelon melon2 = new MutableMelon("Gac", 1200);

    // Unmodified and Mutable
    private static final MutableMelon MELON_ONE = new MutableMelon("Crenshaw", 2000);
    private static final MutableMelon MELON_TWO = new MutableMelon("Gac", 1200);

    private final List<MutableMelon> list = Collections.unmodifiableList(Arrays.asList(melon1, melon1));
    // OR
    private final List<MutableMelon> listOf = List.of(melon1, melon1);
    private static final List<MutableMelon> LIST_OF = List.of(MELON_ONE, MELON_TWO);

    private final List<MutableMelon> mutableMelonList = Collections.unmodifiableList(Arrays.asList(
            new MutableMelon("Crenshaw", 2000),
            new MutableMelon("Gac", 1200)
    ));

    // Unmodified and Immutable
    private static final ImmutableMelon IMMUTABLE_MELON_ONE = new ImmutableMelon("Crenshaw", 2000);
    private static final ImmutableMelon IMMUTABLE_MELON_TWO = new ImmutableMelon("Gac", 1200);
    private static final List<ImmutableMelon> IMMUTABLE_LIST_OF = List.of(IMMUTABLE_MELON_ONE, IMMUTABLE_MELON_TWO);
    private static final List<ImmutableMelon> IMMUTABLE_LIST = Collections.unmodifiableList(Arrays.asList(IMMUTABLE_MELON_ONE, IMMUTABLE_MELON_TWO));

    public static void main(String... args) {
        Main main = new Main();
        main.melon1.setWeight(0);
        main.melon2.setWeight(0);
        System.out.println("main.melon1 = " + main.melon1);

        System.out.println("============== Unmodified and Mutable ==============");
        MutableMelon mutableMelon1 = LIST_OF.get(0);
        MutableMelon mutableMelon2 = LIST_OF.get(1);
        System.out.println("LIST_OF before = " + LIST_OF);
        mutableMelon1.setWeight(666);
        mutableMelon2.setWeight(666);
        System.out.println("LIST_OF after = " + LIST_OF);

        System.out.println("============== Unmodified and Immutable ==============");
        ImmutableMelon immutableMelon1 = IMMUTABLE_LIST_OF.get(0);
        ImmutableMelon immutableMelon2 = IMMUTABLE_LIST_OF.get(1);
        System.out.println("immutableMelon1 = " + immutableMelon1);
        System.out.println("immutableMelon2 = " + immutableMelon2);
    }
}


class Main2 {

    public static void main(String... args) {
        Collections.emptyList();
        Collections.emptySet();
        Collections.emptyMap();

        MutableMelon melon = new MutableMelon("Golo", 2000);
        Collections.singletonList(melon);
        Collections.singletonMap(melon.getType(), melon.getWeight());

        // unmodified
        Map<Integer, MutableMelon> mapOfSingleton = Collections.singletonMap(1, new MutableMelon("Monok", 2500));

        // immutable
        Map<Integer, ImmutableMelon> mapOfSingletonImmutable = Collections.singletonMap(1, new ImmutableMelon("Maiman", 3000));

        Map<Integer, MutableMelon> mapOfMelon = Map.ofEntries(
                Map.entry(1, new MutableMelon("Apollo", 3000)),
                Map.entry(2, new MutableMelon("Jade Dew", 3500)),
                Map.entry(3, new MutableMelon("Cantaloupe", 4500))
        );
        System.out.println("mapOfMelon ========== " + mapOfMelon);

        Map<Integer, ImmutableMelon> mapOfImmutableMelon = Map.ofEntries(
                Map.entry(1, new ImmutableMelon("Apollo", 3000)),
                Map.entry(2, new ImmutableMelon("Jade Dew", 3500)),
                Map.entry(3, new ImmutableMelon("Cantaloupe", 4500))
        );
        System.out.println("mapOfImmutableMelon = " + mapOfImmutableMelon);

        Map<Integer, ImmutableMelon> copyOf = Map.copyOf(mapOfImmutableMelon);
        System.out.println("copy OF ============= " + copyOf);
    }
}

class MainImmutableArray {
    public static void main(String... args) {
        ImmutableArray<String> sample = ImmutableArray.from(new String[]{"a", "b", "c"});
        System.out.println("sample before = " + sample);
        System.out.println("sample after = " + sample);
    }
}

class MapDefault {
    public static void main(String... args) {
        Map<String, String> map = new HashMap<>();

        map.put("postgresql", "127.0.0.1:5432");
        map.put("mysql", "192.168.0.50:3306");
        map.put("cassandra", "192.168.1.5:9042");

        //map.remove("cassandra", "192.168.1.5:9042");
        map.entrySet().removeIf(entry -> entry.getKey().equals("cassandra"));
        System.out.println("map = " + map);

        String hp1 = map.getOrDefault("derby", "69:89.31.226:27017");
        String hp2 = map.getOrDefault("mongo", "69:89.31.226:27017");

        System.out.println("hp1 derby: " + hp1);
        System.out.println("hp2 mongo: " + hp2);
    }
}
