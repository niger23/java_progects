package HomeWorks.HomeWorks006;

public class Laptop {
    String name;
    int ram;
    int hdd;
    String os;
    String colour;
    double screan;

    @Override
    public String toString() {
        return String.format("Марка: %s\nRAM: %d Gb\nHDD: %d Gb\nOS: %s\nColour: %s\nScrean: %s''\n", name, ram, hdd, os, colour, screan);
    }
    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    
    public String getOS() {
        return os;
    }

    
    public String getColour() {
        return colour;
    }

}
