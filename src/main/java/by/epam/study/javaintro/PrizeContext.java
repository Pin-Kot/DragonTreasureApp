package by.epam.study.javaintro;

public class PrizeContext implements TreasureContext {

    private final TreasureType type;
    private final String name;
    private final int value;

    PrizeContext(String name, int value, TreasureType type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public TreasureType getType(){
        return type;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
