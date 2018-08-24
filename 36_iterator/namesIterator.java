import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class namesIterator {
    public static void main(String[] args) {
        Map<String,String> names = new TreeMap<>();

        names.put("Kowalski", "Adam Kowalski -1");
        names.put("Adamiak", "Ania Adamiak - 21");
        names.put("Zaręba", "Adam Zaręba - 17");
        names.put("Piotrowski", "Karol Piotrowski - 42");
        names.put("Bobrowska", "Michalina Bobrowska - 15");

        Iterator<String>valuesIterator = names.values().iterator();
        while (valuesIterator.hasNext()){
            System.out.println(valuesIterator.next());
        }
    }
}
