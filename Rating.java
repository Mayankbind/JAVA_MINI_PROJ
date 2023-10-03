import java.util.*;

public class Rating {
    Feedback fb = new Feedback();
    void rating(HashMap exc,HashMap good ,HashMap fair)
    {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Mrugendrasinh Rahevar");
        hm.put(2, "Dr. Ritesh Patel     ");
        hm.put(3, "Arpita Shah          ");
        hm.put(4, "Dr Ashwin Makwana    ");
        hm.put(5, "Dhaval Bhoi          ");
        hm.put(6, "Vaishali Koria       ");
        hm.put(7, "Ronak Patel          ");
        hm.put(8, "Trusha Patel         ");
        hm.put(9, "Martin Parmar        ");
        hm.put(10, "Sneha Padhiar       ");
        hm.put(11, "Deep Kothadiya      ");
        hm.put(12, "Mayuri Popat        ");
        hm.put(13, "Rikita Chokshi      ");
        //CONVERT HASHMAP TO Map.Entry
        //Map.Entry -> NESTED INTERFACE IN MAP INTERFACE
        List<Map.Entry<Integer,Integer>> exc_map=new ArrayList<>(exc.entrySet());
        //Collection.sort -> method to sort list using custom comparator
        //new Comparator-> anonymous inner class that implements Comparator interface for Map.Entry objects
        Collections.sort(exc_map, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            //compare-> overridden method to define compare logic
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());//Multiply with (-1) for ascending order
            }
        });
        System.out.println("\nFaculty\t\t\t\t\t\t\tExcellents");
        for (Map.Entry map_ent1:exc_map) {
            System.out.println(hm.get(map_ent1.getKey())+"\t\t\t"+map_ent1.getValue());
        }
        List<Map.Entry<Integer,Integer>> good_map= new ArrayList<>(good.entrySet());
        Collections.sort(good_map, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println("\nFaculty\t\t\t\t\t\t\tGood");
        for (Map.Entry map_ent2:good_map) {
            System.out.println(hm.get(map_ent2.getKey())+"\t\t\t"+map_ent2.getValue());
        }
        List<Map.Entry<Integer,Integer>> fair_map= new ArrayList<>(fair.entrySet());
        Collections.sort(fair_map, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println("\nFaculty\t\t\t\t\t\t\tFair");
        for (Map.Entry map_ent3:fair_map) {
            System.out.println(hm.get(map_ent3.getKey())+"\t\t\t"+map_ent3.getValue());
        }
    }
}
