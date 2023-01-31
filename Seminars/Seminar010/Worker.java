package Seminars.Seminar010;

public class Worker {
    private int id;
    private String name;

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return String.format("ID: %d\nName: %s", this.getId(), this.getName());
    }
}
