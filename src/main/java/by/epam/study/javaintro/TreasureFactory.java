package by.epam.study.javaintro;

interface TreasureFactory {
    Treasure createTreasure(TreasureContext context);
    static TreasureFactory newInstance() {
        return new PrizeFactory();
    }
}
