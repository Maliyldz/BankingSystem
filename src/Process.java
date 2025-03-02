//200101066
//210101033

public class Process implements Comparable<Process> {

    private int id;
    private String name;
    private int priority;

    
    public Process(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Process o) {
        return Integer.compare(this.priority, o.getPriority());
    }

    @Override
    public String toString() {
        return "Process{id=" + id + ", name='" + name + "', priority=" + priority + "}";
}
}
