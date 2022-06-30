package by.epam.study.javaintro;

import by.epam.study.javaintro.exception.TreasureNotFoundException;
import by.epam.study.javaintro.repository.InTreasureChest;
import by.epam.study.javaintro.repository.TreasureRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

/*Создать консольное приложение удовлетворяющее следующим требованиям:
1) Приложение должно быть объектно-, а не процедурно-ориентированным.
2) Каждый класс должен иметь отражающее смысл название и информативный состав.
3) Наследование должно применяться только тогда, когда это имеет смысл.
4) При кодировании должны быть использованы соглашения об оформлении кода java code convention.
5) Классы должны быть грамотно разложены по пакетам.
6) Консольное меню должно быть минимальным.
7) Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорого по стоимости сокровища и выбора
сокровищ на заданную сумму
 */
public class Main {

    private static final TreasureFactory factory = TreasureFactory.newInstance();
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.trace("Program start");
        TreasureContext ringContext = TreasureContext.of("Golden Ring", 100, TreasureType.JEWELERY);
        final Treasure ring = factory.createTreasure(ringContext);
        TreasureContext gemContext = TreasureContext.of("Ruby", 150, TreasureType.GEM);
        final Treasure ruby = factory.createTreasure(gemContext);
        //System.out.println(ring);
        //LOG.info(ring);
        ///
        TreasureRepository treasureChest = new InTreasureChest(new ArrayList<>());
        treasureChest.create(ring);
        treasureChest.create(ruby);

        for (int i = 0; i < 4; i++) {
            try {
                LOG.info(treasureChest.read(i));
            } catch (TreasureNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
