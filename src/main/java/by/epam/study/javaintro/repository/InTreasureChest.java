package by.epam.study.javaintro.repository;

import by.epam.study.javaintro.Treasure;
import by.epam.study.javaintro.exception.TreasureNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class InTreasureChest implements TreasureRepository {
    private static final String TREASURE_NOT_FOUND_BY_NAME_MSG = "Treasure with name %s not found";
    private static final String TREASURE_NOT_FOUND_BY_INDEX_MSG = "Treasure with index %s not found";
    private final List<Treasure> treasureChest;

//    {
//        treasureChest = new ArrayList<>();
//    }

    public InTreasureChest(List<Treasure> treasureChest) {
        this.treasureChest = treasureChest;
    }


    @Override
    public void create(Treasure treasure) {
        this.treasureChest.add(treasure);
    }

    @Override
    public Treasure read(String name) throws TreasureNotFoundException {
        final Treasure treasure = findTreasureByName(name);
        if (treasure == null) {
            throw new TreasureNotFoundException(String.format(TREASURE_NOT_FOUND_BY_NAME_MSG, name));
        }
        return treasure;
    }

    @Override
    public Treasure read(int index) throws TreasureNotFoundException {
        if (index < treasureChest.size()) {
            return treasureChest.get(index);
        }
        throw new TreasureNotFoundException(String.format(TREASURE_NOT_FOUND_BY_INDEX_MSG, index));
    }

    @Override
    public void update(Treasure treasure) throws TreasureNotFoundException {
        final Treasure savedTreasure = this.read(treasure.getName());
        final int treasureIndex = treasureChest.indexOf(savedTreasure);
        treasureChest.add(treasureIndex, treasure);
    }

    @Override
    public void delete(String name) throws TreasureNotFoundException {
        final Treasure treasure = read(name);
        treasureChest.remove(treasure);
    }


    private Treasure findTreasureByName(String name){
        for (Treasure treasure : treasureChest) {
            if (treasure.getName().equals(name)) {
                return treasure;
            }
        }
        return null;
    }
}
