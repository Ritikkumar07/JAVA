import java.util.HashMap;

class Main4 {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Ritik", 21);
        ages.put("Raj", 22);

        System.out.println("Ritik's age: " + ages.get("Ritik"));

        for(String key : ages.keySet()) {
            System.out.println(key + " -> " + ages.get(key));
        }
    }
}
