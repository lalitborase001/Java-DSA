import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        private Entity entities;
//        public MapUsingHash() {
//            entities = new Entity[100];
//        }

//        public void put(String key, String value) {
//            int hash = Math.abs(key.hashCode() % entities.length);
//            entities[hash] = new Entity(key, value); // overriding
//        }
//        public String get(String key) {
//            int hash = Math.abs(key.hashCode() % entities.length);
//            if(entities[hash] != null && entities[hash].key.equals(key)) {
//                return entities[hash].value;
//            }
//            return null;
//        }
//        public void remove(String key) {
//            int hash = Math.abs(key.hashCode() % entities.length);
//            if(entities[hash] != null && entities[hash].key.equals(key)) {
//                entities[hash] = null;
//            }
//        }
//
//        private class Entity {
//            String key;
//            String value;
//
//            public Entity(String key, String value) {
//                this.key = key;
//                this.value = value;
//            }
//        }



//        String name = "Lalit";
//        Integer a = 234;
//        System.out.println(a.hashCode());

        HashMap<String , Integer> hash = new HashMap<>();
        hash.put("Lalit", 56);
        hash.put("Karan", 99);
        hash.put("Rahul", 94);

         System.out.println(hash.get("Karan"));
       // System.out.println(hash.getOrDefault("Apoorv", 78));
       // System.out.println(hash.containsKey("Karan"));
//        System.out.println(hash.get("Lalit"));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(43);
        set.add(56);
        set.add(2);

        System.out.println(set);
    }


}