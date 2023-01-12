package Lesson;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("%s %s %d %d", firstName, lastName, salary, id);
    }
    @Override
    public boolean equals(Object o) {
        var t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }
    @Override
    public int hashCode() {
        return id;
    }
}
