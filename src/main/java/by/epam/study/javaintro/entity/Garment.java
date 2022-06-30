package by.epam.study.javaintro.entity;

import by.epam.study.javaintro.Treasure;
import by.epam.study.javaintro.TreasureType;

import java.util.Objects;

public class Garment implements Treasure {
    private final String name;
    private final int value;
    private final TreasureType type;

    public Garment(String name, int value, TreasureType type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public TreasureType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garment garment = (Garment) o;
        return value == garment.value &&
                Objects.equals(name, garment.name) &&
                type == garment.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, type);
    }

    @Override
    public String toString() {
        return "Treasure {" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", type=" + type + '\'' +
                '}';
    }
}
