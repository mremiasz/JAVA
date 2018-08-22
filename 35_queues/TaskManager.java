import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        Scanner sc = new Scanner(System.in);
        tm.mainLoop(sc);
    }

    private void printOptions() {
        for (Option o: Option.values()){
            System.out.println(o);
        }
    }

    private void mainLoop(Scanner sc) {
        Queue<Task>taskQueue = new PriorityQueue<>();

        Option next = null;
        while (next == null || next != Option.EXIT){
            printOptions();
            next = Option.createFromInt(sc.nextInt());
            sc.nextLine();
            switch (next){
                case ADD:
                    taskQueue.offer(readAndCreateTask(sc));
                    break;
                case TAKE:
                    takeTask(taskQueue.poll());
                    break;
                case EXIT:
                    System.out.println("Wyłącznie aplikacji.");
            }
        }
    }

    private void takeTask(Task poll) {
        System.out.println("Zadanie do wykonania: ");
        System.out.println(poll);
    }

    private Task readAndCreateTask(Scanner sc) {
        System.out.println("Podaj nazwę zadania: ");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania: ");
        String opis = sc.nextLine();
        System.out.println("Podaj priorytet (LOW, MEDIUM, HIGH): ");
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Zadanie zostało dodane");
        
        return new Task(name, opis, priority);
    }

    private enum Option {
        ADD(0,"Dodaj zadanie"),TAKE(1,"Zrób kolejne zadanie"),EXIT(2,"Wyjdź");

        int option;
        String opis;

        Option(int opt, String opis){
            this.option=opt;
            this.opis= opis;
        }

        static Option createFromInt(int option){
            return Option.values()[option];
        }

        @Override
        public String toString() {
            return option + " " + opis;
        }
    }
}
