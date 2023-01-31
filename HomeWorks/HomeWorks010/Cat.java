package HomeWorks.HomeWorks010;

import java.util.Objects;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Cat o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return String.format("Кот по имени: %s\nВозрастом: %d", this.getName(), this.getAge());
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return this.name == cat.name && this.age == cat.age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
