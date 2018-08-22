public class Task {
    private String name;
    private String opis;
    private Priority priority;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Task (String name, String opis, Priority priority){
        setName(name);
        setOpis(opis);
        setPriority(priority);
    }

    @Override
    public String toString() {
        return name + " " + opis;
    }

    public int compareTo(Task o){
        return priority.compareTo(o.priority);
    }

    public enum Priority{
        HIGH,MEDIUM,LOW;
    }
}
