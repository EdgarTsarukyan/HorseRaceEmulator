package am.training.beans;

import java.util.Objects;

public class Horse {

    private String name;
    private String breed;
    private HorseRider horseRider;

    public Horse() {
    }

    public Horse(String name, String breed, HorseRider horseRider) {
        this.name = name;
        this.breed = breed;
        this.horseRider = horseRider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public HorseRider getHorseRider() {
        return horseRider;
    }

    public void setHorseRider(HorseRider horseRider) {
        this.horseRider = horseRider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(name, horse.name) && Objects.equals(breed, horse.breed) && Objects.equals(horseRider, horse.horseRider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, horseRider);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", horseRider=" + horseRider +
                '}';
    }
}
