package utils;

import managment.PlankType;

import java.util.Arrays;
import java.util.List;

import static managment.PlankType.PLAIN_PLANK;
import static managment.PlankType.YELLOW_PLANK;

public class MockDb {

    private final List<PlankType> planksInHall = List.of(PLAIN_PLANK);
    private final List<PlankType> planksInWarehouse = Arrays.asList(PLAIN_PLANK, YELLOW_PLANK);

    //mock query to get only planks in shop hall.
    public List<PlankType> getPlankInShopHall() {
        return planksInHall;
    }

    //mock query to get only planks in warehouse.
    public List<PlankType> getPlanksInWarehouse() {
        return planksInWarehouse;
    }
}
