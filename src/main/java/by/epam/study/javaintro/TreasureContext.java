package by.epam.study.javaintro;

public interface TreasureContext {
    TreasureType getType();
    String getName();
    int getValue();

    static TreasureContext of(String name, int value, TreasureType type) {
        return new PrizeContext(name, value, type);
    }
}
