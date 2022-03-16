package am.training.beans;

import java.util.Objects;

public class Race {

    private String name;
    private int length;
    private int horseCount;

    public Race() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHorseCount() {
        return horseCount;
    }

    public void setHorseCount(int horseCount) {
        this.horseCount = horseCount;
    }

    public Race(String name, int length, int horseCount) {
        this.name = name;
        this.length = length;
        this.horseCount = horseCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return length == race.length && horseCount == race.horseCount && Objects.equals(name, race.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, horseCount);
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", horseCount=" + horseCount +
                '}';
    }
}
