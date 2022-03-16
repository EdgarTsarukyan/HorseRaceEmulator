package am.training.beans;

import java.util.Objects;

public class HorseRider {
    private String name;
    private String surName;
    private int age;

    public HorseRider(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HorseRider{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HorseRider that = (HorseRider) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(surName, that.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age);
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HorseRider() {
    }
}
