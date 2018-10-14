import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Queue <T> {

    private ArrayList<Entry<T>> list = new ArrayList<>();

    public static void main(String[] args) {
        Queue<String> kolejka = new Queue<>();
        kolejka.put("nowak", 5);
        kolejka.put("marciniak", 3);
        kolejka.put("borowski", 2);
        kolejka.put("xing", 1);
        kolejka.put("bing", 10);
        System.out.println("...");
        for (Queue.Entry<String> entry : kolejka.entrySet()) {
            System.out.println("Priorytet: " + entry.getPriority() + "\t login: " + entry.getValue());
        }

        kolejka.put("plusa",66);

        System.out.println("...............Dopisany Plusa.............");
        for (Queue.Entry<String> entry : kolejka.entrySet()) {
            System.out.println("Priorytet: " + entry.getPriority() + "\t login: " + entry.getValue());
        }

        System.out.println("...............Element z najwyższym priorytetem.............");
        System.out.println("Osoba z najwyzszym priorytetem: " + kolejka.peek().getValue()); //drukuje element o najwyższym priorytecie
        kolejka.pop();

        System.out.println("...............Usuniety element z najwyzszym priorytetem.............");
        for (Queue.Entry<String> entry : kolejka.entrySet()) {
            System.out.println("Priorytet: " + entry.getPriority() + "\t login: " + entry.getValue());
        }
    }

    private void pop() {
        list.remove(0);
    }

    public Entry<T> peek() {
        return list.get(0);
    }

    private ArrayList<Entry<T>> entrySet() {
        return list;
    }

    public void put(T value, int priority) {
        list.add(new Entry<>(value, priority));
        //Collections.sort(list, (t2, t1) -> t2.getPriority().compareTo(t1.getPriority())
        Collections.sort(list, Comparator.comparingInt(Entry::getPriority)
        );
    }

    public static class Entry<T> {
        private final int priority;
        private final T value;

        public Entry(T value, int priority) {
            //konstruktory
            this.priority = priority;
            this.value = value;
        }

        public int getPriority() {
            return priority;
        }

        public T getValue() {
            return value;
        }
    }
}