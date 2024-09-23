package ParkingLot.Model.Strategy;

import ParkingLot.Exceptions.NoFreeSlotAvailableException;

import java.util.TreeSet;

public class NaturalOrderParkingStrategy implements ParkingStrategy{
    TreeSet<Integer> slotTreeSet;

    public NaturalOrderParkingStrategy(){
        this.slotTreeSet = new TreeSet<>();
    }
    @Override
    public void addSlot(Integer slotNumber) {
        this.slotTreeSet.add(slotNumber);
    }

    @Override
    public void removeSlot(Integer slotNumber) {
        this.slotTreeSet.remove(slotNumber);
    }

    @Override
    public Integer getNextSlot() {
        if(slotTreeSet.isEmpty()){
            throw new NoFreeSlotAvailableException();
        }
        return this.slotTreeSet.first();
    }
}
