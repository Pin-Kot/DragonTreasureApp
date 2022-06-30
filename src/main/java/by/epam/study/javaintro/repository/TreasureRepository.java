package by.epam.study.javaintro.repository;

import by.epam.study.javaintro.Treasure;
import by.epam.study.javaintro.exception.TreasureNotFoundException;

public interface TreasureRepository {
    void create(Treasure treasure);
    Treasure read(String name) throws TreasureNotFoundException;
    Treasure read(int index) throws TreasureNotFoundException;
    void update(Treasure treasure) throws TreasureNotFoundException;
    void delete(String name) throws TreasureNotFoundException;
}
