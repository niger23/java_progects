package Seminars.Seminar006;

import java.util.Objects;

public class Cat {
    String name;
    String color;
    String owner;
    String diagnosis;
    int age;
    int id;


    @Override
    public String toString() {
        return String.format("Имя: %s\nЦвет: %s\nВозраст: %d\nХозяин: %s\n", name, color, age, owner);
    }
    @Override
    public boolean equals(Object o) {
        var t = (Cat) o;
        return id == t.id && name == t.name 
                && color == t.color && owner == t.owner 
                && diagnosis == t.diagnosis && age ==t.age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name,color,owner,diagnosis, age, id);
    }
}
