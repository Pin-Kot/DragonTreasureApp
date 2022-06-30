package by.epam.study.javaintro;

import by.epam.study.javaintro.entity.*;

public class PrizeFactory implements TreasureFactory {

    public static final String TYPE_OF_TREASURE_DOES_NOT_EXIST_MSG = "This type of Treasure doesn't exist";

    public Treasure  createTreasure(TreasureContext context) {
        Treasure treasure;
        switch (context.getType()) {
            case JEWELERY:
                treasure = new Jewelery(context.getName(), context.getValue(), context.getType());
                break;
            case GEM:
                treasure = new Gem(context.getName(), context.getValue(), context.getType());
                break;
            case TABLEWARE:
                treasure = new Tableware(context.getName(), context.getValue(), context.getType());
                break;
            case FABRIC:
                treasure = new Fabric(context.getName(), context.getValue(), context.getType());
                break;
            case ARMORY:
                treasure = new Armory(context.getName(), context.getValue(), context.getType());
                break;
            case GARMENT:
                treasure = new Garment(context.getName(), context.getValue(), context.getType());
                break;
            case COIN:
                treasure = new Coin(context.getName(), context.getValue(), context.getType());
                break;
            default:
                throw new IllegalArgumentException(TYPE_OF_TREASURE_DOES_NOT_EXIST_MSG);
        }
        return treasure;
    }

}
